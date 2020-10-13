package com.atmecs.atmecsautomation.testscripts;

import org.testng.annotations.Test;

import com.atmecs.atmecsautomation.pages.HomePage;
import com.atmecs.atmecsautomation.testsuite.Baseclass;

public class HyperlinksTest extends Baseclass {
	@Test(priority=2)
	public void doHyperlinkTest() throws Exception {
		HomePage ht = new HomePage();
		ht.hyperLinks();
	}
	

}
