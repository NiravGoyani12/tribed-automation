package com.tribed.step_def.dashBoard;

import com.tribed.pages.dashBoard.DashboardPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DashboardSteps {

    DashboardPage dashboardPage =new DashboardPage();

    @Then("^I should able to accurate live jobs count$")
    public void iShouldAbleToAccurateLiveJobsCount() throws InterruptedException {
        assertThat(dashboardPage.isCorrectLiveJobCountDisplayed(), is(true));
    }

    @When("^I edit team name from edit job screen$")
    public void iEditTeamNameFromEditJobScreen() throws InterruptedException {
        dashboardPage.updateJobTeam();
    }

    @Then("^I should able to see updated team name$")
    public void iShouldAbleToSeeUpdatedTeamName() {
        assertThat(dashboardPage.isEditJobWorking(), is(true));
    }

    @Then("^I should able to see next icon in gray color$")
    public void iShouldAbleToSeeNextIconInGrayColor() {
        assertThat(dashboardPage.isNextBtnWorking(), is(true));
    }

    @Then("^I should able to see previous icon in gray color$")
    public void iShouldAbleToSeePreviousIconInGrayColor() {
        assertThat(dashboardPage.isPreviousBtnWorking(), is(true));
    }
}
