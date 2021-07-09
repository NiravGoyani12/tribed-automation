Feature: Preview page

  Scenario: Return to edit on Preview page
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button
    And I enter following details for company page
      | Slogan       | Year | Sector      | NoOfEmployee | BrandColor | AboutUsTitle | AboutUs                | InfoTitle        | MoreInfo              | CoreValueFirst  | FirstDescription            | CoreValueSecond | SecondDescription          | CoreValueThird | ThirdDescription          | TestimonialQuote           | TestimonialName | TestimonialRole |
      | Jobs for you | 2021 | Information | 52           | Green      | Find Job     | We are IT organization | Software Service | Contact for more info | Problem Solving | Problem Solving Description | Amazing People  | Amazing People Description | Fast Response  | Fast Response Description | Best Company to work in UK | Peter John      | CEO             |
    And I click on Preview button
    When I click on 'Return to edit' button
    Then I should be able see 'Company page' tab
    And the url should contain with "/company-edit"