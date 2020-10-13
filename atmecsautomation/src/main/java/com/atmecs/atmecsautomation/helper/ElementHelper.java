package com.atmecs.atmecsautomation.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementHelper {
	public static void clickElement(WebDriver driver,String xpath ) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public static void sendKeys(WebDriver driver, String xpath, String text ) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		
	}
	public static String getText(WebDriver driver,String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}



}
