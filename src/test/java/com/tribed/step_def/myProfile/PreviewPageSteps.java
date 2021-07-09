package com.tribed.step_def.myProfile;

import com.tribed.pages.myProfile.PreviewPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class PreviewPageSteps {

     PreviewPage previewPage = new PreviewPage();
    List<Map<String, String>> data;

    @Then("^I should see following details on preview page$")
    public void iShouldAbleToSeePreviewOfCompany(DataTable dataTable) {
        data =  dataTable.asMaps(String.class, String.class);
        assertThat(previewPage.isSloganOnPreviewDisplayed(data.get(0).get("Slogan")), is(true));
        assertThat(previewPage.isSectorOnPreviewDisplayed(data.get(0).get("Sector")), is(true));
    }

    @Then("^the \"([^\"]*)\" text is displayed on preview page$")
    public void theTextIsDisplayedOnPreviewPage(String expText) throws Throwable {
        assertThat(previewPage.getTextOnPreviewPage(), containsString(expText));
    }

    @When("^I click on 'Return to edit' button$")
    public void iClickOnReturnToEditButton() {
        previewPage.clickOnReturnToEdit();
    }
}
