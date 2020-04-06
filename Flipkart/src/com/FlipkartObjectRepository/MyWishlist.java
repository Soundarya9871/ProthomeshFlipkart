package com.FlipkartObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.FlipkartGenericLib.Fileutil;

public class MyWishlist {
	Fileutil ft = new Fileutil();
	@FindBy(xpath = "//div[text()='Apple iPhone 11 (Black, 128 GB)']/../following-sibling::div/descendant::img[@class='_27LgAY']")
	private WebElement item;

	public WebElement getItem() {
		return item;
	}

	@FindBy(xpath = "//div[text( )='Prothomesh']")
	private WebElement MyAccount;

	public WebElement getMyAccount() {
		return MyAccount;
	}

	@FindBy(xpath = "//div[text( )='Wishlist']")
	private WebElement Wishlist;

	public WebElement getWishlist() {
		return Wishlist;
	}

	@FindBy(xpath = "//img[@class='_27LgAY']")
	private WebElement deletebtn;

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	@FindBy(xpath = "//button[text( )='YES, REMOVE']")
	private WebElement YesRemove;

	public WebElement getYesRemove() {
		return YesRemove;
	}

	public void delete(WebDriver driver) {
		ft.moveToElement(driver, MyAccount);
		Wishlist.click();
		deletebtn.click();
		YesRemove.click();
	}
}
