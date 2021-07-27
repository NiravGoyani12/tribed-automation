@sanity
Feature: login

  Scenario: verify searching working
    Given I am on the home page
    And I click on search page
    And I enter company for searching
      | SearchText   |
      | Html |
    When I click on search icon
    Then I should be able see see view profile and filteroptions


