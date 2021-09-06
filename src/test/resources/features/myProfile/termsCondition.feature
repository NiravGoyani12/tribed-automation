@sanity
Feature: Edit Tile Email page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    And I click on "My Profile" menu


  Scenario: Verify edit culture button
    When I click on "T&C's & privacy" button
    Then I should able to see "T&C & privacy" screen

  Scenario: Verify T&C link working
    And I click on "T&C's & privacy" button
    When I click on T&C link
    Then I should able to see T&C popup

  Scenario: Verify Privacy Policy link working
    And I click on "T&C's & privacy" button
    When I click on Privacy policy link
    Then I should able to see Privacy policy popup

  Scenario: Verify close T&C popup
    And I click on "T&C's & privacy" button
    And I click on T&C link
    When I click on cross icon
    Then I should able to close T&C window

  Scenario: Verify close privacy policy popup
    And I click on "T&C's & privacy" button
    And I click on Privacy policy link
    When I click on cross icon
    Then I should able to close privacy policy window
