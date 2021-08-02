@sanity
Feature: footer

  Scenario: verify tribed icon
    Given I am on the home page
    And I click on "Search" menu
    When I click on tribed icon from footer
    Then I should able to see "Home" screen

#    Note: To be added scenario for Copyright © 2021 Tribed, Inc.
    