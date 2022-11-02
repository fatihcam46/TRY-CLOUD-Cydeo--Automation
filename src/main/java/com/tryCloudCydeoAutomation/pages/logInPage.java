package com.tryCloudCydeoAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage {
    public logInPage(){
        PageFactory.initElements(com.tryCloudCydeoAutomation.utilities.Driver.getDriver(), this);
    }
    @FindBy(name = "user")
    public WebElement inputUsername;
    @FindBy(name = "password")
    public WebElement inputPassword;
    @FindBy(xpath = "//*[@id=\"submit-form\"]")
    public WebElement loginButton;
    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();    }

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningMessage;

  @FindBy(xpath = "//a[@class='toggle-password']")
    public WebElement viewEyeIcon;

    @FindBy(xpath = "//a[@id='lost-password']")
   public WebElement ForgotPasswordLink;

    @FindBy(xpath = "//input[@id='reset-password-submit']")
    public WebElement ResetPasswordButton;





}
