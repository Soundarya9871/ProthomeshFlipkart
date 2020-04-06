package com.FlipkartTestScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.FlipkartGenericLib.Base;
import com.FlipkartObjectRepository.MyAccount;

public class Profile extends Base {
	@Test
	public void profile() {
		MyAccount ma = PageFactory.initElements(driver, MyAccount.class);
		ma.ProfileEdit(driver);
	}
}