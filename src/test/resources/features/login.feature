@sanity
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
