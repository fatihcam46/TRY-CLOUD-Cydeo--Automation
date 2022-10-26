package com.tryCloudCydeoAutomation.pages;

import org.openqa.selenium.support.PageFactory;

public class logInPage {
    public logInPage(){
        PageFactory.initElements(com.tryCloudCydeoAutomation.utilities.Driver.getDriver(), this);
    }

}
