@sanity
Feature: home

  Background: Login into the application
    Given I am on the home page

  Scenario: verify search menu
    When I click on search page
    Then I should able to see "Search" screen

  Scenario: verify sign in menu
    When I click on sign in button
    Then I should able to see "Login" screen

  Scenario: verify sign up menu
    When I click on sign up button
    Then I should able to see "Signup" screen

  Scenario: verify I am hiring page
    When I click on I am hiring page
    Then I should able to see "Hiring" screen

  Scenario: verify home page
    And I click on search page
    When I click on home page after search
    Then I should able to see "Home" screen

  Scenario: verify tribed icon
    And I click on search page
    When I click on tribed icon
    Then I should able to see "Home" screen

  Scenario: verify view company page from home
    When I click view company page
    When I should be able to see founded and number of employee text
