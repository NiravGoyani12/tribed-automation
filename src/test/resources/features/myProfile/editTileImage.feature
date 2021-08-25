@sanity
Feature: Edit Tile Email page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    And I click on "My Profile" menu
    And I click on "Edit tile image" button

  Scenario: Verify edit culture button
    When I click on "Edit culture" button
    Then I should able to see "Culture" screen
