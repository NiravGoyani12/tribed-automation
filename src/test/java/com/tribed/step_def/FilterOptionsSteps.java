package com.tribed.step_def;

import com.tribed.driver.DriverManager;
import com.tribed.pages.FilterOptionsPage;
import com.tribed.pages.SearchPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FilterOptionsSteps {

    DriverManager driverManager = new DriverManager();
    FilterOptionsPage filterOptionsPage=new FilterOptionsPage();
    List<Map<String, String>> data;

    @When("^I click on filter option$")
    public void iClickOnFilterOption() {
        filterOptionsPage.clickOnFilterOption();
    }

    @Then("^I should able to different filter options$")
    public void iShouldAbleToDifferentFilterOptions() {
        filterOptionsPage.isFilterOptionTextDisplayed();
    }

    @When("^I select any other culture from filter option$")
    public void iSelectAnyOtherCultureFromFilterOption() throws InterruptedException {
            filterOptionsPage.selectOtherCulture();
    }

    @Then("^I should able to see updated candidate count$")
    public void iShouldAbleToSeeUpdatedCandidateCount() {
        assertThat(filterOptionsPage.isSelectedCandidateCountUpdated(), is(true));
    }

    @When("^I click on show candidate button$")
    public void iClickOnShowCandidateButton() {
        filterOptionsPage.clickOnShowCandidate();
    }


    @Then("^I should be able to see updated candidate count on search result page$")
    public void iShouldBeAbleToSeeUpdatedCandidateCountOnSearchResultPage() {
        assertThat(filterOptionsPage.isShowCandidateCountDisplayedOnSearchResultPage(), is(true));
    }
}
