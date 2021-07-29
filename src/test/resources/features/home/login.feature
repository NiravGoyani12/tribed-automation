@sanity
Feature: login

  Background: Login into the application
    Given I am on the home page
    And I click on sign in button

  Scenario Outline: login with valid email and password
    When I enter email and password for "<userType>"
    And I click on log in button
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
    And I click on log in button
    And I click on logout button
    Then I should be able to SingIn button

  Scenario: verify messages menu
    And I enter email and password for "Valid User"
    And I click on log in button
    When I click on messages menu
    Then I should be able to open message screen

  Scenario: verify search menu
    And I enter email and password for "Valid User"
    And I click on log in button
    When I click on search menu after login
    Then I should able to see "Search" screen

  Scenario: verify my profile menu
    And I enter email and password for "Valid User"
    And I click on log in button
    When I click on 'My profile' menu
    Then I should be able to open my profile screen

  Scenario: verify dashboard menu
    And I enter email and password for "Valid User"
    And I click on log in button
    When I click on search menu after login
    When I click on dashboard menu
    Then I should be able to open dashboard screen

  Scenario: verify close button on 'Sign in' page
    When I click on close button
    Then SignIn popup should be closed

  Scenario: verify forget password link
    When I click on forget password link
    Then I should be able to see reset password page
