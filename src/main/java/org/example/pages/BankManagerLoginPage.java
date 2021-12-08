package org.example.pages;

import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    public BankManagerLoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement addCustomerTab;

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement openAccountTab;

    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    WebElement customersTab;

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeBtLink;

    public void clickOnAddCustomerTab(){
        Reporter.log("Clicking On Add Customer Tab :" +addCustomerTab.toString() + "<br>");

        clickOnElement(addCustomerTab);


    }
    public void clickOnOpenAccountTab(){
        Reporter.log("Clicking On Open Account Tab :" +openAccountTab.toString() + "<br>");
        clickOnElement(openAccountTab);

    }
    public void clickOnCustomerTab(){
        Reporter.log("Clicking On Customer Tab :" +customersTab.toString() + "<br>");
        clickOnElement(customersTab);

    }
    public void clickOnHomeBt(){
        Reporter.log("Clicking On Home Button :" +homeBtLink.toString() + "<br>");
        clickOnElement(homeBtLink);

    }


}
