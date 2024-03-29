package com.tribed.step_def.home;

import com.tribed.pages.home.SignUpPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class SignUpSteps {

    SignUpPage signUpPage =new SignUpPage();
    List<Map<String, String>> data;

    @When("^I enter following details to sign up for new company$")
    public void iEnterFollowingDetailsToSignUpForNewCompany(DataTable dataTable) {
        data =  dataTable.asMaps(String.class, String.class);
        signUpPage.enterSignUpDetails(data.get(0).get("Name"), data.get(0).get("Email") , data.get(0).get("CompanyName"), data.get(0).get("CreatePassword"));
    }

    @When("^I enter following existing details to sign up for new company$")
    public void iEnterFollowingExistingDetailsToSignUpForNewCompany(DataTable dataTable) {
        data =  dataTable.asMaps(String.class, String.class);
        signUpPage.enterExistingDetailsForSignUp(data.get(0).get("Name"), data.get(0).get("Email") , data.get(0).get("CompanyName"), data.get(0).get("CreatePassword"));
    }

    @When("^I enter following details with incorrect short password to sign up for new company$")
    public void iEnterFollowingDetailsWithIncorrectShortPasswordToSignUpForNewCompany(DataTable dataTable) {
        data =  dataTable.asMaps(String.class, String.class);
        signUpPage.enterShortPasswordDetailsForSignUp(data.get(0).get("Name"), data.get(0).get("Email") , data.get(0).get("CompanyName"), data.get(0).get("CreatePassword"));
    }

    @Then("^I should be able to see \"([^\"]*)\" message$")
    public void iShouldBeAbleToSeeMessage(String expMsg) throws Throwable {
        assertThat(signUpPage.getSignUpSuccessMsg(), containsString(expMsg));
    }

    @Then("^I should be able to see email error \"([^\"]*)\" message$")
    public void iShouldBeAbleToSeeErrorMessage(String expErrorMsg) throws Throwable {
        assertThat(signUpPage.getExistingEmailErrorMsg(), containsString(expErrorMsg));
    }

    @Then("^I should be able to see password error \"([^\"]*)\" message$")
    public void shouldBeAbleToSeeShortPasswordErrorMessage(String shortPasswordErrorMsg) throws Throwable {
        assertThat(signUpPage.getShortPasswordMessage(), containsString(shortPasswordErrorMsg));
    }

    @Then("^Signup popup should be closed$")
    public void signupPopupShouldBeClosed() throws InterruptedException {
        assertThat(signUpPage.isSignUpClosed(), is(false));
    }

    @Then("^I should be able to see password$")
    public void iShouldBeAbleToSeePassword() throws InterruptedException {
        assertThat(signUpPage.isShowPasswordWorking(), is(true));
    }
}
