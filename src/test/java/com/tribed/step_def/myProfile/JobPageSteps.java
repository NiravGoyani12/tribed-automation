package com.tribed.step_def.myProfile;

import com.tribed.pages.myProfile.jobPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class JobPageSteps {
    jobPage jobPage =new jobPage();
    List<Map<String, String>> data;

    @And("^I click on job page tab$")
    public void iClickOnJobPageTab() {
        jobPage.clickOnTabJobPage();
    }

    @And("^I click on Add Technical button$")
    public void iClickOnAddTechnicalButton() {
        jobPage.clickAddTechnicalSkill();
    }

    @And("^I select any technical skill and save$")
    public void iSelectAnyTechnicalSkillAndSave() {
        jobPage.selectAndSaveSkillAndExperienced();
    }

    @Then("^added technical skill should saved and displayed$")
    public void addedTechnicalSkillShouldSavedAndDisplayed() {
        assertThat(jobPage.isAddSkillSavedAndDisplayed(), is(true));
    }

    @And("^I click on Add Job button$")
    public void iClickOnAddJobButton() {
        jobPage.clickAddJobBtn();

    }
    @And("^I click on add sector button$")
    public void iClickOnAddSectorButton() {
        jobPage.clickAddSector();
    }

    @And("^I click on add leadership button$")
    public void iClickOnAddLeadershipButton() {
        jobPage.clickAddLeaderShipSkill();
    }

    @And("^I click on add qualification button$")
    public void iClickOnAddQualificationButton() {
        jobPage.clickAddQualification();
    }


    @When("^I enter following details for job page$")
    public void iEnterFollowingDetailsForJobPage(DataTable dataTable) throws InterruptedException {
        data =  dataTable.asMaps(String.class, String.class);
        jobPage.enterJobDetail(data.get(0).get("JobTitle"), data.get(0).get("Team") ,
                data.get(0).get("Office Location"), data.get(0).get("MinSalary"), data.get(0).get("MaxSalary"),
                data.get(0).get("InfoTitle"),data.get(0).get("Info"));


    }
}
