package com.Page.Classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilePage {
	WebDriver Driver;
	
	public profilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='Ram']")
	WebElement myname;
	
	public WebElement name() throws InterruptedException {
		WebElement n = myname;
		System.out.println("n");
		return n;
	}
	
	@FindBy(xpath = "//div[text()='My learning']")
	WebElement Mylename2;
	
	public String myler() {
		String n = Mylename2.getText();
		return n;
	}
	
	@FindBy(xpath = "//nav[@id='navigation']/..//a")
	List<WebElement> options;
	
	public void Options(){
		List<WebElement> list = options;
		for(WebElement l:list) {
			System.out.println(l.getText());
		}
		
	}
	
	@FindBy(xpath = "//button[@title='Log out']")
	WebElement LoutBtn;
	
	public void loutbtn() {
		LoutBtn.click();
	}
	
	
}
