package org.example.pages;

import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement depositLink;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement depositBtn;

    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositMsg;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement setAmount;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement withdraw;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement withdrawBtn;

    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement withdrawText;

    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logOutBtn;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement errorMessage;

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeBtLink;


    public void clickOnHomeBtn() {
        Reporter.log("Clicking On Home Button :" + homeBtLink.toString() + "<br>");
        clickOnElement(homeBtLink);

    }

    public void clickOnDepositButton() {
        Reporter.log("Clicking On Deposit Button :" + depositLink.toString() + "<br>");
        clickOnElement(depositLink);
    }

    public void enterAmountToDeposit(int amount) {
        Reporter.log("Entering Amount To Deposit : " + amount + "in deposit field : " + setAmount.toString() + "<br>");
        sendTextToElement(this.setAmount, String.valueOf(amount));

    }

    public void clickDepositFeature() {
        Reporter.log("Clicking on Deposit Button :" + depositBtn.toString() + "<br>");
        clickOnElement(depositBtn);

    }

    public String getTextDepositSuccessfulMessage() {
        Reporter.log("Getting Deposit Successful Message :" + depositMsg.toString() + "<br>");

        return getTextFromElement(depositMsg);
    }

    public void clickOnWithdrawalTab() {
        Reporter.log("Clicking On Withdraw Tab :" + withdraw.toString() + "<br>");
        clickOnElement(withdraw);

    }

    public void enterAmountToWithdraw(String amount) {
        Reporter.log("Entering Amount To Withdrawl :" + amount + "in withdrawl field :" + setAmount.toString() + "<br>");
        sendTextToElement(setAmount, amount);

    }

    public void clickOnWithdrawFeature() {
        Reporter.log("Clicking On Withdraw feature :" + withdrawBtn.toString() + "<br>");
        clickOnElement(withdrawBtn);

    }

    public String getTextTransaction() {
        Reporter.log("Getting transaction text :" + withdrawText.toString() + "<br>");

        return getTextFromElement(withdrawText);
    }
}
