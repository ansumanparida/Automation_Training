package com.atmecs.demoblaze.testscripts;

import org.testng.annotations.Test;

import com.atmecs.demoblaze.pages.RegistrationPage;
import com.atmecs.demoblaze.testsuite.Baseclass;

public class Registration extends Baseclass {
	@Test(priority = 1)
	public void register() {
		RegistrationPage register = new RegistrationPage();
		register.doRegister();
		
	}

}
