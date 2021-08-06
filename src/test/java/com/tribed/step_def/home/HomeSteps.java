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

    @When("^I click on tribed icon$")
    public void iClickOnTribedIcon() {
        homePage.clickOntribedIcon();
    }

    @When("^I click on home page after search$")
    public void iClickOnHomePageAfterSearch() {
        homePage.clickOnHomeAfterSearch();
    }

    @When("^I should be able to see founded and number of employee text$")
    public void iShouldBeAbleToSeeFoundedAndNumberOfEmployeeText() {
        assertThat(homePage.isSectorDisplayed(), is(true));
        assertThat(homePage.isNoOfEmployeeDisplayed(), is(true));
    }
}


