@sanity1
Feature: Company Profile


  Scenario: Build company profile
    Given I am on the home page
    And I click on sign up button
    When I enter following details to sign up for new company
      |Name|Email|CompanyName|CreatePassword|
      |  Joe Bloggs  |  joeBloggs@gmail.com   |  Tribed         |    Test@123          |
    And I click on 'Create account' button
    When I click on 'Build company profile' button
    And I enter below company profile details
      |Slogan|Year|Sector|NoOfEmployee|AboutUsTitle|AboutUs|InfoTitle|CoreValueFirst|CoreValueSecond|CoreValueThird|TestimonialQuote|TestimonialName|TestimonialRole|
      |  Jobs for you  |  2021   |  Information         |    52 | Find Job | We are IT organization | Software Service | Problem Solving | Amazing People | Fast Response | Best Company to work in UK | Peter John | CEO |
    And i click on 'Save and go to cultural page'
    Then I should be able to Cultural page



 Scenario: Preview company
    Given I am on the home page
    Given I am on the home page
    And I click on sign in button
    When I enter valid email and password
    And I click on log in button
    And i click on Preview button
    Then i should able to see preview of company

  Scenario: Publish company
    Given I am on the home page
    Given I am on the home page
    And I click on sign in button
    When I enter valid email and password
    And I click on log in button
    And i click on publish button
    Then i should able to see 'Congratulations!' message


