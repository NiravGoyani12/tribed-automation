@sanity
Feature: login

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu

  Scenario Outline: login with valid email and password
    When I enter email and password for "<userType>"
    And I click on "Login" button
    Then I should be able to see "<loggedMessage>" for "<userType>"

    Examples:
      | userType     | loggedMessage       |
      | Valid User   | My profile          |
      | Invalid User | Invalid credentials |

  Scenario: Default Login button should be Disabled
    Then Log in button should be "disabled"

  Scenario: Login button should be enabled by providing email and password
    When I enter email and password for "Valid User"
    Then Log in button should be "enabled"

  Scenario: Logout functionality
    And I enter email and password for "Valid User"
    And I click on "Login" button
    And I click on "Logout" button
    Then I should able to see "SignIn" screen

  Scenario: Verify messages menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    When I click on "Messages" menu
    Then I should able to see "Messages" screen

  Scenario: Verify search menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    When I click on search menu after login
    Then I should able to see "Search" screen

  Scenario: Verify my profile menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    When I click on "My Profile" menu
    Then I should able to see "My Profile" screen

  Scenario: Verify close button on 'Sign in' page
    When I click on "Close" button
    Then SignIn popup should be closed

  Scenario: Verify forget password link
    When I click on "Forget Password" button
    Then I should able to see "Reset Password" screen

  Scenario: Verify register now functionality
    When I click on "Register Now" button
    Then I should able to see "Signup" screen

  Scenario: Verify SignUp from Login page
    And I click on "Register Now" button
    When I enter following details to sign up for new company
      | Name       | Email               | CompanyName | CreatePassword |
      | Joe Bloggs | joeBloggs@gmail.com | Tribed      | Test@123       |
    And I click on "Create account" button
    Then I should be able to see "Congratulations for registering on tribed!" message
