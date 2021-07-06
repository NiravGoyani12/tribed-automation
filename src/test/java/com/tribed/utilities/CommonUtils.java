package com.tribed.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {

	private static Properties prop = new Properties();
	private static FileInputStream fis;

	public static String VALID_USER;
	public static String INVALID_USER;

	public static String VALID_USER_PSW;
	public static String INVALID_USER_PSW;
	public static String NEW_USERNAME;


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
	}


}
