@sanity4
Feature: publish page

  Background: Login into the application
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button

  Scenario: Verify return to home button from company page publish
    And I click on dashboard menu after login
    And I click on publish button
    When I click on return to home
    Then I can able to see dashboard screen
    #And I should able to see edit company button
    #And I should able to see view company button

  Scenario: Verify edit company tile button from company page publish
    And I click on dashboard menu after login
    And I click on publish button
    When I click on edit company tile
    Then I should see company edit page

  Scenario: Verify view company page button from company page publish
    And I click on dashboard menu after login
    And I click on publish button
    When I click on view company page
    Then I should see company page

  Scenario: Verify return to home button from culture page publish
    And I click on dashboard menu after login
    And I click on culture page tab
    And I click on publish button
    When I click on return to home
    Then I can able to see dashboard screen

  Scenario: Verify edit company tile button from culture page publish
    And I click on dashboard menu after login
    And I click on culture page tab
    And I click on publish button
    When I click on edit company tile
    Then I should see company edit page

  Scenario: Verify view company page button from culture page publish
    And I click on dashboard menu after login
    And I click on culture page tab
    And I click on publish button
    When I click on view company page
    Then I should see company page

  Scenario: Verify return to home button from job page publish
    And I click on dashboard menu after login
    And I click on job page tab
    And I click on publish button
    When I click on return to home
    Then I can able to see dashboard screen

  Scenario: Verify edit company tile button from job page publish
    And I click on dashboard menu after login
    And I click on job page tab
    And I click on publish button
    When I click on edit company tile
    Then I should see company edit page

  Scenario: Verify view company page button from job page publish
    And I click on dashboard menu after login
    And I click on job page tab
    And I click on publish button
    When I click on view company page
    Then I should see company page