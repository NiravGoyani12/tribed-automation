@signup
Feature: signup

  Scenario: Signup with company profile
    Given I am on the home page
    And I click on signup in button
    When I enter Fullname CompanyEmail CompanyName and password
    And I click on Create Account in button
    Then I should be able to see Congratulations message


  Scenario: Signup when Email already exist
    Given I am on the home page
    And I click on signup in button
    When I enter Fullname CompanyEmail CompanyName and password
    And I click on Create Account in button
    Then I should be able to see Validation message


  Scenario: Signup when Passowrd not meet requirements
    Given I am on the home page
    And I click on signup in button
    When I enter ShortPassword
    Then Validation message should displayed for password


