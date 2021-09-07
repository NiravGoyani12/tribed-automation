package com.tribed.step_def.myProfile;

import com.tribed.pages.myProfile.EditTileImagePage;
import com.tribed.pages.myProfile.TermsConditionPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.*;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TermsConditionSteps {

    TermsConditionPage termsConditionPage =new TermsConditionPage();
    List<Map<String, String>> data;

    @When("^I click on T&C link$")
    public void iClickOnTCLink() {
        termsConditionPage.clickOnTermsLink();
    }

    @Then("^I should able to see T&C popup$")
    public void iShouldAbleToSeeTCPopup() {
        assertThat(termsConditionPage.isTermsLinkWorking(), is(true));
    }

    @When("^I click on Privacy policy link$")
    public void iClickOnPrivacyPolicyLink() {
        termsConditionPage.clickOnPrivacyPolicyLink();
    }

    @Then("^I should able to see Privacy policy popup$")
    public void iShouldAbleToSeePrivacyPolicyPopup() {
        assertThat(termsConditionPage.isPrivacyPolicyLinkWorking(), is(true));
    }

    @When("^I click on cross icon$")
    public void iClickOnCrossIcon() {
        termsConditionPage.clickOnCloseBtn();
    }

    @Then("^I should able to close T&C window$")
    public void iShouldAbleToCloseTCWindow() {
        assertThat(termsConditionPage.isTermsLinkWorking(), is(false));
    }

    @Then("^I should able to close privacy policy window$")
    public void iShouldAbleToClosePrivacyPolicyWindow() {
        assertThat(termsConditionPage.isPrivacyPolicyLinkWorking(), is(false));
    }
}
