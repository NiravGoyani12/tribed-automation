@sanity
Feature: Job page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    And I click on "Dashboard" menu

  Scenario: Preview Company On Job page
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
    When I click on "Preview" button
    Then I should see following details on preview page of job
      | JobTitle       | Team              |
      | Automation Eng | Quality Assurance |
    And the "Return to edit" text is displayed on preview page
    And I should see publish button

  Scenario: Publish Company On Job page
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
    And I should able to see edit tile button
    And I should able to see return job button
    And I should able to see view job button

  Scenario: Verify do not make salary visible to candidate check box when it is selected on Preview Job
    And I click on "Add a new job listing" button
    And I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 3500000    | Looking for Automation Eng     | Selenium Cucumber   |
    And I click on salary not visible checkbox
    And I click on "Add Technical" button
    And I select any technical skill and save
    And I click on "Add Leadership" button
    And I select any leadership skill and save
    And I click on "Add Sector" button
    And I select any sector and save
    And I click on "Add Qualification" button
    And I select any qualification and save
    When I click on "Preview" button
    Then I should not able to see salary on preview
      | MinSalary       | MaxSalary              |
      | 3000000         | 3500000                |

  Scenario: Verify do not make salary visible to candidate check box when it is selected on Publish Job
    And I click on "Add a new job listing" button
    And I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 3500000    | Looking for Automation Eng     | Selenium Cucumber   |
    And I click on salary not visible checkbox
    And I click on "Add Technical" button
    And I select any technical skill and save
    And I click on "Add Leadership" button
    And I select any leadership skill and save
    And I click on "Add Sector" button
    And I select any sector and save
    And I click on "Add Qualification" button
    And I select any qualification and save
    When I click on "Publish" button
    Then I should not able to see salary on preview
      | MinSalary       | MaxSalary              |
      | 3000000         | 3500000                |

  Scenario: Verify next section button while adding skills
    And I click on "Add a new job listing" button
    And I click on "Add Technical" button
    And I select any technical skill
    And I click on "Next Section" button
    And I select any leadership skill
    And I click on "Next Section" button
    And I select any sector
    And I click on "Next Section" button
    And I select any qualification
    When I click on "Save and Exit" button
    Then I should be able to see all selected skills sector and qualification

  Scenario: Verify return to job button from job page publish
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
    When I click on "Return to job" button
    Then I should able to see "Dashboard" screen

  Scenario: Verify edit job tile button from job page publish
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
    When I click on "Edit tile" button
    Then I should able to see "Job" screen

  Scenario: Verify view job page button from job page publish
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
    When I click on "About this job" button
    Then I should see company page
