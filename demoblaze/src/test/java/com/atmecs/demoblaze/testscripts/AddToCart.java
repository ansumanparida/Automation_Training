package com.atmecs.demoblaze.testscripts;

import org.testng.annotations.Test;

import com.atmecs.demoblaze.pages.AddToCartPage;
import com.atmecs.demoblaze.testsuite.Baseclass;

public class AddToCart extends Baseclass {
	@Test(priority = 4)
	public void addtoCart() throws Exception {
		AddToCartPage adding = new AddToCartPage();
		adding.addToCart();

	}


}
