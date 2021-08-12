package com.tribed.step_def.myProfile;

import com.tribed.pages.myProfile.CulturePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class CulturePageSteps {

    CulturePage culturePage =new CulturePage();

    @Then("^the \"([^\"]*)\" text is visible$")
    public void theTextIsVisible(String expText) throws Throwable {
        assertThat(culturePage.getTextOnCulturePage(), containsString(expText));
    }

    @And("^I click on culture page tab$")
    public void iClickOnCulturePageTab() {
        culturePage.clickOnTabCulturePage();
    }

    @And("^I click on Add to Culture button$")
    public void iClickOnAddToCultureButton() {
        culturePage.clickAddCultureTile();
    }

    @And("^I select any culture and save$")
    public void iSelectAnyCultureAndSave() {
        culturePage.selectCultureAndSave();
    }

    @Then("^added culture should be saved and displayed$")
    public void addedCultureShouldSavedAndDisplayed() {
        assertThat(culturePage.isAddCultureSavedAndDisplayed(), is(true));
    }
}
