package org.example.testsuite;

import org.example.customlistners.CustomListeners;
import org.example.pages.*;
import org.example.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class BankTest extends TestBase {
    AccountPage accountPage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomerLoginPage customerLoginPage;
    CustomerPage customerPage;
    HomePage homePage;
    OpenAccountPage openAccountPage;

    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void inIt(){
        accountPage=new AccountPage();
        addCustomerPage=new AddCustomerPage();
        bankManagerLoginPage=new BankManagerLoginPage();
        customerLoginPage=new CustomerLoginPage();
        customerPage=new CustomerPage();
        homePage=new HomePage();
        openAccountPage=new OpenAccountPage();
    }

   @Test(groups = {"smoke"})
    public void bankManagerShouldAddCustomerSuccessfully(){
        homePage.clickOnManagerLoginLink();
        bankManagerLoginPage.clickOnAddCustomerTab();

        addCustomerPage.enterFirstName("Kishan");
        addCustomerPage.enterLastName("patel");
        addCustomerPage.enterPostCode("01545");
        addCustomerPage.clickOnAddCustomerBt();


    }

    @Test(groups = {"smoke"})
    public void bankManagerShouldOpenAccountSuccessfully(){
        homePage.clickOnManagerLoginLink();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomerName("Harry Potter");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
    }

    @Test(groups = "sanity")
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginLink();
        openAccountPage.selectCustomerName("Harry Potter");
        Thread.sleep(1000);
        customerLoginPage.clickLoginButton();
        customerLoginPage.clickOnLogout();
    }

    @Test(groups = "sanity")
    public void  customerShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLoginLink();
        customerLoginPage.selectYourName("Harry Potter");
        accountPage.clickOnDepositButton();
        accountPage.enterAmountToDeposit(500);
        accountPage.clickDepositFeature();
        accountPage.getTextDepositSuccessfulMessage();
    }

    @Test(groups = "regression")
    public void  customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginLink();
        openAccountPage.selectCustomerName("Harry Potter");
        customerLoginPage.clickLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmountToDeposit(500);
        accountPage.clickDepositFeature();
        accountPage.clickOnWithdrawalTab();
        Thread.sleep(1000);
        accountPage.enterAmountToWithdraw("10");
        accountPage.clickOnWithdrawFeature();
        accountPage.getTextTransaction();

    }

}
