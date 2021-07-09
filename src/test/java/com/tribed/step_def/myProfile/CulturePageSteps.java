package com.tribed.step_def.myProfile;

import com.tribed.pages.myProfile.CulturePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class CulturePageSteps {

    CulturePage culturePage =new CulturePage();

    @Then("^the \"([^\"]*)\" text is visible$")
    public void theTextIsVisible(String expText) throws Throwable {
        assertThat(culturePage.getTextOnCulturePage(), containsString(expText));
    }
}
