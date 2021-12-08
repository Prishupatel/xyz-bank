package org.example.pages;

import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {
    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourName;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement loginBtn;

    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameLabel;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOut;

    public void selectYourName(String yName) {
        selectByVisibleTextFromDropDown(yourName, yName);
    }

    public void clickLoginButton() {
        clickOnElement(loginBtn);
    }

    public void clickOnLogout() {
        clickOnElement(logOut);
    }
}
