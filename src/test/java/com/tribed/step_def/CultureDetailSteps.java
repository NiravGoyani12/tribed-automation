package com.tribed.step_def;

import com.tribed.pages.CompanyProfilePage;
import com.tribed.pages.CultureDetailPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CultureDetailSteps {

    CultureDetailPage cultureDetailPage =new CultureDetailPage();
    List<Map<String, String>> data;

    @And("^I add some culture$")
    public void iAddSomeCulture() {
        
    }

    @And("^I add some devlopment$")
    public void iAddSomeDevlopment() {
        
    }

    @And("^I add some wellbeing$")
    public void iAddSomeWellbeing() {
        
    }

    @And("^I add some benifits$")
    public void iAddSomeBenifits() {
    }

    @Then("^I should be able to all added items$")
    public void iShouldBeAbleToAllAddedItems() {
    }
}
