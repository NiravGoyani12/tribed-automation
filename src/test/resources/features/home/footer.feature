@sanity
Feature: footer

  Scenario: Verify tribed icon
    Given I am on the home page
    And I click on "Search" menu
    When I click on tribed icon from footer
    Then I should able to see "Home" screen

  Scenario: Verify copyright statement
    When I am on the home page
    Then I should able to see copyright statement
#    Note: To be added scenario for Copyright © 2021 Tribed, Inc.
    