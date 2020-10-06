package com.atmecs.demoblaze.pages;

import java.util.Properties;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.demoblaze.constants.Constants;
import com.atmecs.demoblaze.helper.ElementHelper;
import com.atmecs.demoblaze.testsuite.Baseclass;
import com.atmecs.demoblaze.utils.PropertyReader;

public class ContactUsPage extends Baseclass {

		Properties loc_path;
		Properties data_path;

		public void contactUs() {
			loc_path = PropertyReader.readProperties(Constants.locators_file);
			data_path = PropertyReader.readProperties(Constants.testdata_file);

			ElementHelper.clickElement(driver, loc_path.getProperty("ContactUs"));

			ElementHelper.sendKeys(driver, loc_path.getProperty("ContactEmail"), data_path.getProperty("ContactEmail"));
			ElementHelper.sendKeys(driver, loc_path.getProperty("ContactName"), data_path.getProperty("ContactName"));
			ElementHelper.sendKeys(driver, loc_path.getProperty("Message"), data_path.getProperty("Message"));

			ElementHelper.clickElement(driver, loc_path.getProperty("SendMessageButton"));
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		}

	

}
