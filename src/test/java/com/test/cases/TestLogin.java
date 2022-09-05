package com.test.cases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Page.Classes.HomePageClass;
import com.Page.Classes.LoginPageClass;
import com.Page.Classes.profilePage;
import com.base.classes.Baseclass;

public class TestLogin extends Baseclass {

	
//
//	SoftAssert soft = new SoftAssert();

	@Test(priority = 1)
	public void logocheck() throws InterruptedException {
		HomePageClass HPC = new HomePageClass(Driver);
		SoftAssert soft = new SoftAssert();
		soft.assertFalse(HPC.logotest());
		soft.assertAll();
	}

	@Test(priority = 2, enabled = false)
	public void titlechk() {
		HomePageClass HPC = new HomePageClass(Driver);
		String Expected_Title = "W3Schools Online Web Tutorials";
		HPC.titletest();
		Assert.assertEquals(Expected_Title, HPC.titletest());
	}

	@Test(priority = 3)
	public void pagetext() {
		HomePageClass HPC = new HomePageClass(Driver);
		SoftAssert soft = new SoftAssert();
		String Expected_Text = "Learn o Code";
		soft.assertEquals(Expected_Text, HPC.pagetext());
		soft.assertAll();
	}

	@Test(priority = 4)
	public void Tutorials_Tab() throws InterruptedException {
		HomePageClass HPC = new HomePageClass(Driver);
		HPC.tutorialsbtn();
		Thread.sleep(2000);
		HPC.storedata();
		HPC.closelist();
	}

	@Test(priority = 5)
	public void sbox() throws InterruptedException {
		HomePageClass HPC = new HomePageClass(Driver);
		HPC.sbox();
		Thread.sleep(2000);
		Actions AC = new Actions(Driver);
		AC.moveToElement(HPC.sboxlst()).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		HPC.sboclr();
	}

	@Test(priority = 6)
	public void logbtn() {
		HomePageClass HPC = new HomePageClass(Driver);
		HPC.HomeBtn();
	}

	@Test(priority = 7, dependsOnMethods = "logbtn")
	public void logcred() {
		LoginPageClass LPC = new LoginPageClass(Driver);
		LPC.cred();
		LPC.click();
	}

	@Test(priority = 8, dependsOnMethods = "logcred")
	public void forgetpass() {
		LoginPageClass LPC = new LoginPageClass(Driver);
		Actions AC = new Actions(Driver);
		AC.moveToElement(LPC.forpss()).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
	}

	@Test(priority = 9, dependsOnMethods = "logcred")
	public void profilepage() throws InterruptedException {
		profilePage PP = new profilePage(Driver);
		String expected_Text1 = "H Ram";
		String ACtual_text = PP.name().getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ACtual_text, expected_Text1);
		soft.assertAll();
	}

	@Test(priority = 10, dependsOnMethods = "logcred")
	public void myler() throws InterruptedException {
		profilePage PP = new profilePage(Driver);
		String expected_text = "Mylearning";
		SoftAssert soft = new SoftAssert();
		Thread.sleep(2000);
		soft.assertEquals(expected_text, PP.myler());
		soft.assertAll();
	}

	@Test(priority = 11, dependsOnMethods = "logcred")
	public void options() {
		profilePage PP = new profilePage(Driver);
		PP.Options();
	}

	@Test(priority = 12, dependsOnMethods = "logcred")
	public void logout() {
		profilePage PP = new profilePage(Driver);
		PP.loutbtn();
	}
}
