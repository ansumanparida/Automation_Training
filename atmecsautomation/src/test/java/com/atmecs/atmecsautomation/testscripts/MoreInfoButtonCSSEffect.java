package com.atmecs.atmecsautomation.testscripts;

import org.testng.annotations.Test;

import com.atmecs.atmecsautomation.pages.HomePage;
import com.atmecs.atmecsautomation.testsuite.Baseclass;

public class MoreInfoButtonCSSEffect extends Baseclass {
	@Test(priority=3)
	public void cssEffect() throws Exception {
		HomePage ce = new HomePage();
		ce.buttonCSSEffect();
		
	}
	

}
