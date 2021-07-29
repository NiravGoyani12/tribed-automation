package com.tribed.step_def.home;
import com.tribed.driver.DriverManager;
import com.tribed.pages.home.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Locale;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HomeSteps  {

    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        String actual =driverManager.getCurrentUrl();
        assertThat(actual, is(endsWith("tribed.io/")));
    }

    // Note: Click actions in single switch case for home page
    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        homePage.clickOnSignIn();
    }

    @And("^I click on sign up button$")
    public void iClickOnSignUpButton() {
        homePage.clickOnSignUp();
    }

    @And("^I click on search page$")
    public void iClickOnSearchPage() {
        homePage.clickOnSearch();
    }

    @When("^I click on I am hiring page$")
    public void iClickOnIAmHiringPage() {
        homePage.clickOnIAmHiring();
    }

    @When("^I click on home page$")
    public void iClickOnHomePage() {
        homePage.clickOnHome();
    }

    @When("^I click on tribed icon$")
    public void iClickOnTribedIcon() {
        homePage.clickOntribedIcon();
    }

    @When("^I click on home page after search$")
    public void iClickOnHomePageAfterSearch() {
        homePage.clickOnHomeAfterSearch();
    }

    @When("^I click view company page$")
    public void iClickViewCompanyPage() {
        homePage.clickOnViewCompanyPage();
    }

    @When("^I should be able to see founded and number of employee text$")
    public void iShouldBeAbleToSeeFoundedAndNumberOfEmployeeText() {
        assertThat(homePage.isSectorDisplayed(), is(true));
        assertThat(homePage.isNoOfEmployeeDisplayed(), is(true));
    }

    @Then("^I should able to see \"([^\"]*)\" screen$")
    public void iShouldAbleToSeeScreen(String expScreenName) throws Throwable {
        Boolean isValidScreen = false;

        switch (expScreenName) {
            case "Home":
                isValidScreen = homePage.isHomePageOpen();
                break;
            case "Search":
                isValidScreen = homePage.isSearchPageOpen();
                break;
            case "Login":
                isValidScreen = homePage.isSignPageOpen();
                break;
            case "Signup":
                isValidScreen = homePage.isSignUpPageOpen();
                break;
            case "Hiring":
                isValidScreen = homePage.isIamHiringPageOpen(expScreenName.toLowerCase());
                break;
            default:
                throw new IllegalStateException("Unexpected service name: " + expScreenName);
        }
        assertThat(isValidScreen, is(true));
    }
}
