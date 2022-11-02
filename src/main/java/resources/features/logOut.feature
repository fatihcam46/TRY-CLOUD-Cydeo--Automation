@wip @CLOUD-1394
Feature: Logout functionality
  User Story :  As a user, I should be able to log out.
  Acceptance Criteria:
  1-User can log out and ends up in login page
  2-User can not go to home page again by clicking step back button after successfully logged out.

  Background: User on the Try-Cloud web page TC1- 1-User can login with valid credentials
    Given user goes to the Try-Cloud web page
##@CLOUD_1227
    When user enters "Employee93" in user name field
    And user enters "Employee123" in password field
    When user clicks on login button
    Then user checks title is "Dashboard - Trycloud QA"
  @CLOUD_1392
  Scenario: TC1- 1-User can log out and ends up in login page
    When user clicks on dropdown menu
    And user clicks logout button
    Then user should be able to log out
   @CLOUD_1393
  Scenario: TC2- 2-User can not go to home page again by clicking step back button after successfully logged out.
    When user clicks on dropdown menu
    And user clicks logout button
    And user navigates back
    Then user should be able to land on login page