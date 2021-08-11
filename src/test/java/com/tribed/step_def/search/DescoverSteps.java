package com.tribed.step_def.search;

import com.tribed.driver.DriverManager;
import com.tribed.pages.search.DiscoverPage;
import com.tribed.pages.search.SearchPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DescoverSteps {

    DriverManager driverManager = new DriverManager();
    DiscoverPage discoverPage=new DiscoverPage();
    List<Map<String, String>> data;
}
