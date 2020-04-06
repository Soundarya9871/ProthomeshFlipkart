package com.FlipkartTestScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.FlipkartGenericLib.Base;
import com.FlipkartObjectRepository.MyCart;

public class Cart extends Base {
	@Test
	public void cart() throws Throwable {
		MyCart c = PageFactory.initElements(driver, MyCart.class);
		c.remove();
	}
}
