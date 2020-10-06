package com.atmecs.demoblaze.pages;

import java.util.Properties;

import com.atmecs.demoblaze.constants.Constants;
import com.atmecs.demoblaze.helper.ElementHelper;
import com.atmecs.demoblaze.testsuite.Baseclass;
import com.atmecs.demoblaze.utils.PropertyReader;

public class RegistrationPage extends Baseclass {

		Properties loc_path;
		Properties data_path;

		public void doRegister() {
			loc_path = PropertyReader.readProperties(Constants.locators_file);
			data_path = PropertyReader.readProperties(Constants.testdata_file);
			ElementHelper.clickElement(driver, loc_path.getProperty("Signup"));
			ElementHelper.sendKeys(driver, loc_path.getProperty("SignupUsername"),
					data_path.getProperty("SignupUsername"));
			ElementHelper.sendKeys(driver, loc_path.getProperty("SignupPassword"),
					data_path.getProperty("SignupPassword"));
			ElementHelper.clickElement(driver, loc_path.getProperty("SignupButton"));
		}

	}


