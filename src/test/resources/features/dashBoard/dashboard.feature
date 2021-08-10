@sanity
Feature: dashboard page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button

  Scenario: Verify dashboard working
    When I click on "Dashboard" menu
    Then I should able to see Dashboard screen

  Scenario: Verify edit job screen display
    And I click on "Dashboard" menu
    When I click on "Edit job" button
    Then I should able to see "Edit job" screen

  Scenario: Verify edit job functionality from dashboard
    And I click on "Dashboard" menu
    And I click on "Edit job" button
    And I edit team name from edit job screen
    And I click on "Dashboard after edit Job" menu
    When I click on "Edit job" button
    Then I should able to see updated team name

  Scenario: Verify Add new job listing screen display
    And I click on "Dashboard" menu
    When I click on "Add a new job listing" button
    Then I should able to see "Add a new job listing" screen

  Scenario: Verify Add new job listing functionality working
    And I click on "Dashboard" menu
    And I click on "Add a new job listing" button
    And I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 3500000    | Looking for Automation Eng     | Selenium Cucumber   |
    When I click on "Publish" button
    And I click on "Accept" button
    Then I should able to see "Congratulations!" message

  Scenario: Verify live jobs count is updated accordingly
    When I click on "Dashboard" menu
    Then I should able to accurate live jobs count

  Scenario: Verify next button on job slides
    And I click on "Dashboard" menu
    When I click on "Next icon" button
    Then I should able to see next icon in gray color

  Scenario: Verify previous button on job slides
    And I click on "Dashboard" menu
    When I click on "Previous icon" button
    Then I should able to see previous icon in gray color

