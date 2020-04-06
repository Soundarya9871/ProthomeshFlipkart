package com.FlipkartObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.FlipkartGenericLib.FileLib;
import com.FlipkartGenericLib.Fileutil;

public class MyAccount {
	FileLib fl = new FileLib();
	Fileutil ft = new Fileutil();
	@FindBy(xpath = "//div[text( )='Prothomesh']")
	private WebElement MyAccount;

	public WebElement getMyAccount() {
		return MyAccount;
	}

	@FindBy(xpath = "//div[text( )='My Profile']")
	private WebElement MyProfile;

	public WebElement getLogout() {
		return MyProfile;
	}

	@FindBy(xpath = "//span[text()='Edit']")
	private WebElement Edit;

	public WebElement getEdit() {
		return Edit;
	}

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement FirstNameEb;

	public WebElement getFirstNameEb() {
		return FirstNameEb;
	}

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement LastNameEb;

	public WebElement getLastNameEb() {
		return LastNameEb;
	}

	@FindBy(xpath = "//label[@for='Male']")
	private WebElement MaleRb;

	public WebElement getMaleRb() {
		return MaleRb;
	}

	@FindBy(xpath = "//button[text()='SAVE']")
	private WebElement Save;

	public WebElement getSave() {
		return Save;
	}

	@FindBy(xpath="//div[text( )='Manage Addresses']")
	private WebElement Address;
	
	public WebElement getAddress() {
		return Address;
	}
	
	@FindBy(xpath="_1suckO")
	private WebElement img;
	
	public WebElement getImg() {
		return img;
	}
	
	@FindBy(xpath="//span[text( )='Edit']")
	private WebElement EditAdd;
	
	public WebElement getEditAdd() {
		return EditAdd;
	}
	@FindBy(xpath="//input[@name='alternatePhone']")
	private WebElement Alternatephno;
	
	public WebElement getAlternatephno() {
		return Alternatephno;
	}
	public void ProfileEdit(WebDriver driver) {

		ft.moveToElement(driver, MyAccount);
		MyProfile.click();
		Edit.click();
		FirstNameEb.click();
		FirstNameEb.clear();
		FirstNameEb.click();
		FirstNameEb.sendKeys(fl.getExcelData("Flipkart", 1, 1));
		LastNameEb.click();
		LastNameEb.clear();
		LastNameEb.sendKeys(fl.getExcelData("Flipkart", 1, 2));
		MaleRb.click();
		Save.click();
	}
	public void AddressEdit(WebDriver driver) {
		ft.moveToElement(driver, MyAccount);
		MyProfile.click();
		Address.click();
		ft.moveToElement(driver, img);
		EditAdd.click();
		Alternatephno.click();
		Alternatephno.sendKeys(fl.getExcelData("Flipkart", 1, 3));
		Save.click();
		
		
	}

}
