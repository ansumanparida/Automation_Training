package com.atmecs.demoblaze.testscripts;

import org.testng.annotations.Test;

import com.atmecs.demoblaze.pages.LoginPage;
import com.atmecs.demoblaze.testsuite.Baseclass;

public class Login extends Baseclass {
	@Test( priority=2)
	public void login() {
		LoginPage log = new LoginPage();
		log.doLogin();
	}

}
