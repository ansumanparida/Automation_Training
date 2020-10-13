package com.atmecs.atmecsautomation.testscripts;

import org.testng.annotations.Test;

import com.atmecs.atmecsautomation.pages.HomePage;
import com.atmecs.atmecsautomation.testsuite.Baseclass;

public class MenuWithSubMenuItems extends Baseclass {
	@Test(priority=5)
	public void menuWithSubMenu() {
		HomePage ms = new HomePage();
		ms.menuWithSubmenu();
		
		
	}

} 
