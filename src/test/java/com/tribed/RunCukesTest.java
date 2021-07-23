package com.tribed;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        dryRun = false,
        tags = "@sanity",
        monochrome=true,
        plugin = {
                "html:target/cucumber-reports/report.html", "json:target/cucumber-reports/cucumber.json",
        })
public class RunCukesTest {
}
