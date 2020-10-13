package com.atmecs.demoblaze.testsuite;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.atmecs.demoblaze.constants.Constants;
import com.atmecs.demoblaze.utils.PropertyReader;
import com.beust.jcommander.Parameter;

public class Baseclass {
	public static Properties properties;
	public static WebDriver driver;
	String weburl;
	String browser;
	
	
	@BeforeMethod
	@Parameters("browser")
	public void lunchBrowser(String browser) {
		properties = PropertyReader.readProperties(Constants.testdata_file);
		weburl = properties.getProperty("Url");
		//browser = properties.getProperty("Browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", Constants.chrome_path);
		driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", Constants.firefox_path);
			driver = new FirefoxDriver();
		}
	
		driver.get(weburl);
		String actualTitle = driver.getTitle();
		String expectedTitle = "PHPTRAVELS booking script and system for hotels airline flights tours cars online application - PHPTRAVELS";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}


