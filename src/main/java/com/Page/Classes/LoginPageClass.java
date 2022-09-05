package com.Page.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	
	WebDriver Driver;
	
	@FindBy(id = "modalusername")
	WebElement UnameTab;
	
	@FindBy(id = "current-password")
	WebElement Passtab;
	
	@FindBy(xpath = "//span[text()='Log in']")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//a[text()='Forgot password?']")
	WebElement ForggetPassLink; 
	
	
	
	public LoginPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void cred() {
		UnameTab.sendKeys("rambedre621@gmail.com");
		Passtab.sendKeys("Admin@123");
	}
	
	public void click() {
		LoginBtn.click();
	}
	
	public WebElement forpss() {
		WebElement b = ForggetPassLink;
		return b;
	}
}
