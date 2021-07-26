package com.tribed.step_def;

import com.tribed.driver.DriverManager;
import com.tribed.pages.LoginPage;
import com.tribed.pages.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class SearchSteps {

    DriverManager driverManager = new DriverManager();
    SearchPage searchPage=new SearchPage();


}
