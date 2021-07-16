@sanity
Feature: Preview page

  Scenario: Preview on company page
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    When I click on Preview button
    Then the "Return to edit" text is displayed on preview page
    And I should see publish button


  Scenario: Preview Culture page
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on culture page tab
    When I click on Preview button
    Then the "Return to edit" text is displayed on preview page
    And I should see publish button

  Scenario: Preview Job page
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on job page tab
    Then the "Return to edit" text is displayed on preview page
    And I should see publish button




