package com.atmecs.atmecsautomation.testsuite;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.atmecs.atmecsautomation.constants.Constants;
import com.atmecs.atmecsautomation.utils.PropertyReader;


public class Baseclass {
	public static Properties properties;
	public static WebDriver driver;
	String weburl;
	String browser;
	
	
	@BeforeMethod
	public void lunchBrowser() {
		properties = PropertyReader.readProperties(Constants.test_Data);
		weburl = properties.getProperty("Url");
		System.setProperty("webdriver.chrome.driver", Constants.chrome_Path);
		driver = new ChromeDriver();
		driver.get(weburl);
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}
