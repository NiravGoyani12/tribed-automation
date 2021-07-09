@sanity
Feature: Sign up

  Scenario: Sign up for new company
    Given I am on the home page
    And I click on sign up button
    When I enter following details to sign up for new company
    |Name|Email|CompanyName|CreatePassword|
    |  Joe Bloggs  |  joeBloggs@gmail.com   |  Tribed         |    Test@123          |
    And I click on 'Create account' button
    Then I should be able to see "Congratulations for registering on tribed!" message

  Scenario: Build company profile
    Given I am on the home page
    And I click on sign up button
    When I enter following details to sign up for new company
      |Name|Email|CompanyName|CreatePassword|
      |  Joe Bloggs  |  joeBloggs@gmail.com   |  Tribed         |    Test@123          |
    And I click on 'Create account' button
    When I click on 'Build company profile' button
    Then I should be able see 'Company page' tab
    And the url should contain with "/company-edit"

  Scenario: Sign up with existing email
    Given I am on the home page
    And I click on sign up button
    When I enter following existing details to sign up for new company
      |Name|Email|CompanyName|CreatePassword|
      |  Joe Bloggs  |  joeBloggs@gmail.com   |  Tribed         |    Test@123          |
    When I click on 'Create account' button
    Then I should be able to see email error "Duplicate user: A user with that email address already exists, please log in instead" message

  Scenario: Sign up when password not meet requirements
    Given I am on the home page
    And I click on sign up button
    When I enter following details with incorrect short password to sign up for new company
      |Name|Email|CompanyName|CreatePassword|
      |  Joe Bloggs  |  joeBloggs@gmail.com   |  Tribed         |    Test          |
    When I click on 'Create account' button
    Then I should be able to see password error "Password too weak: Please make sure your password is at least 8 characters long." message
