package com.tribed;

import com.tribed.driver.DriverManager;
import com.tribed.utilities.CommonUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.net.MalformedURLException;

public class Hooks {

    private DriverManager driverManager = new DriverManager();
    public static String testDataPropertyFile = "testData.properties";

    @Before
    public void setUp() throws MalformedURLException {
        driverManager.openBrowser();
//        driverManager.runHeadless();
//        driverManager.runOnRemoteHost();
        CommonUtils.loadTestDataProp(testDataPropertyFile);
        driverManager.navigateTo("https://dev.app.tribed.io/");
        driverManager.maxBroser();
        driverManager.applyImplicit();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            driverManager.takeSceenShot(scenario);
        }
        driverManager.closeBrowser();
    }
}
