package com.FlipkartObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.FlipkartGenericLib.FileLib;
import com.FlipkartGenericLib.Fileutil;

public class MyCart {
	FileLib fl = new FileLib();
	Fileutil ft = new Fileutil();

	@FindBy(xpath = "//span[text()='Cart']")
	private WebElement cart;

	public WebElement getCart() {
		return cart;
	}

	@FindBy(xpath = "//div[text( )='Remove']")
	private WebElement Remove;

	public WebElement getRemoveBasket() {
		return Remove;
	}

	public void remove() throws Throwable {
		Thread.sleep(2000);
		cart.click();
		Remove.click();
		Remove.click();
	}
}
