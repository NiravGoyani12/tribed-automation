@sanity
Feature: Publish page

  Background: Login into the application
    Given I am on the home page
    And I click on "SignIn" menu
    And I enter email and password for "Valid User"
    And I click on "Login" button

  Scenario: Verify return to home button from company page publish
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on "Publish" button
    And I click on "Accept" button
    When I click on "Return to home" button
    Then I should able to see "Dashboard" screen

  Scenario: Verify edit company tile button from company page publish
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on "Publish" button
    And I click on "Accept" button
    When I click on "Edit company" button
    Then I should able to see "Company tile" screen

  Scenario: Verify view company page button from company page publish
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on "Publish" button
    And I click on "Accept" button
    When I click on "View company" button
    Then I should be able to see founded and number of employee text

  Scenario: Verify return to home button from culture page publish
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on "Culture Page" button
    And I click on "Publish" button
    And I click on "Accept" button
    When I click on "Return to home" button
    Then I should able to see "Dashboard" screen

  Scenario: Verify edit company tile button from culture page publish
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on "Culture Page" button
    And I click on "Publish" button
    And I click on "Accept" button
    When I click on "Edit company" button
    Then I should able to see "Company tile" screen

  Scenario: Verify view company page button from culture page publish
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on "Culture Page" button
    And I click on "Publish" button
    And I click on "Accept" button
    When I click on "View company" button
    Then I should see company page

  Scenario: Verify confirmation asks while user try to publish
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on "Culture Page" button
    When I click on "Publish" button
    Then I should able to see "Confirmation popup" screen

  Scenario: Verify cancel button on confirmation poupup
    And I click on "My Profile" menu
    And I click on "Edit my profile" button
    And I click on "Culture Page" button
    And I click on "Publish" button
    When I click on "Cancel" button
    Then Confirmation popup should be close
