package com.tribed.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

    public static String testDataPropertyFile = "testData.properties";
	public static Logger log = Logger.getLogger(TestBase.class);
	public WebDriverWait wait;

	public static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}