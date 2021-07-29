package com.tribed.step_def.home;
import com.tribed.driver.DriverManager;
import com.tribed.pages.home.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;

public class HomeSteps  {

    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        String actual =driverManager.getCurrentUrl();
        assertThat(actual, is(endsWith("tribed.io/")));
    }

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

    @Then("^I should able to see search screen$")
    public void iShouldAbleToSeeSearchScreen() {
        assertThat(homePage.isSearchPageOpen(), is(true));
    }

    @Then("^I should be able to see Login screen$")
    public void iShouldBeAbleToSeeLoginScreen() {
        assertThat(homePage.isSignPageOpen(), is(true));
    }

    @Then("^I should be able to see Signup scren$")
    public void iShouldBeAbleToSeeSignupScren() {
        assertThat(homePage.isSignUpPageOpen(), is(true));
    }

    @When("^I click on I am hiring page$")
    public void iClickOnIAmHiringPage() {
        homePage.clickOnIAmHiring();
    }

    @Then("^I should be able to see hiring screen$")
    public void iShouldBeAbleToSeeHiringScreen() {
        assertThat(homePage.isIamHiringPageOpen("hiring"), is(true));
    }

    @When("^I click on home page$")
    public void iClickOnHomePage() {
        homePage.clickOnHome();
    }

    @Then("^I should be able to see Home screen$")
    public void iShouldBeAbleToSeeHomeScreen() {
        assertThat(homePage.isHomePageOpen(), is(true));
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
}
