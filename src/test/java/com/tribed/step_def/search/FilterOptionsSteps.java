package com.tribed.step_def.search;

import com.tribed.driver.DriverManager;
import com.tribed.pages.search.FilterOptionsPage;
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

    @Then("^I should be able to see updated candidate count on search result page$")
    public void iShouldBeAbleToSeeUpdatedCandidateCountOnSearchResultPage() {
        assertThat(filterOptionsPage.isShowCandidateCountDisplayedOnSearchResultPage(), is(true));
    }

    @Then("^I should be able to see all selected filters get clear$")
    public void iShouldBeAbleToAllSelectedFiltersGetClear() {
        assertThat(filterOptionsPage.isClearAllFilterWorking(), is(true));
    }

    @Then("^I should be able to see selected culture get clear$")
    public void iShouldBeAbleToSeeSelectedCultureGetClear() {
        assertThat(filterOptionsPage.isClearCultureFilterWorking(), is(true));
    }

    @Then("^I should be able to see selected development get clear$")
    public void iShouldBeAbleToSeeSelectedDevelopmentGetClear() {
        assertThat(filterOptionsPage.isClearDevelopmentFilterWorking(), is(true));
    }

    @Then("^I should be able to see selected well-being get clear$")
    public void iShouldBeAbleToSeeSelectedWellBeingGetClear() {
        assertThat(filterOptionsPage.isClearWellBeingFilterWorking(), is(true));
    }

    @Then("^I should be able to see selected benefits get clear$")
    public void iShouldBeAbleToSeeSelectedBenefitsGetClear() {
        assertThat(filterOptionsPage.isClearBenefitsFilterWorking(), is(true));
    }

    @Then("^I should be able to see hr related skills$")
    public void iShouldBeAbleToSeehrRelatedSkills() {
        assertThat(filterOptionsPage.isFinanceRelatedSkillsDisplayed(), is(true));
    }

    @Then("^I should be able to see development related skills$")
    public void iShouldBeAbleToSeeDevelopmentRelatedSkills() {
        assertThat(filterOptionsPage.isDevelopmentRelatedSkillsDisplayed(), is(true));
    }

    @Then("^I should be able to see all selected filters get clear for skills and Experience$")
    public void iShouldBeAbleToSeeAllSelectedFiltersGetClearForSkillsAndExperience() {
        assertThat(filterOptionsPage.isClearAllFilterWorkingForSkillsAndExperience(), is(true));
    }

    @Then("^I should be able to see selected technical skills get clear$")
    public void iShouldBeAbleToSeeSelectedTechnicalSkillsGetClear() {
        assertThat(filterOptionsPage.isClearAllFilterWorkingForSkillsAndExperience(), is(true));
    }

    @Then("^I should be able to see selected leadership get clear$")
    public void iShouldBeAbleToSeeSelectedLeadershipGetClear() {
        assertThat(filterOptionsPage.isClearAllFilterWorkingForSkillsAndExperience(), is(true));
    }

    @Then("^I should be able to see selected sectors get clear$")
    public void iShouldBeAbleToSeeSelectedSectorsGetClear() {
        assertThat(filterOptionsPage.isClearAllFilterWorkingForSkillsAndExperience(), is(true));
    }

    @Then("^I should be able to see selected qualification get clear$")
    public void iShouldBeAbleToSeeSelectedQualificationGetClear() {
        assertThat(filterOptionsPage.isClearAllFilterWorkingForSkillsAndExperience(), is(true));
    }

    @Then("^I should be able to worktyle tab$")
    public void iShouldBeAbleToWorktyleTab() {
        assertThat(filterOptionsPage.isWorkstyleTabDisplayed(), is(true));
    }
}