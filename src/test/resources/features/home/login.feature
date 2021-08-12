@sanity
Feature: login

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu

  Scenario Outline: login with valid email and password
    When I enter email and password for "<userType>"
    And I click on "Login" button
    Then I should be able to see "<loggedMessage>" for "<userType>"

    Examples:
      | userType     | loggedMessage       |
      | Valid User   | My profile          |

  Scenario Outline: login with invalid email and password
    When I enter email and password for "<userType>"
    Then I should be able to see "<loggedMessage>" for "<userType>"

    Examples:
      | userType     | loggedMessage       |
      | Invalid User | Password can only contain Latin letters. |

  Scenario: Default Login button should be Disabled
    Then Log in button should be "disabled"

  Scenario: Login button should be enabled by providing email and password
    When I enter email and password for "Valid User"
    Then Log in button should be "enabled"

  Scenario Outline: Verify logout, messages and my profile screen
    And I enter email and password for "Valid User"
    And I click on "Login" button
    When I click on "<menu>" menu
    Then I should able to see "<screen>" screen

    Examples:
      | menu         | screen     |
      | Logout       | SignIn     |
      | Messages     | Messages   |
      | My Profile   | My Profile |

  Scenario: Verify search menu
    And I enter email and password for "Valid User"
    And I click on "Login" button
    When I click on search menu after login
    Then I should able to see "Search" screen

  Scenario: Verify close button on 'Sign in' page
    When I click on "Close" button
    Then SignIn popup should be closed

  Scenario: Verify forget password link
    When I click on "Forget Password" button
    Then I should able to see "Reset Password" screen

  Scenario: Verify register now functionality
    When I click on "Register Now" button
    Then I should able to see "Signup" screen

  Scenario: Verify SignUp from Login page
    And I click on "Register Now" button
    When I enter following details to sign up for new company
      | Name       | Email               | CompanyName | CreatePassword |
      | Joe Bloggs | joeBloggs@gmail.com | Tribed      | Test@123       |
    And I click on "Create account" button
    Then I should be able to see "Congratulations for registering on tribed!" message