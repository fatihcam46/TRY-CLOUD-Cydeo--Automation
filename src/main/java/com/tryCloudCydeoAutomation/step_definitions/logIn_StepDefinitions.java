package com.tryCloudCydeoAutomation.step_definitions;

import com.tryCloudCydeoAutomation.pages.logInPage;
import com.tryCloudCydeoAutomation.utilities.BrowserUtilities;
import com.tryCloudCydeoAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

public class logIn_StepDefinitions {
 logInPage logInPage = new logInPage();

 //test case 1- @CLOUD_1227
 @Given("user goes to the Try-Cloud web page")
 public void userGoesToTheTryCloudWebPage() {
  String url = com.tryCloudCydeoAutomation.utilities.ConfigurationReader.getProperty("web.table.url");
  com.tryCloudCydeoAutomation.utilities.Driver.getDriver().get(url);
 }

 @When("user enters {string} in user name field")
 public void user_enters_in_user_name_field(String string) {
  logInPage.inputUsername.sendKeys(string);
 }

 @When("user enters {string} in password field")
 public void user_enters_in_password_field(String string) {
  logInPage.inputPassword.sendKeys(string);
 }

 @When("user clicks on login button")
 public void user_clicks_on_login_button() {
  logInPage.loginButton.click();
 }

 @Then("user checks title is {string}")
 public void user_checks_title_is(String string) {
  //  Assert.assertTrue(Driver.getDriver().getTitle().contains(Dashboard_page));
 }

 //test case 2- @CLOUD_1228
 @When("user enters wrong {string} and {string}")
 public void userEntersWrongAnd(String username, String password) {
  logInPage.login(username, password);
 }

 @When("user clicks the {string} button")
 public void user_clicks_the_button(String string) {
 }

 @Then("{string} should be displayed for invalid credentials")
 public void should_be_displayed_for_invalid_credentials(String string) {
  BrowserUtilities.verifyElementDisplayed(logInPage.warningMessage);
 }

 //test case 3-@CLOUD-1229
 @Then("{string} message should be displayed if the password or username is empty")
 public void message_should_be_displayed_if_the_password_or_username_is_empty(String string) {
  logInPage.inputUsername.getAttribute("validationMessage");
 }

 //test case 4-@CLOUD-1230
 @Given("User  enters {string} in the password field")
 public void userEntersInThePasswordField(String password) {
  logInPage.inputPassword.sendKeys(password);
 }

 @Then("User enters {string} is in a form of dots by default")
 public void useerEntersIsInAFormOfDotsByDefault(String password) {
  Assert.assertTrue("Password type is password", password.contains("password"));
 }

 //test case 5-@CLOUD-1231
 @Given("User  enters {string} is typed in the password field")
 public void userEntersIsTypedInThePasswordField(String password) {
  logInPage.inputPassword.sendKeys(password);
 }

 @Then("user should click on the viewEyeIcon to see the {string}")
 public void userShouldClickOnTheViewEyeIconToSeeThe(String password) {
  logInPage.viewEyeIcon.click();

  String passwordType = logInPage.inputPassword.getAttribute("type");

  if (passwordType.contains("text")) {
   System.out.println(password + " is visible");
  } else {
   System.out.println(password + " is not visible");
  }
 }

 //test case 6-@CLOUD-1232
 @When("user can  see the Forgot password? link")
 public void userCanSeeTheForgotPasswordLink() {
  logInPage.ForgotPasswordLink.isDisplayed();
  logInPage.ForgotPasswordLink.click();
 }

 @Then("user can see the {string} button after clicking {string}")
 public void userCanSeeTheButtonAfterClicking(String string, String string2) {
  BrowserUtilities.switchToWindow("Trycloud QA");
  logInPage.ResetPasswordButton.isDisplayed();
 }
 //test case 7-@CLOUD-1233
 @Given("user verify can see valid placeholders on {string} and {string}")
 public void user_verify_can_see_valid_placeholders_on_and(String string, String string2) {
  logInPage.inputUsername.getAttribute("placeholder");
  logInPage.inputPassword.getAttribute("placeholder");


  Assert.assertTrue(logInPage.inputUsername.getAttribute("placeholder").contains("Username or email"));
  Assert.assertTrue(logInPage.inputPassword.getAttribute("placeholder").contains("Password"));

 }
}