package com.tribed.step_def;

import com.tribed.driver.DriverManager;
import com.tribed.pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps {

    DriverManager driverManager = new DriverManager();
    SignUpPage sp=new SignUpPage();

    @And("^I click on signup in button$")
    public void iClickOnSignupInButton() throws InterruptedException {
        sp.clickonSignupbutton();
        driverManager.sleep(2000);
    }

    @When("^I enter Fullname CompanyEmail CompanyName and password$")
    public void iEnterFullnameCompanyEmailCompanyNameAndPassword() {
        sp.enterSignUpDetails();
    }

    @And("^I click on Create Account in button$")
    public void iClickOnCreateAccountInButton() {

    sp.clickOnCreateAccountBtn();
    }

    @Then("^I should be able to see Congratulations message$")
    public void iShouldBeAbleToSeeCongratulationsMessage() throws InterruptedException {
    sp.isCongratulationMessageDislayed();
    }

    @Then("^I should be able to see Validation message$")
    public void iShouldBeAbleToSeeValidationMessage() throws InterruptedException {
        sp.isAlreadyExistEmailMessageDisplayed();
    }

    @When("^I enter ShortPassword$")
    public void iEnterShortPassword() {
        sp.enterSShortPassword();
    }

    @Then("^Validation message should displayed for password$")
    public void validationMessageShouldDisplayedForPassword() throws InterruptedException {
            sp.isShortPasswordMessageDislayed();
    }

    @When("^I enter existing email details$")
    public void iEnterExistingEmailDetails() {
        sp.enterSignUpDetailsWithExistingEmail();
    }

    @And("^I click on build Company profile$")
    public void iClickOnBuildCompanyProfile() {
        sp.clickOnBuildCompanyProfileButton();
    }

    @Then("^I should be able to open profile page$")
    public void iShouldBeAbleToOpenProfilePage() throws InterruptedException {
        sp.isProfilePageOpen();
    }

    @And("^I enter company profile details$")
    public void iEnterCompanyProfileDetails() {
        sp.EnterCompanyDetails();
    }
}
