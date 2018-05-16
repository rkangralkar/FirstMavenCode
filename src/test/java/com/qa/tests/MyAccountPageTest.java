package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.MyaccountPage;
import com.qa.util.TestUtil;

public class MyAccountPageTest extends TestBase {
	LoginPage loginPage;
	MyaccountPage accountPage;

	public MyAccountPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		startBrowserURL();
		loginPage = new LoginPage();
		accountPage = loginPage.ValidLogin(prop.getProperty("username"),
				prop.getProperty("password"));
		Thread.sleep(5000);

	}

	@Test(priority = 1)
	public void verifyMyAccountPageTtile() throws Exception {
		String titleOfMyAccountPage = accountPage.titleOfMyAccountPage();
		Assert.assertEquals(titleOfMyAccountPage, "My Account",
				"The MyAccountPage title is not matching");
		System.out.println("Title of the page is " + titleOfMyAccountPage);
		Thread.sleep(5000);
		TestUtil.takeScreenShot("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\ScreenShots\\MyAccountPageTest\\verifyMyAccountPageTtile.png");
	}

	@Test(priority = 2)
	public void verifyCorrectUserName() throws Exception {
		Thread.sleep(2000);
		boolean userFlag = accountPage.presenceOfUserNameLink();
		Assert.assertEquals(userFlag, true);
		Thread.sleep(2000);
		TestUtil.takeScreenShot("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\ScreenShots\\MyAccountPageTest\\verifyCorrectUserName.png");
	}

	@Test(priority=3)
	public void verifyUserImage() throws Exception {
		Thread.sleep(2000);
		boolean userFlag = accountPage.presenceOfUserImage();
		Assert.assertEquals(userFlag, true);
		Thread.sleep(2000);
		TestUtil.takeScreenShot("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\ScreenShots\\MyAccountPageTest\\verifyUserImage.png");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
