package com.tribed;

import com.tribed.driver.DriverManager;
import com.tribed.utilities.CommonUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {


    private DriverManager driverManager = new DriverManager();

    public static String testDataPropertyFile = "testData.properties";

    @Before
    public void setUp() {
        driverManager.openBrowser();
        CommonUtils.loadTestDataProp(testDataPropertyFile);
        driverManager.navigateTo("https://dev.app.tribed.io/");
        driverManager.maxBroser();
        driverManager.applyImplicit();
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()){
            driverManager.takeSceenShot(scenario);
        }

        driverManager.closeBrowser();
    }
}
