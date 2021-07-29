package com.tribed.step_def.home;

import com.tribed.driver.DriverManager;
import com.tribed.pages.home.FooterPage;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FooterSteps {

    DriverManager driverManager = new DriverManager();
    FooterPage footerpage = new FooterPage();


    @When("^I click on tribed icon from footer$")
    public void iClickOnTribedIconFromFooter() {
        footerpage.clickOntribedIcon();
    }


}
