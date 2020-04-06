package com.FlipkartObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.FlipkartGenericLib.FileLib;

public class Home {
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchbox;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public void search() {
		FileLib fl = new FileLib();
		searchbox.sendKeys(fl.getExcelData("Flipkart", 1, 0), Keys.ENTER);
	}

}
