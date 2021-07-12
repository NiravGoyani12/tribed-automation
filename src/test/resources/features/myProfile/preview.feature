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

  Scenario: Preview Job page
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on job page tab
    And I click on Add Job button
    When I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 500000    | Looking for Automation Eng     | Selenium Cucumber   |
    When I click on Preview button of Job Page
    Then I should see following details on preview page of job
      | JobTitle       | Team              |
      | Automation Eng | Quality Assurance |




