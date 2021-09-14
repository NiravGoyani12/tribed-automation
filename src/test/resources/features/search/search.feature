@sanity
Feature: Search

  Scenario: Verify search functionality
    Given I am on the home page
    And I click on "Search" menu
    And I enter company for searching
      | SearchText   |
      | a |
    When I click on search icon
    Then I should be able see see view profile and filter options

  Scenario: Verify see full profile working
    Given I am on the home page
    And I click on "Search" menu
    And I enter company for searching
      | SearchText   |
      | a |
    And I click on search icon
    When  I click on see full profile
    Then I should able to see full user profile
