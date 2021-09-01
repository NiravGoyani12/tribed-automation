@sanity
Feature: filter options

  Background: Login into the application
    Given I am on the home page
    And I click on "Search" menu
    And I enter company for searching
      | SearchText   |
      | Html |
    And I click on "Search icon" button

  Scenario: Verify filter options working
    When  I click on "Filter Option" button
    Then I should able to different filter options

  Scenario: Verify candidate count updated after selecting different filter
    And  I click on "Filter Option" button
    When I select any other culture from filter option
    Then I should able to see updated candidate count

  Scenario: Verify updated candidate count displayed back on search result
    And  I click on "Filter Option" button
    And I select any other culture from filter option
    When I click on "Show Candidate" button
    Then I should be able to see updated candidate count on search result page

  Scenario: Verify clear all filter
    And  I click on "Filter Option" button
    And I click on "First Culture" button
    And I click on "First Development" button
    And I click on "First Well-Being" button
    And I click on "First Benefits" button
    When I click on "Clear all filters" button
    Then I should be able to see all selected filters get clear

  Scenario: Verify clear culture filters
    And  I click on "Filter Option" button
    And I click on "First Culture" button
    And I click on "Clear culture filter" button
    Then I should be able to see selected culture get clear

  Scenario: Verify clear development filters
    And  I click on "Filter Option" button
    And I click on "First Development" button
    And I click on "Clear development filter" button
    Then I should be able to see selected development get clear

  Scenario: Verify clear well-being filters
    And  I click on "Filter Option" button
    And I click on "First Well-Being" button
    And I click on "Clear well-being filter" button
    Then I should be able to see selected well-being get clear

  Scenario: Verify clear benefits filters
    And  I click on "Filter Option" button
    And I click on "First Benefits" button
    And I click on "Clear benefits filter" button
    Then I should be able to see selected benefits get clear

  Scenario: Verify main header filters on skills and experienced page for development tab
    And  I click on "Filter Option" button
    And I click on "Skills & experience" button
    When I click on "Development" button
    Then I should be able to see development related skills

  Scenario: Verify main header filters on skills and experienced page for finance tab
    And  I click on "Filter Option" button
    And I click on "Skills & experience" button
    When I click on "HR" button
    Then I should be able to see hr related skills


