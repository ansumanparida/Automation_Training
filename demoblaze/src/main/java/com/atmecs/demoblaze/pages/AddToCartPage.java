package com.atmecs.demoblaze.pages;

import java.util.Properties;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.demoblaze.constants.Constants;
import com.atmecs.demoblaze.helper.ElementHelper;
import com.atmecs.demoblaze.testsuite.Baseclass;
import com.atmecs.demoblaze.utils.PropertyReader;

public class AddToCartPage extends Baseclass{
	
		Properties loc_path;
		Properties data_path;

		public void addToCart() throws Exception {
			loc_path = PropertyReader.readProperties(Constants.locators_file);
			data_path = PropertyReader.readProperties(Constants.testdata_file);

			ElementHelper.clickElement(driver, loc_path.getProperty("Home"));
			ElementHelper.clickElement(driver, loc_path.getProperty("MobileLink"));
			ElementHelper.clickElement(driver, loc_path.getProperty("Addtocart"));

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			ElementHelper.clickElement(driver, loc_path.getProperty("CartLink"));

			Thread.sleep(5000);
			ElementHelper.clickElement(driver, loc_path.getProperty("Placeorder"));
			ElementHelper.sendKeys(driver, loc_path.getProperty("Name"), data_path.getProperty("Name"));
			ElementHelper.sendKeys(driver, loc_path.getProperty("Country"), data_path.getProperty("Country"));
			ElementHelper.sendKeys(driver, loc_path.getProperty("City"), data_path.getProperty("City"));
			ElementHelper.sendKeys(driver, loc_path.getProperty("Creditcard"), data_path.getProperty("Creditcard"));
			ElementHelper.sendKeys(driver, loc_path.getProperty("Month"), data_path.getProperty("Month"));
			ElementHelper.sendKeys(driver, loc_path.getProperty("Year"), data_path.getProperty("Year"));

			ElementHelper.clickElement(driver, loc_path.getProperty("PurchaseButton"));
			ElementHelper.clickElement(driver, loc_path.getProperty("OkButton"));
		
	}


}
