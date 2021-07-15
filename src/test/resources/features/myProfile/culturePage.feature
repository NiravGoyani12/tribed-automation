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

  Scenario: Preview on Culture page
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on culture page tab
    When I click on Preview button
    Then the "Return to edit" text is displayed on preview page
    And I click on culture tab after preview
    Then added culture should saved and displayed

  Scenario: Publish on Culture page
    Given I am on the home page
    And I click on sign in button
    When I enter email and password for "Valid User"
    And I click on log in button
    And I click on culture page tab
    And I click on publish button
    Then I should able to see "Congratulations!" message


