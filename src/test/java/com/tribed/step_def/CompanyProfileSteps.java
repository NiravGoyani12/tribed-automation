package com.tribed.step_def;
import com.tribed.pages.CompanyProfilePage;
import com.tribed.pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.DataTable;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
public class CompanyProfileSteps {

    CompanyProfilePage CompanyProfilePage =new CompanyProfilePage();
    List<Map<String, String>> data;



    @And("^I enter below company profile details$")
    public void iEnterBelowCompanyProfileDetails(DataTable dataTable) {
        data =  dataTable.asMaps(String.class, String.class);
        CompanyProfilePage.enterProfileDetail(data.get(0).get("Slogan"), data.get(0).get("Year") , data.get(0).get("Sector"), data.get(0).get("NoOfEmployee"), data.get(0).get("BrandColor"),data.get(0).get("AboutUsTitle"),data.get(0).get("AboutUs"),data.get(0).get("InfoTitle"),data.get(0).get("MoreInfo"),data.get(0).get("CoreValueFirst"),data.get(0).get("FirstDescription"),data.get(0).get("CoreValueSecond"),data.get(0).get("SecondDescription"),data.get(0).get("CoreValueThird"),data.get(0).get("ThirdDescription"),data.get(0).get("TestimonialQuote"),data.get(0).get("TestimonialName"),data.get(0).get("TestimonialRole"));
    }

    @And("^i click on 'Save and go to cultural page'$")
    public void iClickOnSaveAndGoToCulturalPage() {
        CompanyProfilePage.clickonSaveAndGoToCulturalPageButton();

    }

    @Then("^I should be able to Cultural page$")
    public void iShouldBeAbleToCulturalPage() throws InterruptedException {
        assertThat(CompanyProfilePage.isCulturalPageOpen(), is(true));
    }

    @When("^I enter valid email and password$")
    public void iEnterValidEmailAndPassword(DataTable dataTable) {
        data =  dataTable.asMaps(String.class, String.class);
        CompanyProfilePage.enterEmailAndPassword(data.get(0).get("Email"), data.get(0).get("CreatePassword"));
    }

    @And("^i click on Preview button$")
    public void iClickOnPreviewButton() {
        CompanyProfilePage.clickOnPreviewButton();
    }

    @Then("^i should able to see preview of company$")
    public void iShouldAbleToSeePreviewOfCompany(DataTable dataTable) {
        data =  dataTable.asMaps(String.class, String.class);
        assertThat(CompanyProfilePage.isPreviewWorking(data.get(0).get("Slogan")), is(true));


    }

    @And("^i click on publish button$")
    public void iClickOnPublishButton() {
        CompanyProfilePage.clickOnPublishButton();
    }

    @Then("^i should able to see 'Congratulations!' message$")
    public void iShouldAbleToSeeCongratulationsMessage() {
        assertThat(CompanyProfilePage.isPublishWorking(), is(true));
    }
}
