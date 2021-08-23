@sanity
Feature: footer

  Scenario: Verify tribed icon
    Given I am on the home page
    And I click on "I m Hiring" menu
    And I click on "Search" menu
    When I click on tribed icon from footer
    Then I should able to see "Search" screen

  Scenario: Verify copyright statement
    When I am on the home page
    Then I should able to see copyright statement

    