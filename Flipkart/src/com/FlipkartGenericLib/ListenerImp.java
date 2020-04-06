package com.FlipkartGenericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImp implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Date d = new Date();
		int day = d.getDay();
		String[] dateArr = d.toString().split(" ");
		String month = dateArr[1];
		String year = dateArr[5];
		String time = dateArr[3].replaceAll(":", "-");
		String methodname = result.getMethod().getMethodName();
		EventFiringWebDriver fire = new EventFiringWebDriver(Base.scrndriver);
		File src = fire.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"./screenshots/" + methodname + "_" + day + "_" + month + "_" + year + "_" + time + ".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
