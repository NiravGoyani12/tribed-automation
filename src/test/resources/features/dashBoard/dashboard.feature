@sanity
Feature: Dashboard page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    And I click on "Dashboard" menu
    
  Scenario: Verify dashboard working
    Then I should able to see "Dashboard" screen

  Scenario: Verify edit job screen display
    When I click on "Edit job" button
    And I click on "Edit job listing" button
    Then I should able to see "Edit job" screen

  Scenario: Verify edit job functionality from dashboard
    And I click on "Edit job" button
    And I click on "Edit job listing" button
    And I edit team name from edit job screen
    And I click on "Dashboard after edit Job" menu
    When I click on "Edit job" button
    And I click on "Edit job listing" button
    Then I should able to see updated team name

  Scenario: Verify Add new job listing screen display
    When I click on "Add a new job listing" button
    Then I should able to see "Add a new job listing" screen

  Scenario: Verify Add new job listing functionality working
    And I click on "Add a new job listing" button
    And I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 3500000    | Looking for Automation Eng     | Selenium Cucumber   |
    And I click on "Add Technical" button
    And I select any technical skill and save
    And I click on "Add Leadership" button
    And I select any leadership skill and save
    And I click on "Add Sector" button
    And I select any sector and save
    And I click on "Add Qualification" button
    And I select any qualification and save
    When I click on "Publish" button
    Then I should able to see "Congratulations!" message

  Scenario: Verify next button on job slides
    When I click on "Next icon" button
    Then I should able to see next icon in gray color

  Scenario: Verify previous button on job slides
    When I click on "Previous icon" button
    Then I should able to see previous icon in gray color

  Scenario: Verify activate job functionality
    And I click on "Edit job" button
    When I click on "Activate job" button
    Then Job should be activated

  Scenario: Verify deactivate job functionality
    And I click on "Edit job" button
    When I click on "Deactivate job" button
    Then Job should be deactivated

  Scenario: Verify manage candidate functionality
    When I click on "Manage candidates" button
    Then I should able to see "candidates" screen

  Scenario: Verify sort by date posted pop up displayed
    When I click on "Date Posted" button
    Then I should able to see date posted pop up

  Scenario: Verify sort by job status pop up displayed
    When I click on "Job Status" button
    Then I should able to see job status pop up

  Scenario: Verify save sort by date posted pop up
    And I click on "Date Posted" button
    And I click on "Alphabetical" button
    When I click on "Save Date Posted" button
    Then Date Posted popup should get close with selected value

  Scenario: Verify save sort by job status pop up
    And I click on "Job Status" button
    And I click on "Job inactive" button
    When I click on "Save Job Status" button
    Then Job Status popup should get close with selected value
