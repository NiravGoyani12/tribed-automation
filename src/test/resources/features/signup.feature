@signup
Feature: signup

  Scenario: Signup with company profile
    Given I am on the home page
    And I click on signup in button
    When I enter Fullname CompanyEmail CompanyName and password
    And I click on Create Account in button
    Then I should be able to see Congratulations message
    And I click on build Company profile
    Then I should be able to open profile page
    And I enter company profile details

  Scenario: Signup when Email already exist
    Given I am on the home page
    And I click on signup in button
    When I enter existing email details
    And I click on Create Account in button
    Then I should be able to see Validation message


  Scenario: Signup when Passowrd not meet requirements
    Given I am on the home page
    And I click on signup in button
    When I enter ShortPassword
    Then Validation message should displayed for password


