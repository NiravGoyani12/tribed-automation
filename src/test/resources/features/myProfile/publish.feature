@sanity
Feature: publish page

  Scenario: Publish company on company page
    Given I am on the home page
    And I click on sign in button
    When I enter email and password for "Valid User"
    And I click on log in button
    When I click on publish button
    Then I should able to see return ome button
    And I should able to see edit company button
    And I should able to see view company button

  Scenario: Publish company on culture page
    Given I am on the home page
    And I click on sign in button
    When I enter email and password for "Valid User"
    And I click on log in button
    And I click on culture page tab
    When I click on publish button
    Then I should able to see return ome button
    And I should able to see edit company button
    And I should able to see view company button

  Scenario: Publish company on job page
    Given I am on the home page
    And I click on sign in button
    When I enter email and password for "Valid User"
    And I click on log in button
    And I click on job page tab
    When I click on publish button
    Then I should able to see return ome button
    And I should able to see edit company button
    And I should able to see view company button