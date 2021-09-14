@sanity
Feature: message page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button

  Scenario: Verify messages working
    Then I click on "Messages" menu
    And I click on "Back to dashboard" button
    And I should able to see "Dashboard" screen
