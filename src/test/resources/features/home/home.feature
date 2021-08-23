@sanity
Feature: home

  Background: Login into the application
    Given I am on the home page

  Scenario Outline: Verify different menu
    When I click on "<menu>" menu
    Then I should able to see "<screen>" screen

    Examples:
      | menu         | screen |
      | Search       | Search |
      | SignIn       | SignIn |
      | SignUp       | Signup |
      | I m Hiring   | Hiring |

  Scenario: Verify tribed icon
    And I click on "Search" menu
    When I click on "Tribe Icon" button
    Then I should able to see "Search" screen
