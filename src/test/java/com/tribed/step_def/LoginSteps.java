package com.tribed.step_def;

import com.tribed.driver.DriverManager;
import com.tribed.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.tribed.utilities.CommonUtils.INVALID_USER;
import static com.tribed.utilities.CommonUtils.VALID_USER;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginSteps {

    DriverManager driverManager = new DriverManager();
    LoginPage loginPage=new LoginPage();


    @And("^I click on log in button$")
    public void iClickOnLogInButton() {
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
}