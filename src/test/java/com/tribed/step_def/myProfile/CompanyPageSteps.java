package com.tribed.step_def.myProfile;

import com.tribed.pages.myProfile.CompanyPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class CompanyPageSteps {

    CompanyPage companyPage =new CompanyPage();
    List<Map<String, String>> data;

    @And("^I enter following details for company page$")
    public void iEnterFollowingDetailsForCompanyPage(DataTable dataTable) throws AWTException, InterruptedException {
        data =  dataTable.asMaps(String.class, String.class);
        companyPage.enterProfileDetail(data.get(0).get("Slogan"), data.get(0).get("Year") ,
                data.get(0).get("Sector"), data.get(0).get("NoOfEmployee"), data.get(0).get("BrandColor"),
                data.get(0).get("AboutUsTitle"),data.get(0).get("AboutUs"),
                data.get(0).get("InfoTitle"),data.get(0).get("MoreInfo"),
                data.get(0).get("CoreValueFirst"),data.get(0).get("FirstDescription"),
                data.get(0).get("CoreValueSecond"),data.get(0).get("SecondDescription"),
                data.get(0).get("CoreValueThird"),data.get(0).get("ThirdDescription"),
                data.get(0).get("TestimonialQuote"),data.get(0).get("TestimonialName"),
                data.get(0).get("TestimonialRole"));
    }

    @And("^I click on publish button$")
    public void iClickOnPublishButton() {
        companyPage.clickOnPublishButton();
    }

    @And("^I hit browser refresh button$")
    public void iHitBrowserRefreshButton() {
        companyPage.refresh();
    }
}
