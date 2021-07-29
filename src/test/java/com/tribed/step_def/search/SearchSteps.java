package com.tribed.step_def.search;

import com.tribed.driver.DriverManager;
import com.tribed.pages.search.SearchPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SearchSteps {

    DriverManager driverManager = new DriverManager();
    SearchPage searchPage=new SearchPage();
    List<Map<String, String>> data;
    @And("^I enter company for searching$")
    public void iEnterCompanyForSearching(DataTable dataTable) {
        data =  dataTable.asMaps(String.class, String.class);
        searchPage.enterSearchText(data.get(0).get("SearchText"));
    }

    @When("^I click on search icon$")
    public void iClickOnSearchIcon() {
        searchPage.clickonSearchIcon();
    }

    @Then("^I should be able see see view profile and filteroptions$")
    public void iShouldBeAbleSeeSeeViewProfileAndFilteroptions() {
        assertThat(searchPage.isSeeFullProfileDisplayed(), is(true));
        assertThat(searchPage.isFilterOptionsDisplayed(), is(true));
    }

    @When("^I click on see full profile$")
    public void iClickOnSeeFullProfile() {
        searchPage.clickOnSeeFullProfile();
    }

    @Then("^I should able to see full user profile$")
    public void iShouldAbleToSeeFullUserProfile() {
        assertThat(searchPage.isSelectedUserFullProfileDisplayed(), is(true));
    }

}
