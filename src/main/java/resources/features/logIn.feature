@CLOUD-1375
Feature: Login functionality
  User Story :As a user, I should be able to login so that I can land on the dashboard page.
  Acceptance Criteria:
  1-User can login with valid credentials (either clicking on the "Login button"
  or hitting the "Enter" key from the keyboard as the last step)
  2-User can not login with any invalid credentials
  -"Wrong username or password." should be displayed for invalid credentials
  -"Please fill out this field" message should be displayed if the password or username is empty
  3-User can see the password in a form of dots by default
  4-User can see the password explicitly if needed
  5-User can see the "Forgot password?" link on the login page and can see
  the "Reset Password" button on the next page after clicking on forget password link
  6-User can see valid placeholders on Username and Password fields

  Background: User on the Try-Cloud web page
   Given user goes to the Try-Cloud web page

  @CLOUD_1227
  Scenario: TC1- 1-User can login with valid credentials
    When user enters "Employee93" in user name field
    And user enters "Employee123" in password field
    When user clicks on login button
    Then user checks title is "Dashboard - Trycloud QA"

  @CLOUD-1228
  Scenario Outline: TC2- 2- User can not login with any invalid credentials
    When user enters wrong "<username>" and "<password>"
    And user clicks the "Log in" button
    Then "Wrong username or password." should be displayed for invalid credentials

    Examples: Wrong credentials
      | username         | password         |
      | Employee9393     | Employee123      |
      | Employee933      | Employee123      |
      | employee933       | Employee123      |
      | EMPLOYEE933       | Employee123      |
      | employee933      | Employee123      |
      | Employee93       | EMPLOYEE123      |
      | Employee93       | employee123      |
      | Employee93       | employee123123   |
      | Employee93       | emp123           |

  @CLOUD-1229
  Scenario Outline: TC3- 2- User can not login with any invalid credentials
    When user enters wrong "<username>" and "<password>"
    Then "Please fill out this field" message should be displayed if the password or username is empty

    Examples: Wrong credentials
      | username    | password    |
      |             | Employee123 |
      | Employee93  |             |
      |             |             |

  @CLOUD-1230
  Scenario: TC4- 3-User can see the password in a form of dots by default
    Given User  enters "password" in the password field
    Then User enters "password" is in a form of dots by default

  @CLOUD-1231
  Scenario: TC5- 4-User can see the password explicitly if needed
    Given User  enters "password" is typed in the password field
    Then user should click on the viewEyeIcon to see the "password"

  @CLOUD-1232
  Scenario: TC6- 5-User can see the "Forgot password?" link on the login page and can see the "Reset Password"
  button on the next page after clicking on forget password link
    When user can  see the Forgot password? link
    Then user can see the "Reset Password" button after clicking "Forgot password?"

  @CLOUD-1233
  Scenario: TC7- 6-User can see valid placeholders on Username and Password fields
    And user verify can see valid placeholders on "username" and "password"
