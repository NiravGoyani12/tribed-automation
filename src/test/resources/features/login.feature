@sanity4
Feature: login

  Scenario Outline: login with valid email and password
    Given I am on the home page
    And I click on sign in button
    When I enter email and password for "<userType>"
    And I click on log in button
    Then I should be able to see "<loggedMessage>" for "<userType>"

    Examples:
      | userType     | loggedMessage       |
      | Valid User   | My profile          |
      | Invalid User | Invalid credentials |

  Scenario: Default Login button should be Disabled
    Given I am on the home page
    And I click on sign in button
    Then Log in button should be "disabled"

  Scenario: Login button should be enabled by providing email and password
    Given I am on the home page
    And I click on sign in button
    When I enter email and password for "Valid User"
    Then Log in button should be "enabled"

  Scenario: Logout functionality
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on logout button
    Then I should be able to SingIn button

  Scenario: verify messages menu
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    When I click on messages menu
    Then I should be able to open message screen

  Scenario: verify dashboard menu
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    When I click on search menu after login
    When I click on dashboard menu
    Then I should be able to open dashboard screen

  Scenario: verify search menu
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    When I click on search menu after login
    Then I should able to see search screen

  Scenario: verify my profile menu
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    When I click on my profile menu
    Then I should be able to open my profile screen