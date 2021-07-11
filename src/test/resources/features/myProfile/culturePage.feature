@sanity
Feature: Culture page

  Scenario: Build Culture page
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on culture page tab
    And I click on Add to Culture button
    And I select any culture and save
    Then added culture should saved and displayed


