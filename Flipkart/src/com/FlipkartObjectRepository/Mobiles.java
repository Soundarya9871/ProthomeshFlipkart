package com.FlipkartObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.FlipkartGenericLib.Fileutil;

public class Mobiles {
	Fileutil fu = new Fileutil();
	@FindBy(xpath = "//div[text()='Apple iPhone 11 (Black, 128 GB)']/../../div[2]/div/div/div[1]")
	private WebElement Mobiles;

	@FindBy(xpath = "//div[text()='Apple iPhone 11 (Black, 128 GB)']")
	private WebElement Click;

	public WebElement getClick() {
		return Click;
	}

	public WebElement getMobiles() {
		return Mobiles;
	}

	@FindBy(xpath = "//div[@class='_3gDSOa _13EqDR']")
	private WebElement Heart;

	public WebElement getHeart() {
		return Heart;
	}

	public void captureprice() {
		String print = Mobiles.getText();
		System.out.println(print);
	}

	public void addtowishlist() {
		Click.click();
	}

	public void heart(WebDriver driver) {
		fu.switchToNewWindow(driver);
		Heart.click();
	}
}
