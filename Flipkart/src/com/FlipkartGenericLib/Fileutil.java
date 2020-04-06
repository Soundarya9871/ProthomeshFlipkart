package com.FlipkartGenericLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Fileutil {
	public void selectByValue(WebElement webelement, String value) {
		Select sel = new Select(webelement);
		sel.selectByValue(value);
	}

	public String switchToNewWindow(WebDriver driver) {
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String pid = it.next();
		String cid = it.next();
		driver.switchTo().window(cid);
		return pid;

	}

	public void moveToElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
	}
}
