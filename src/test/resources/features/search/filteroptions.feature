@sanity
Feature: filter options

  Background: Login into the application
    Given I am on the home page
    And I click on search page
    And I enter company for searching
      | SearchText   |
      | Html |
    And I click on search icon

  Scenario: Verify filter options working
    When  I click on filter option
    Then I should able to different filter options

  Scenario: Verify candidate count updated after selecting different filter
    And  I click on filter option
    When I select any other culture from filter option
    Then I should able to see updated candidate count

  Scenario: Verify updated candidate count displayed back on search result
    And  I click on filter option
    And I select any other culture from filter option
    When I click on show candidate button
    Then I should be able to see updated candidate count on search result page
