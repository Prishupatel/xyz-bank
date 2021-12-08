package org.example.pages;

import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement managerLogin;

    @FindBy(xpath ="//button[contains(text(),'Customer Login')]" )
    WebElement customerLogin;

    public  void clickOnManagerLoginLink(){
        Reporter.log("Clicking On manager login button :" +managerLogin.toString() + "<br>");
        clickOnElement(managerLogin);
    }
    public void clickOnCustomerLoginLink(){
        Reporter.log("Clicking On customer Button :" +customerLogin.toString() + "<br>");
        clickOnElement(customerLogin);
    }

}
