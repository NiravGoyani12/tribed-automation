@sanity
Feature: Preview page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button

  Scenario: Verify Return to Edit on company preview
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on "Preview" button
    When I click on "Return to edit" button
    Then I should able see company edit screen

  Scenario: Verify Publish button on company preview
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on "Preview" button
    When I click on "Publish" button
    Then the url should contain with "/company-edit"

  Scenario: Verify Return to Edit on culture preview
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on culture page tab
    And I click on "Preview" button
    When I click on "Return to edit" button
    Then I should able see company edit screen

  Scenario: Verify Publish button on culture preview
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on culture page tab
    When I click on "Publish" button
    Then the url should contain with "/company-edit"
