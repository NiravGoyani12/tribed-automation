@sanity
Feature: Preview page

  Background: Login into the application
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button

  Scenario: Preview on company page
    Given I login with valid user
    When I click on Preview button
    Then the "Return to edit" text is displayed on preview page
    And I should see publish button

  Scenario: Preview Culture page
    Given I login with valid user
    And I click on culture page tab
    When I click on Preview button
    Then the "Return to edit" text is displayed on preview page
    And I should see publish button

  Scenario: Preview Job page
    Given I login with valid user
    And I click on job page tab
    When I click on Preview button
    Then the "Return to edit" text is displayed on preview page
    And I should see publish button
