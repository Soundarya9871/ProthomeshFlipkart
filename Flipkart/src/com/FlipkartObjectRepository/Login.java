package com.FlipkartObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement usernameEb;

	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement passwordEb;

	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement loginbtn;

	public WebElement getUsernameEb() {
		return usernameEb;
	}

	public WebElement getPasswordEb() {
		return passwordEb;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void Login(String userName, String password) {
		usernameEb.sendKeys(userName);
		passwordEb.sendKeys(password);
		loginbtn.click();

	}

}
