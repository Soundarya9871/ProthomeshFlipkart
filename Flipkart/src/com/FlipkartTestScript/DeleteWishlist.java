package com.FlipkartTestScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.FlipkartGenericLib.Base;
import com.FlipkartObjectRepository.MyWishlist;

public class DeleteWishlist extends Base {
	@Test
	public void DeleteWishlist() {
		MyWishlist mw = PageFactory.initElements(driver, MyWishlist.class);
		mw.delete(driver);
	}
}
