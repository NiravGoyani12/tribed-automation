@sanity2
Feature: publish page

  Scenario: Publish company on company page
    Given I am on the home page
    And I click on sign in button
    When I enter email and password for "Valid User"
    And I click on log in button
    And I click on publish button
    Then I should able to see "Congratulations!" message

  Scenario: Publish company on culture page
    Given I am on the home page
    And I click on sign in button
    When I enter email and password for "Valid User"
    And I click on log in button
    And I click on culture page tab
    And I click on publish button
    Then I should able to see "Congratulations!" message