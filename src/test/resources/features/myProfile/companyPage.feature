@sanity
Feature: Company page

  Background: Login into the application
    Given I am on the home page
    And I click on sign in button
    And I enter email and password for "Valid User"
    And I click on log in button

  Scenario: Build company page
    Given I login with valid user
    When I enter following details for company page
      | Slogan       | Year | Sector      | NoOfEmployee | BrandColor | AboutUsTitle | AboutUs                | InfoTitle        | MoreInfo              | CoreValueFirst  | FirstDescription            | CoreValueSecond | SecondDescription          | CoreValueThird | ThirdDescription          | TestimonialQuote           | TestimonialName | TestimonialRole |
      | Jobs for you | 2021 | Information | 52           | Green      | Find Job     | We are IT organization | Software Service | Contact for more info | Problem Solving | Problem Solving Description | Amazing People  | Amazing People Description | Fast Response  | Fast Response Description | Best Company to work in UK | Peter John      | CEO             |
    And I click on 'Save and go to cultural page'
    Then the "Add to Culture" text is visible
    And the url should contain with "/culture"


  Scenario: Preview on company page
    Given I login with valid user
    When I enter following details for company page
      | Slogan       | Year | Sector      | NoOfEmployee | BrandColor | AboutUsTitle | AboutUs                | InfoTitle        | MoreInfo              | CoreValueFirst  | FirstDescription            | CoreValueSecond | SecondDescription          | CoreValueThird | ThirdDescription          | TestimonialQuote           | TestimonialName | TestimonialRole |
      | Jobs for you | 2021 | Information | 52           | Green      | Find Job     | We are IT organization | Software Service | Contact for more info | Problem Solving | Problem Solving Description | Amazing People  | Amazing People Description | Fast Response  | Fast Response Description | Best Company to work in UK | Peter John      | CEO             |
    And I click on Preview button
    Then the "Return to edit" text is displayed on preview page
    And I should see following details on preview page
      | Slogan       | Sector      |
      | Jobs for you | Information |

  Scenario: Publish company on company page
    Given I login with valid user
    When I enter following details for company page
      | Slogan       | Year | Sector      | NoOfEmployee | BrandColor | AboutUsTitle | AboutUs                | InfoTitle        | MoreInfo              | CoreValueFirst  | FirstDescription            | CoreValueSecond | SecondDescription          | CoreValueThird | ThirdDescription          | TestimonialQuote           | TestimonialName | TestimonialRole |
      | Jobs for you | 2021 | Information | 52           | Green      | Find Job     | We are IT organization | Software Service | Contact for more info | Problem Solving | Problem Solving Description | Amazing People  | Amazing People Description | Fast Response  | Fast Response Description | Best Company to work in UK | Peter John      | CEO             |
    And I click on publish button
    Then I should able to see "Congratulations!" message
