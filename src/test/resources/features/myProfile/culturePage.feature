@sanity
Feature: Culture page

  Background: Login into the application
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on 'My profile' menu
    And I click on culture page tab
    And I click on Add to Culture button

  Scenario: Build Culture page
    When I select any culture and save
    Then added culture should be saved and displayed

  Scenario: Preview on Culture page
    And I select any culture and save
    When I click on Preview button
    Then the "Return to edit" text is displayed on preview page
    And I should see publish button

  Scenario: Publish on Culture page
    And I select any culture and save
    When I click on publish button
    Then I should able to see "Congratulations!" message
    And I should able to see edit company button
    And I should able to see return home button
    And I should able to see view company button