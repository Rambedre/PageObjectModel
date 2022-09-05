package com.base.classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.base.classes.Listenersclass.class)
public class Baseclass {
	public WebDriver Driver;
	
	
	
	@BeforeTest
	public void browserSetup() {
	WebDriverManager.chromedriver().setup();
	Driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(Driver, Duration.ofMinutes(2));
	Actions AC = new Actions(Driver);
	SoftAssert soft = new SoftAssert();
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	Driver.manage().window().maximize();
	Driver.get("https://www.w3schools.com/");
	
	}
	
	
	@AfterTest
	public void browserclose() throws InterruptedException {
	Thread.sleep(3000);
	Driver.quit();
	}
}
