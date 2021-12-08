package org.example.pages;

import org.example.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;

    @FindBy(xpath = "//form[@name='myForm']//button[contains(text(),'Add Customer')]")
    WebElement addCustomerBt;

    public void enterFirstName(String firstName) {
        Reporter.log("Entering FirstName :" + firstName + "to firstname field :" + firstNameField.toString() + "<br>");
        sendTextToElement(firstNameField, firstName);


    }

    public void enterLastName(String lastName) {
        Reporter.log("Entering LastName :" + lastName + "to lastname field :" + lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, lastName);

    }

    public void enterPostCode(String postcode) {
        Reporter.log("Entering Postcode :" + postcode + "in postcode field :" + postCodeField.toString() + "<br>");
        sendTextToElement(postCodeField, postcode);

    }

    public void clickOnAddCustomerBt() {
        Reporter.log("Clicking On AddCustomer Button :" + addCustomerBt.toString() + "<br>");

        clickOnElement(addCustomerBt);
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Customer added successfully "));
        alert.accept();
    }

}
