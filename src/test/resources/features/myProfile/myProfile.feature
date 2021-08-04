@sanity
Feature: Culture page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button

  Scenario: Verify edit my profile page
    And I click on "My Profile" menu
    When I click on "Edit my profile" button
    Then I should able to see "Edit profile" screen

  Scenario: Verify view my profile page
    And I click on "My Profile" menu
    When I click on "View my profile" button
    Then I should able to see "View profile" screen

