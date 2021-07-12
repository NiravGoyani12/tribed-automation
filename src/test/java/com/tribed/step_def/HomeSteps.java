package com.tribed.step_def;

import com.tribed.driver.DriverManager;
import com.tribed.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

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


}
