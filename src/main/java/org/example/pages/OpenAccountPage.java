package org.example.pages;

import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {
    public OpenAccountPage() { PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerName;

    @FindBy(id = "currency")
    WebElement currency;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProcess;

    public void selectCustomerName(String cName){
        selectByVisibleTextFromDropDown(customerName,cName);

    }

    public void selectCurrency(String currncy){
        selectByVisibleTextFromDropDown(currency,currncy);
    }

    public void clickOnProcessButton(){
        clickOnElement(clickOnProcess);
        System.out.println(getTextFromAlert());
        acceptAlert();
    }
}
