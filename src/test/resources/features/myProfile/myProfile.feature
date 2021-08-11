@sanity
Feature: My profile page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button

  Scenario Outline: Verify edit and view my profile page
    And I click on "My Profile" menu
    When I click on "<menu>" button
    Then I should able to see "<screen>" screen

    Examples:
      | menu              | screen        |
      | Edit my profile   | Edit profile  |
      | View my profile   | View profile  |

