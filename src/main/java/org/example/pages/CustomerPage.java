package org.example.pages;

import org.example.utility.Utility;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage extends Utility {
    public CustomerPage() {
        PageFactory.initElements(driver,this);
    }


}
