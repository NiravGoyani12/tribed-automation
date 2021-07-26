package com.tribed.step_def;

import com.tribed.driver.DriverManager;
import com.tribed.pages.FooterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;

public class FooterSteps {

    DriverManager driverManager = new DriverManager();
    FooterPage footerpage = new FooterPage();


    @When("^I click on tribed icon from footer$")
    public void iClickOnTribedIconFromFooter() {
        footerpage.clickOntribedIcon();
    }
}