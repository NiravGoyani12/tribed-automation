package com.tribed.step_def.myProfile;

import com.tribed.pages.myProfile.PublishPage;
import cucumber.api.PendingException;
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
}
