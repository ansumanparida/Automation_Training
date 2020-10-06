package com.atmecs.demoblaze.pages;

import java.util.Properties;

import com.atmecs.demoblaze.constants.Constants;
import com.atmecs.demoblaze.helper.ElementHelper;
import com.atmecs.demoblaze.testsuite.Baseclass;
import com.atmecs.demoblaze.utils.PropertyReader;

public class LoginPage extends Baseclass {
	Properties loc_path;
	Properties data_path;

	public void doLogin() {
		loc_path = PropertyReader.readProperties(Constants.locators_file);
		data_path = PropertyReader.readProperties(Constants.testdata_file);

		ElementHelper.clickElement(driver, loc_path.getProperty("Login"));

		ElementHelper.sendKeys(driver, loc_path.getProperty("LoginUsername"), data_path.getProperty("LoginUsername"));
		ElementHelper.sendKeys(driver, loc_path.getProperty("LoginPassword"), data_path.getProperty("LoginPassword"));

		ElementHelper.clickElement(driver, loc_path.getProperty("LoginButton"));

	}

}
