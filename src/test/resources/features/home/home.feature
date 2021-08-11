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

  Scenario: Verify home page
    And I click on "Search" menu
    When I click on home page after search
    Then I should able to see "Home" screen

  Scenario: Verify tribed icon
    And I click on "Search" menu
    When I click on "Tribe Icon" button
    Then I should able to see "Home" screen

  Scenario: Verify view company page from home
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    When I click on "View Company" button
    Then I should be able to see founded and number of employee text

