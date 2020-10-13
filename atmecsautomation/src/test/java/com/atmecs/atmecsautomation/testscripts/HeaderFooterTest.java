package com.atmecs.atmecsautomation.testscripts;

import org.testng.annotations.Test;

import com.atmecs.atmecsautomation.pages.HomePage;
import com.atmecs.atmecsautomation.testsuite.Baseclass;

public class HeaderFooterTest extends Baseclass {
@Test(priority=1)
public void headerFooter() {
	HomePage hf = new HomePage();
	hf.headerFooter();
	
}
}
