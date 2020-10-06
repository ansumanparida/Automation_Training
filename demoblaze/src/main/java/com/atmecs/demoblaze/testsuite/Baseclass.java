package com.atmecs.demoblaze.testsuite;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.atmecs.demoblaze.constants.Constants;
import com.atmecs.demoblaze.utils.PropertyReader;

public class Baseclass {
	public static Properties properties;
	public static WebDriver driver;
	String weburl;
	String browser;
	
	
	@BeforeMethod
	public void lunchBrowser() {
		properties = PropertyReader.readProperties(Constants.testdata_file);
		weburl = properties.getProperty("Url");
		browser = properties.getProperty("Browser");

		System.setProperty("webdriver.chrome.driver", Constants.chrome_path);
		if (browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	}
	
		driver.get(weburl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}


