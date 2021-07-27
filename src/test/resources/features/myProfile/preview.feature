@sanity
Feature: Preview page

  Background: Login into the application
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button

  Scenario: Verify Return to Edit on company preview
    And I click on dashboard menu after login
    And I click on Preview button
    When I click on 'Return to edit' button
    Then I should see company edit page

  Scenario: Verify Publish button on company preview
    And I click on dashboard menu after login
    And I click on Preview button
    When I click on publish button
    Then I should able to see return ome button
    And I should able to see edit company button
    And I should able to see view company button

  Scenario: Verify Return to Edit on culture preview
    And I click on dashboard menu after login
    And I click on culture page tab
    And I click on Preview button
    When I click on 'Return to edit' button
    And I should see company edit page

  Scenario: Verify Publish button on culture preview
    And I click on dashboard menu after login
    And I click on culture page tab
    When I click on publish button
    Then I should able to see return ome button
    And I should able to see edit company button
    And I should able to see view company button

  Scenario: Verify Return to Edit on job preview
    And I click on dashboard menu after login
    And I click on job page tab
    And I click on Preview button
    When I click on 'Return to edit' button
    And I should see company edit page

  Scenario: Verify Publish button on job preview
    And I click on dashboard menu after login
    And I click on job page tab
    When I click on publish button
    Then I should able to see return ome button
    And I should able to see edit company button
    And I should able to see view company button


