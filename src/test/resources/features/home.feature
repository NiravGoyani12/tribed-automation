@sanity
Feature: home

  Scenario: verify search menu
    Given I am on the home page
    And I click on search page
    Then I should able to see search screen

  Scenario: verify sign in menu
    Given I am on the home page
    And I click on sign in button
    Then I should be able to see Login screen

  Scenario: verify sign up menu
    Given I am on the home page
    And I click on sign up button
    Then I should be able to see Signup scren