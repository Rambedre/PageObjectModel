package com.Page.Classes;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	
	WebDriver Driver;
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement HomePageLoginBtn; 
	
	@FindBy(xpath = "//a[@href='https://www.w3schools.com ']")
	private WebElement pageLogo;
	
	@FindBy(xpath = "//title[text()='W3Schools Online Web Tutorials']")
	private WebElement title;
	
	@FindBy(xpath = "//a[@id='navbtn_tutorials']")
	private WebElement tutorials;
	
	@FindBy(xpath = "//h3[text()='HTML and CSS']")
	private WebElement h3;
	
	@FindBy(xpath ="//h3[text()='HTML and CSS']/../a")
	private List<WebElement> HTMLANDCSS;
	
	@FindBy(xpath = "//span[@onclick=\"w3_close_nav('tutorials')\"]")
	private WebElement HTLMANDCSSClose;
	
	@FindBy(xpath = "//h1[text()='Learn to Code']")
	private WebElement LTCtext;
	
	@FindBy(id = "search2")
	private WebElement sbox;
	
	@FindBy(xpath = "//div[@id='listofsearchresults']/..//a")
	private List<WebElement> sboxappear;
	
	public HomePageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);   //	or	PageFactory.initElements(driver,HomePageClass);

	}
	
	public void HomeBtn() {
		HomePageLoginBtn.click();
		}
	
	public void sbox() {
		sbox.click();
		sbox.sendKeys("HTML");
	}
	
	public WebElement sboxlst() {
		List<WebElement> list = sboxappear;
		for(WebElement l: list) {
			System.out.println(l.getText());
		}
		return list.get(0);
	}
	
	public void sboclr() {
		sbox.clear();
	}
	
	public void tutorialsbtn() {
		tutorials.click();
	}
	
	public void storedata() {
		List<WebElement> data = HTMLANDCSS;
		for(WebElement d: data) {
			System.out.println(d.getText());
		}
	}
	
	public void closelist() {
		HTLMANDCSSClose.click();
	}
	
//	public String getTitte() {
//	String s = Driver.getTitle();
//	System.out.println(s);
//	return s;
//	}
	
	public boolean logotest() {
		boolean logo = pageLogo.isDisplayed();
		return logo;
	}
	
	public String pagetext() {
		String a = LTCtext.getText();
		return a;
	}
	
	public String titletest() {
		String a = title.getText();
		System.out.println(a);
		return a;
		}
}
