package com.tribed.step_def.home;

import com.tribed.driver.DriverManager;
import com.tribed.pages.home.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class LoginSteps {

    DriverManager driverManager = new DriverManager();
    LoginPage loginPage=new LoginPage();
    List<Map<String, String>> data;

    @And("^I click on log in button$")
    public void iClickOnLogInButton() throws InterruptedException {

        driverManager.sleep(2000);
        loginPage.clickOnLogInBtn();
        driverManager.sleep(2000);
    }


    @When("^I enter email and password for \"([^\"]*)\"$")
    public void iEnterEmailAndPasswordFor(String userType) throws Throwable {
            loginPage.enterEmailAndPassword(userType);
    }

    @Then("^I should be able to see \"([^\"]*)\" for \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeFor(String expText, String userType) throws Throwable {
        String actLogInText ="";
        switch(userType) {
            case "Valid User":
                actLogInText = loginPage.getLoggedText();
                break;
            case "Invalid User":
                actLogInText = loginPage.getLogInnErrorText();
                break;
            default:
                throw new IllegalStateException("Unexpected user type: " + userType);
        }
        assertThat(actLogInText, containsString(expText));
    }

    @Then("^Log in button should be \"([^\"]*)\"$")
    public void logInButtonShouldBe(String state) throws Throwable {
        assertThat(loginPage.checkStateOfButton(), is(state.equals("enabled") ? true : false));
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        loginPage.clickOnLogoutBtn();
    }

    @Then("^I should be able to SingIn button$")
    public void iShouldBeAbleToSingInButton() throws InterruptedException {
        assertThat(loginPage.isSignInButtonDisplayed(), is(true));
    }

    @Then("^I should be able to open message screen$")
    public void iShouldBeAbleToOpenMessageScreen() {
        assertThat(loginPage.isMessageMenuOpen(), is(true));
    }

    @When("^I click on dashboard menu$")
    public void iClickOnDashboardMenu() {
        loginPage.clickonDashboardMenu();
    }

    @When("^I click on search menu after login$")
    public void iClickOnSearchMenuAfterLogin() throws InterruptedException {
        loginPage.clickOnSearchAfterLogin();
    }

    @When("^I click on close button$")
    public void iClickOnCloseButton() throws InterruptedException {
        loginPage.clickonSignUpClose();
    }

    @Then("^SignIn popup should be closed$")
    public void signinPopupShouldBeClosed() throws InterruptedException {
        assertThat(loginPage.isSignUpClosed(), is(false));
    }

    @When("^I click on forget password link$")
    public void iClickOnForgetPasswordLink() {
        loginPage.clickonForgetPasswordLink();
    }

    @Then("^I should be able to see reset password page$")
    public void iShouldBeAbleToSeeResetPasswordPage() throws InterruptedException {
        assertThat(loginPage.isResetPasswordPageDisplayed(), is(true));
    }

    @And("^I click on 'My profile' menu$")
    public void iClickOnMyProfileMenu() throws InterruptedException {
        loginPage.clickonMyProfileMenu();
    }

    @And("^Press 'Enter' key$")
    public void pressEnterKey() {
        loginPage.pressEnterKey();
    }

    @And("^I enter email for forget password$")
    public void iEnterEmailForForgetPassword() {
        loginPage.enterEmailId();
    }

    @When("^I enter invalid email and password$")
    public void iEnterInvalidEmailAndPassword(DataTable dataTable) {
        data =  dataTable.asMaps(String.class, String.class);
        loginPage.enterEmailAndPassword(data.get(0).get("email"),data.get(0).get("password"));
    }

    @Then("^I should be able to see validation message for inValidemail$")
    public void iShouldBeAbleToSeeValidationMessage() {
        assertThat(loginPage.isValidationDisplayIfEmailIncorrect(), is(true));
    }

    @And("^I should be able to see validation message for incorrectPassword$")
    public void iShouldBeAbleToSeeValidationMessageForIncorrectPassword() {
        assertThat(loginPage.isValidationDisplayIfPasswordIncorrect(), is(true));
    }
}
