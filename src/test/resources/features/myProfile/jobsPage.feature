@sanity
Feature: Job page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    And I click on "My Profile" menu
    And I click on "Job Page" button

  Scenario: Preview Company On Job page
    And I click on "Add Job" button
    And I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 3500000    | Looking for Automation Eng     | Selenium Cucumber   |
    When I click on "Preview" button
    Then I should see following details on preview page of job
      | JobTitle       | Team              |
      | Automation Eng | Quality Assurance |
    And the "Return to edit" text is displayed on preview page
    And I should see publish button

  Scenario: Publish Company On Job page
    And I click on "Add Job" button
    And I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 3500000    | Looking for Automation Eng     | Selenium Cucumber   |
    When I click on "Publish" button
    And I click on "Accept" button
    Then I should able to see "Congratulations!" message
    And I should able to see edit company button
    And I should able to see return home button
    And I should able to see view company button

  Scenario: Verify do not make salary visible to candidate check box when it is selected on Preview Job
    And I click on "Add Job" button
    And I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 3500000    | Looking for Automation Eng     | Selenium Cucumber   |
    And I click on salary not visible checkbox
    When I click on "Preview" button
    Then I should not able to see salary on preview
      | MinSalary       | MaxSalary              |
      | 3000000         | 3500000                |

  Scenario: Verify do not make salary visible to candidate check box when it is selected on Publish Job
    And I click on "Add Job" button
    And I enter following details for job page
      | JobTitle       | Team              | Office Location     | MinSalary | MaxSalary | InfoTitle                      | Info                |
      | Automation Eng | Quality Assurance | London              | 3000000   | 3500000    | Looking for Automation Eng     | Selenium Cucumber   |
    And I click on salary not visible checkbox
    When I click on "Publish" button
    And I click on "Accept" button
    Then I should not able to see salary on preview
      | MinSalary       | MaxSalary              |
      | 3000000         | 3500000                |

  Scenario: Add Technical Skills
    And I click on "Add Job" button
    And I click on "Add Technical" button
    When I select any technical skill and save
    Then added technical skill should saved and displayed

  Scenario: Add Leadership Skills
    And I click on "Add Job" button
    And I click on "Add Leadership" button
    When I select any leadership skill and save
    Then added leadership skill should saved and displayed

  Scenario: Add Sectors
    And I click on "Add Job" button
    And I click on "Add Sector" button
    When I select any sector and save
    Then added sectors skill should saved and displayed

  Scenario: Add Qualifications Skills
    And I click on "Add Job" button
    And I click on "Add Qualification" button
    When I select any qualification and save
    Then added qualifications skill should saved and displayed

  Scenario: Verify next section button while adding skills
    And I click on "Add Job" button
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

  Scenario: Verify About this job button
    When I click on "About this job" button
    Then I should be able to see selected job details