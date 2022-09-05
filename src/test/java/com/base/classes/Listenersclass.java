package com.base.classes;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenersclass implements ITestListener{
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("****************Test success****************");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("****************Test failed****************");
		TakesScreenshot TS = (TakesScreenshot) Baseclass;
	}

	public void onStart(ITestContext context) {
		System.out.println("****************Test started****************");
	}

	public void onFinish(ITestContext context) {
		System.out.println("****************Test finished****************");
	}
	
}
