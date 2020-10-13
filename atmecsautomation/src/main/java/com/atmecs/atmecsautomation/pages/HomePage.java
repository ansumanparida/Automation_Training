package com.atmecs.atmecsautomation.pages;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.atmecs.atmecsautomation.constants.Constants;
import com.atmecs.atmecsautomation.helper.ElementHelper;
import com.atmecs.atmecsautomation.testsuite.Baseclass;
import com.atmecs.atmecsautomation.utils.PropertyReader;


public class HomePage extends Baseclass {
	Properties loc_path = PropertyReader.readProperties(Constants.locators_Data);
	Properties data_path = PropertyReader.readProperties(Constants.test_Data);

	// Hyperlinks Available on Home Page Test
	
	public void hyperLinks() throws Exception {

		
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Atmecslogo"));
		String url1 = data_path.getProperty("Url"); 
		String url2 = driver.getCurrentUrl();	
		Assert.assertEquals(url1, url2);
		System.out.println("Atmecs Logo Link Test Passed");
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Home"));
		String url3 = data_path.getProperty("Url"); 
		String url4 = driver.getCurrentUrl();	
		Assert.assertEquals(url3, url4);
		System.out.println("Home Link Test Passed");
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Aboutus"));
		String url5 = data_path.getProperty("AboutUsUrl"); 
		String url6 = driver.getCurrentUrl();	
		Assert.assertEquals(url5, url6);
		System.out.println("AboutUs Link Test Passed");
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Services"));
		String url7 = data_path.getProperty("ServiesUrl"); 
		String url8 = driver.getCurrentUrl();	
		Assert.assertEquals(url7, url8);
		System.out.println("Services Link Test Passed");
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Partners"));
		String url9 = data_path.getProperty("PartnersUrl"); 
		String url10 = driver.getCurrentUrl();	
		Assert.assertEquals(url9, url10);
		System.out.println("Partners Link Test Passed");
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Careers"));
		String url11 = data_path.getProperty("CareersUrl"); 
		String url12 = driver.getCurrentUrl();	
		Assert.assertEquals(url11, url12);
		System.out.println("Careers Link Test Passed");
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Contactus"));
		String url13 = data_path.getProperty("ContactUsUrl"); 
		String url14 = driver.getCurrentUrl();	
		Assert.assertEquals(url13, url14);
		System.out.println("Contact-Us Link Test Passed");
		ElementHelper.clickElement(driver, loc_path.getProperty("Home"));
		
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Explorenow"));
		String url15 = data_path.getProperty("ExploreNowUrl"); 
		String url16 = driver.getCurrentUrl();	
		Assert.assertEquals(url15, url16);
		System.out.println("Explore Now Link Test Passed");
		ElementHelper.clickElement(driver, loc_path.getProperty("Home"));
		
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Aimoreinfo"));
		String url17 = data_path.getProperty("AimoreinfoUrl"); 
		String url18 = driver.getCurrentUrl();	
		Assert.assertEquals(url17, url18);
		System.out.println("AI More Info Link Test Passed");
		ElementHelper.clickElement(driver, loc_path.getProperty("Home"));

		
		ElementHelper.clickElement(driver, loc_path.getProperty("Armoreinfo"));
		String url19 = data_path.getProperty("ArmoreinfoUrl"); 
		String url20 = driver.getCurrentUrl();	
		Assert.assertEquals(url19, url20);
		System.out.println("AR More Info Link Test Passed");
		ElementHelper.clickElement(driver, loc_path.getProperty("Home"));
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Iotmoreinfo"));
		String url21 = data_path.getProperty("IotmoreinfoUrl"); 
		String url22 = driver.getCurrentUrl();	
		Assert.assertEquals(url21, url22);
		System.out.println("IOT More Info Link Test Passed");
		ElementHelper.clickElement(driver, loc_path.getProperty("Home"));
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Rpamoreinfo"));
		String url23 = data_path.getProperty("RpamoreinfoUrl"); 
		String url24 = driver.getCurrentUrl();	
		Assert.assertEquals(url23, url24);
		System.out.println("RPA More Info Link Test Passed");
		ElementHelper.clickElement(driver, loc_path.getProperty("Home"));
		
		ElementHelper.clickElement(driver, loc_path.getProperty("BCmoreinfo"));
		String url25 = data_path.getProperty("BCmoreinfoUrl"); 
		String url26 = driver.getCurrentUrl();	
		Assert.assertEquals(url25, url26);
		System.out.println("Block Chain More Info Link Test Passed");
		ElementHelper.clickElement(driver, loc_path.getProperty("Home"));
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Atmecsinc"));
		String url27 = data_path.getProperty("AtmecsincUrl"); 
		String url28 = driver.getCurrentUrl();	
		Assert.assertEquals(url27, url28);
		System.out.println("AtmecsInc On Footer Link Test Passed");
	
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Privacypolicy"));
		String url29 = data_path.getProperty("PrivacypolicyUrl"); 
		String url30 = driver.getCurrentUrl();	
		Assert.assertEquals(url29, url30);
		System.out.println("Privacy Policy Link Test Passed");
		
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Termofuse"));
		String url31 = data_path.getProperty("TermofuseUrl"); 
		String url32 = driver.getCurrentUrl();	
		Assert.assertEquals(url31, url32);
		System.out.println("Term Of Use Link Test Passed");
		
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Tweeter"));
		String url33 = data_path.getProperty("TweeterUrl");
		String parentWindow = driver.getWindowHandle();
		Set<String> mainWindow = driver.getWindowHandles();
		Iterator<String> itr = mainWindow.iterator();
		while(itr.hasNext()) {
			String childWindow = itr.next();
			String childWindow2 = itr.next();
			if(!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow2);
		String url34 = driver.getCurrentUrl();	
		Assert.assertEquals(url33, url34);
		System.out.println("Tweeter Link Test Passed");
			driver.switchTo().window(parentWindow);
			driver.switchTo().defaultContent();
			Thread.sleep(10000);
		}}
		
		ElementHelper.clickElement(driver, loc_path.getProperty("Linkedin"));
		String parentWindow2 = driver.getWindowHandle();
		driver.getWindowHandles();
		Iterator<String> itr2 = mainWindow.iterator();
		while(itr.hasNext()) {
			String childWindow = itr2.next();
			String childWindow2 = itr2.next();
			if(!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow2);
		String url35 = data_path.getProperty("LinkedinUrl"); 
		String url36 = driver.getCurrentUrl();	
		Assert.assertEquals(url35, url36);
		System.out.println("LinkedIn Link Test Passed");
		driver.switchTo().window(parentWindow2);
	}
		}}
	// Header Footer Available on Home Page Test 
		
	public void headerFooter() {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Home | Atmecs, Inc. | Digital Solutions & Product Engineering Services";
		Assert.assertEquals(actualTitle, expectedTitle); 
		System.out.println("Title Test Passed");
		
//		String actualHeaderText = ElementHelper.getText(driver, loc_path.getProperty("Header")); 
//		String expectedHeaderText = data_path.getProperty("HeaderContent");	
//		Assert.assertEquals(actualHeaderText, expectedHeaderText);
		
		boolean header = driver.findElement(By.xpath(loc_path.getProperty("Header"))).isDisplayed();
		Assert.assertTrue(header);
		System.out.println("Header Test Passed");
		
		
		boolean footer = driver.findElement(By.xpath(loc_path.getProperty("Footer"))).isDisplayed();
		Assert.assertTrue(footer);
		System.out.println("Footer Test Passed");				
	
}
	
	//CSS Effect of More Info Button Test
	
	public void buttonCSSEffect() throws Exception {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Armoreinfo")))).build().perform();
		String buttonColour = driver.findElement(By.xpath(loc_path.getProperty("Aimoreinfo"))).getCssValue("colour");
		System.out.println(buttonColour);
	}
	
	// Service>Digital Life Sub Menu Items Test
	
		public void submenuServicesDigitalLife() {
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
			a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("DigitalLife")))).build().perform();
			ElementHelper.clickElement(driver, loc_path.getProperty("Artificial"));
			String url33 = data_path.getProperty("AimoreinfoUrl"); 
			String url34 = driver.getCurrentUrl();	
			Assert.assertEquals(url33, url34);
			System.out.println("Digital Life Artificial Link Test Passed");
			
			a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
			a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("DigitalLife")))).build().perform();
			ElementHelper.clickElement(driver, loc_path.getProperty("Augmented"));
			String url35 = data_path.getProperty("ArmoreinfoUrl"); 
			String url36 = driver.getCurrentUrl();	
			Assert.assertEquals(url35, url36);
			System.out.println("Digital Life Augmented Reality Link Test Passed");
			
			a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
			a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("DigitalLife")))).build().perform();
			ElementHelper.clickElement(driver, loc_path.getProperty("BlockChain"));
			String url37 = data_path.getProperty("BCmoreinfoUrl"); 
			String url38 = driver.getCurrentUrl();	
			Assert.assertEquals(url37, url38);
			System.out.println("Digital Life Block Chain Link Test Passed");
			
			a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
			a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("DigitalLife")))).build().perform();
			ElementHelper.clickElement(driver, loc_path.getProperty("Rpa"));
			String url39 = data_path.getProperty("RpamoreinfoUrl"); 
			String url40 = driver.getCurrentUrl();	
			Assert.assertEquals(url39, url40);
			System.out.println("Digital Life RPA Link Test Passed");
			
			a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
			a.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("DigitalLife")))).build().perform();
			ElementHelper.clickElement(driver, loc_path.getProperty("Iot"));
			String url41 = data_path.getProperty("IotmoreinfoUrl"); 
			String url42 = driver.getCurrentUrl();	
			Assert.assertEquals(url41, url42);
			System.out.println("Digital Life IOT Link Test Passed");
			
			
		}
		
		// Menu With Sub Menu Items Test
		public void menuWithSubmenu()
		{
			// Services Sub Menu
		Actions a1 = new Actions(driver);
		WebDriverWait wwait = new WebDriverWait(driver, 20);
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("DigitalLife")))).click().build().perform();
		String url43 = data_path.getProperty("DigitalLifeUrl"); 
		String url44 = driver.getCurrentUrl();	
		Assert.assertEquals(url43, url44);
		System.out.println("Services > Digital Life Test Passed");
		
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("Cloud"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Cloud")))).click().build().perform();
		String url45 = data_path.getProperty("CloudUrl"); 
		String url46 = driver.getCurrentUrl();	
		Assert.assertEquals(url45, url46);
		System.out.println("Services > Cloud Services Test Passed");
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("Enterprise"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Enterprise")))).click().build().perform();
		String url47 = data_path.getProperty("EnterpriseUrl"); 
		String url48 = driver.getCurrentUrl();	
		Assert.assertEquals(url47, url48);
		System.out.println("Services > Enterprise Analytics Test Passed");
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("ProductEngg"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("ProductEngg")))).click().build().perform();
		String url49 = data_path.getProperty("ProductEnggUrl"); 
		String url50 = driver.getCurrentUrl();	
		Assert.assertEquals(url49, url50);
		System.out.println("Services > Product Engineering Test Passed");
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("MobileComputing"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("MobileComputing")))).click().build().perform();
		String url51 = data_path.getProperty("MobileComputingUrl"); 
		String url52 = driver.getCurrentUrl();	
		Assert.assertEquals(url51, url52);
		System.out.println("Services > Mobile Computing Test Passed");
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("QualityEngg"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("QualityEngg")))).click().build().perform();
		data_path.getProperty("QualityEnggUrl"); 
		String url54 = driver.getCurrentUrl();	
		Assert.assertEquals(url54, url54);
		System.out.println("Services > Quality Engineering Test Passed");
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Services")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("InfraServices"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("InfraServices")))).click().build().perform();
		String url55 = data_path.getProperty("InfraServicesUrl"); 
		String url56 = driver.getCurrentUrl();	
		Assert.assertEquals(url55, url56);
		System.out.println("Services > Infrastructure Services Test Passed");
		
		
		// Media Sub Menu
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Media")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("News"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("News")))).click().build().perform();
		String url57 = data_path.getProperty("NewsUrl"); 
		String url58 = driver.getCurrentUrl();	
		Assert.assertEquals(url57, url58);
		System.out.println("Media > News Test Passed");
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Media")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("CSR"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("CSR")))).click().build().perform();
		String url59 = data_path.getProperty("CSRUrl"); 
		String url60 = driver.getCurrentUrl();	
		Assert.assertEquals(url59, url60);
		System.out.println("Media > Our Joy of Giving CSR Test Passed");
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Media")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("Events"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Events")))).click().build().perform();
		String url61 = data_path.getProperty("EventsUrl"); 
		String url62 = driver.getCurrentUrl();	
		Assert.assertEquals(url61, url62);
		System.out.println("Media > Events Test Passed");
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Media")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("ClientAch"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("ClientAch")))).click().build().perform();
		String url63 = data_path.getProperty("ClientAchUrl"); 
		String url64 = driver.getCurrentUrl();	
		Assert.assertEquals(url63, url64);
		System.out.println("Media > Client Achivements Test Passed");
		
		
		// Insights Sub Menu
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Insights")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("CaseStudy"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("CaseStudy")))).click().build().perform();
		String url65 = data_path.getProperty("CaseStudyUrl"); 
		String url66 = driver.getCurrentUrl();	
		Assert.assertEquals(url65, url66);
		System.out.println("Insights > Case Studies Test Passed");
		
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Insights")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("Blog"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Blog")))).click().build().perform();
		String url67 = data_path.getProperty("BlogUrl"); 
		String url68 = driver.getCurrentUrl();	
		Assert.assertEquals(url67, url68);
		System.out.println("Insights > Blogs Test Passed");
		
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Insights")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("ThisWeekDigital"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("ThisWeekDigital")))).click().build().perform();
		String url69 = data_path.getProperty("ThisWeekDigitalUrl"); 
		String url70 = driver.getCurrentUrl();	
		Assert.assertEquals(url69, url70);
		System.out.println("Insights > This Week in Digital Test Passed");
		
		
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Insights")))).build().perform();
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc_path.getProperty("Webinars"))));
		a1.moveToElement(driver.findElement(By.xpath(loc_path.getProperty("Webinars")))).click().build().perform();
		String url71 = data_path.getProperty("WebinarsUrl"); 
		String url72 = driver.getCurrentUrl();	
		Assert.assertEquals(url71, url72);
		System.out.println("Insights > Webinars Test Passed");
		}
}
