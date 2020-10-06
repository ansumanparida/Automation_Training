package com.atmecs.demoblaze.testscripts;

import org.testng.annotations.Test;

import com.atmecs.demoblaze.pages.ContactUsPage;
import com.atmecs.demoblaze.testsuite.Baseclass;

public class ContactUs extends Baseclass {
	@Test(priority = 3)
	public void contactus() {
		ContactUsPage contact = new ContactUsPage();
		contact.contactUs();
	}

}
