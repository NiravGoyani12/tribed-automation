package com.tribed.step_def.jobs;
import com.tribed.pages.jobs.jobPage;
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
        jobPage.selectAnySkillAndSave();
    }

    @Then("^added technical skill should saved and displayed$")
    public void addedTechnicalSkillShouldSavedAndDisplayed() {
        assertThat(jobPage.isAddedSkillSavedAndDisplayed(), is(true));
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

    @Then("^added leadership skill should saved and displayed$")
    public void addedLeadershipSkillShouldSavedAndDisplayed() {
        assertThat(jobPage.isAddedSkillSavedAndDisplayed(), is(true));
    }

    @Then("^added sectors skill should saved and displayed$")
    public void addedSectorsSkillShouldSavedAndDisplayed() {
        assertThat(jobPage.isAddedSkillSavedAndDisplayed(), is(true));
    }

    @Then("^added qualifications skill should saved and displayed$")
    public void addedQualificationsSkillShouldSavedAndDisplayed() {
        assertThat(jobPage.isAddedSkillSavedAndDisplayed(), is(true));
    }

    @When("^I select any leadership skill and save$")
    public void iSelectAnyLeadershipSkillAndSave() {
        jobPage.selectAnySkillAndSave();
    }

    @When("^I select any sector and save$")
    public void iSelectAnySectorAndSave() {
        jobPage.selectAnySkillAndSave();
    }

    @When("^I select any qualification and save$")
    public void iSelectAnyQualificationAndSave() {
        jobPage.selectAnySkillAndSave();
    }

    @When("^I click on about this job button$")
    public void iClickOnAboutThisJobButton() {
        jobPage.clickOnAboutThisJobBtn();
    }

    @Then("^I should be able to see selected job details$")
    public void iShouldBeAbleToSeeSelectedJobDetails() {
        assertThat(jobPage.isAboutThisJobPageOpen(), is(true));
    }

    @Then("^I should not able to see salary on preview$")
    public void iShouldNotAbleToSeeSalaryOnPreview(DataTable dataTable) {
        data =  dataTable.asMaps(String.class, String.class);
        assertThat(jobPage.isSalaryVisible(data.get(0).get("MinSalary")), is(false));
        //assertThat(previewPage.isTeamOnPreviewDisplayed(data.get(0).get("Team")), is(true));
    }

    @And("^I click on salary not visible checkbox$")
    public void iClickOnSalaryNotVisibleCheckbox() {
        jobPage.clickOnIsSalaryHiddeenchk();
    }

    @And("^I select any technical skill$")
    public void iSelectAnyTechnicalSkill() {
        jobPage.selectTechnicalSkill();
    }

    @And("^I click on next section$")
    public void iClickOnNextSection() {
        jobPage.clickOnNextSection();
    }

    @And("^I select any leadership skill$")
    public void iSelectAnyLeadershipSkill() {
        jobPage.selectLeadership();
    }

    @And("^I select any sector$")
    public void iSelectAnySector() {
        jobPage.selectSector();
    }

    @And("^I select any qualification$")
    public void iSelectAnyQualification() {
        jobPage.selectQualification();
    }

    @When("^I click on save and exit$")
    public void iClickOnSaveAndExit() {
        jobPage.clickonSaveAndExitBtn();
    }

    @Then("^I should be able to see all selected skills sector and qualification$")
    public void iShouldBeAbleToSeeAllSelectedSkillsSectorAndQualification() {
        assertThat(jobPage.isAddedSkillSavedAndDisplayed(), is(true));
        assertThat(jobPage.isAddedLeadershipDisplayed(), is(true));
        assertThat(jobPage.isAddedSectorDisplayed(), is(true));
        assertThat(jobPage.isAddedQualificationDisplayed(), is(true));
    }
}
