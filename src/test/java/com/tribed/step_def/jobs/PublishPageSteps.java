package com.tribed.step_def.jobs;
import com.tribed.pages.jobs.PublishPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class PublishPageSteps {

    PublishPage publishPage = new PublishPage();

    @Then("^I should able to see \"([^\"]*)\" message$")
    public void iShouldAbleToSeeMessage(String expMsg) throws Throwable {
        assertThat(publishPage.getPublishSuccessMsg(), containsString(expMsg));
    }

    @Then("^I should able to see return ome button$")
    public void iShouldAbleToSeeReturnOmeButton() {
        assertThat(publishPage.isReturnHomeBtnDisplayed(), is(true));
    }

    @And("^I should able to see edit company button$")
    public void iShouldAbleToSeeEditCompanyButton() {
        assertThat(publishPage.isEditCompanyBtnDisplayed(), is(true));
    }

    @And("^I should able to see view company button$")
    public void iShouldAbleToSeeViewCompanyButton() {
        assertThat(publishPage.isViewCompanyBtnDisplayed(), is(true));
    }

    @When("^I click on return to home$")
    public void iClickOnReturnToHome() {
        publishPage.clickOnReturnToHome();
    }

    @Then("^I can able to see dashboard screen$")
    public void iCanAbleToSeeDashboardScreen() {
        assertThat(publishPage.isDashboardScreenDisplayed(), is(true));
    }

    @When("^I click on edit company tile$")
    public void iClickOnEditCompanyTile() {
        publishPage.clickOnEditCompanyTileNow();
    }

    @When("^I click on view company page$")
    public void iClickOnViewCompanyPage() {
        publishPage.clickOnViewCompanyPage();
    }

    @Then("^I should see company page$")
    public void iShouldSeeCompanyPage() {
        assertThat(publishPage.isCompanyPageOpen(), is(true));
    }
}
