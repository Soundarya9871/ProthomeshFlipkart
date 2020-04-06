package com.FlipkartGenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.FlipkartObjectRepository.Login;
import com.FlipkartObjectRepository.Logout;

public class Base {
	public FileLib flib = new FileLib();
	public WebDriver driver;
	public WebDriverWait wait;
	public static WebDriver scrndriver;

	@BeforeClass
	public void configBC() {
		if (flib.getPropertyKeyValue("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			scrndriver = driver;
		} else if (flib.getPropertyKeyValue("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
			scrndriver = driver;
		} else {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			scrndriver = driver;
		}

		driver.manage().window().maximize();
		driver.get(flib.getPropertyKeyValue("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
	}

	@BeforeMethod
	public void configBM() {
		Login l = PageFactory.initElements(driver, Login.class);
		l.Login(flib.getPropertyKeyValue("username"), flib.getPropertyKeyValue("password"));
	}

	@AfterMethod
	public void configAM() {
//		Logout lt = PageFactory.initElements(driver, Logout.class);
//		lt.logout(driver);
	}

	@AfterClass
	public void configAC() throws Throwable {
//		Thread.sleep(10000);
//		driver.close();
	}
}
