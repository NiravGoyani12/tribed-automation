@sanity
Feature: Preview page


  Scenario: Preview on company page
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    When I click on Preview button
    Then the "Return to edit" text is displayed on preview page
    Then I should see following details on preview page
      | Slogan       | Sector      |
      | Jobs for you | Information |

  Scenario: Preview Culture page
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on culture page tab
    When I click on Preview button
    Then the "Return to edit" text is displayed on preview page
    And I click on culture tab after preview
    Then added culture should saved and displayed



