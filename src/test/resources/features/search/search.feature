@sanity
Feature: search

  Scenario: Verify searching working
    Given I am on the home page
    And I click on "Search" menu
    And I enter company for searching
      | SearchText   |
      | Html |
    When I click on search icon
    Then I should be able see see view profile and filteroptions

  Scenario: Verify see full profile working
    Given I am on the home page
    And I click on "Search" menu
    And I enter company for searching
      | SearchText   |
      | Html |
    And I click on search icon
    When  I click on see full profile
    Then I should able to see full user profile
