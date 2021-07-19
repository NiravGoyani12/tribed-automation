package com.tribed.step_def.myProfile;

import com.tribed.pages.myProfile.PublishPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

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
}
