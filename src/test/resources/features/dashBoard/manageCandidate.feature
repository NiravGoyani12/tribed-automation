@sanity
Feature: Dashboard page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    And I click on "Dashboard" menu
    
  Scenario: Verify manage candidates button working
    When I click on "Manage candidates" button
    Then I should able to see "candidates" screen
