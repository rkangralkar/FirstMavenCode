package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.MyProfilePage;
import com.qa.pages.MyaccountPage;
import com.qa.util.TestUtil;

public class MyProfilePageTest extends TestBase {
	LoginPage loginPage;
	MyaccountPage accountPage;
	MyProfilePage profilePage;

	public MyProfilePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		startBrowserURL();
		loginPage = new LoginPage();
		accountPage = loginPage.ValidLogin(prop.getProperty("username"),
				prop.getProperty("password"));
		
		Thread.sleep(6000);
		profilePage = accountPage.ClickOnMyProfile();
		Thread.sleep(5000);

	}

	@Test(priority = 1)
	public void verifyFirstName() throws Exception {
		String firstname = profilePage.verifyFirstName();
		Assert.assertEquals(firstname, "DVhbCERv");
		Thread.sleep(3000);
		TestUtil.takeScreenShot("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\ScreenShots\\MyProfilePageTest\\verifyFirstName.png");
	}

	@Test(priority = 2)
	public void verifyLastName() throws Exception {
		String lastname = profilePage.verifyLastName();
		Assert.assertEquals(lastname, "IlqEZZxz");
		Thread.sleep(3000);
		TestUtil.takeScreenShot("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\ScreenShots\\MyProfilePageTest\\verifyLastName.png");
	}

	@Test(priority=3)
	public void verifyPhoneNumber() throws Exception {
		profilePage.scrollToAddress();
		String phone = profilePage.verifyPhone();
		Assert.assertEquals(phone, "1234563242342dfdfaff");
		Thread.sleep(3000);
		TestUtil.takeScreenShot("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\ScreenShots\\MyProfilePageTest\\verifyPhoneNumber.png");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
