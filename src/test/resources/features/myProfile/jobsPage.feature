@sanity
Feature: Job page

  Scenario: Add Technical Skills
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on job page tab
    And I click on Add Job button
    And I click on Add Technical button
    When I select any technical skill and save
    Then added technical skill should saved and displayed

  Scenario: Add Leadership Skills
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on job page tab
    And I click on Add Job button
    And I click on add leadership button
    When I select any leadership skill and save
    Then added leadership skill should saved and displayed

  Scenario: Add Sectors
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on job page tab
    And I click on Add Job button
    And I click on add sector button
    When I select any sector and save
    Then added sectors skill should saved and displayed

  Scenario: Add Qualifications Skills
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on job page tab
    And I click on Add Job button
    And I click on add qualification button
    When I select any qualification and save
    Then added qualifications skill should saved and displayed


  Scenario: Preview Company On Job page
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I click on job page tab
    And I click on Add Job button
    And I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 500000    | Looking for Automation Eng     | Selenium Cucumber   |
    When I click on Preview button of Job Page
    Then I should see following details on preview page of job
      | JobTitle       | Team              |
      | Automation Eng | Quality Assurance |

  Scenario: Publish Company On Job page
    Given I am on the home page
    And I click on sign in button
    When I enter email and password for "Valid User"
    And I click on log in button
    And I click on job page tab
    And I click on Add Job button
    And I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 500000    | Looking for Automation Eng     | Selenium Cucumber   |
    When I click on publish button
    Then I should able to see "Congratulations!" message


