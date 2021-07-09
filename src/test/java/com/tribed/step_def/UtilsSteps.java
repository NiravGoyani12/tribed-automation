package com.tribed.step_def;

import com.tribed.driver.DriverManager;
import cucumber.api.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class UtilsSteps extends DriverManager {

    @Then("^the url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain(String url) {
        assertThat(getCurrentUrl(), containsString(url));
    }

}
