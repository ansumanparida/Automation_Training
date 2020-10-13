package com.atmecs.atmecsautomation.testscripts;

import org.testng.annotations.Test;

import com.atmecs.atmecsautomation.pages.HomePage;
import com.atmecs.atmecsautomation.testsuite.Baseclass;

public class SubmenuServicesDigitalLife extends Baseclass {
	@Test(priority=4)
	public void subMenuDigitalLife() throws Exception {
		HomePage dl = new HomePage();
		dl.submenuServicesDigitalLife();
	

}
	}
