package com.tribed.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class CommonUtils {

	private static Properties prop = new Properties();
	private static FileInputStream fis;

	public static String VALID_USER;
	public static String INVALID_USER;

	public static String VALID_USER_PSW;
	public static String INVALID_USER_PSW;
	public static String NEW_USERNAME;
	public static String INVALID_PASSWORD;
	public static String YEAR;
	public static String COMPANY_LOGO;
	public static String COMPANY_SUPPORT_IMAGE;
	public static String COMPANY_IMP_IMAGE;
	public static String JOB_LOGO;
	public static String JOB_TEAM_IMAGE;


	public static void loadTestDataProp(String testDataPropertyFile) {
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+testDataPropertyFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		VALID_USER = prop.getProperty("valid.user");
		INVALID_USER = prop.getProperty("invalid.user");

		VALID_USER_PSW = prop.getProperty("valid.user.psw");
		INVALID_USER_PSW = prop.getProperty("invalid.user.psw");
		NEW_USERNAME=prop.getProperty("valid.new.user");
		INVALID_PASSWORD=prop.getProperty("invalid.password");
		YEAR=prop.getProperty("year");
		COMPANY_LOGO=prop.getProperty("company.page.logo");
		COMPANY_SUPPORT_IMAGE=prop.getProperty("company.page.supportimg");
		COMPANY_IMP_IMAGE=prop.getProperty("company.page.empimg");
		JOB_LOGO=prop.getProperty("job.mainlogo");
		JOB_TEAM_IMAGE=prop.getProperty("job.teamimage");
	}


	public static String getRandomString(int length) {
		final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ";
		StringBuilder result = new StringBuilder();

		while(length > 0) {
			Random rand = new Random();
			result.append(characters.charAt(rand.nextInt(characters.length())));
			length--;
		}
		return result.toString();
	}

	public static int getRandomInt(int No) {
		Random rand = new Random();

		int rand_int1 = rand.nextInt(No);

		return rand_int1;
	}
}
