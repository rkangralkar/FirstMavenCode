package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.MyaccountPage;
import com.qa.util.TestUtil;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	MyaccountPage accountPage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		startBrowserURL();
		loginPage = new LoginPage();
		accountPage = new MyaccountPage();
	}

	@Test(priority = 1)
	public void verifyLoginpageTitle() throws Exception {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login");
		System.out.println("The value of the title is "+title);
		Thread.sleep(3000);
		TestUtil.takeScreenShot("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\ScreenShots\\LoginPageTest\\verifyLoginpageTitle.png");

	}

	@Test(priority = 2)
	public void verifyLoginImage() throws Exception {
		boolean flag = loginPage.validateLoginImage();
		Assert.assertEquals(flag, true);
		System.out.println("The value of the flag is "+flag);
		Thread.sleep(3000);
		TestUtil.takeScreenShot("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\ScreenShots\\LoginPageTest\\verifyLoginImage.png");
	}

	@Test(priority = 3)
	public void verifyValidLogin() throws Exception {

		accountPage = loginPage.ValidLogin(prop.getProperty("username"),
				prop.getProperty("password"));
		Thread.sleep(8000);
		TestUtil.takeScreenShot("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\ScreenShots\\LoginPageTest\\verifyValidLogin.png");
		boolean flag = accountPage.presenceOfUserNameLink();
		System.out.println("The value of the flag is "+flag);
		Assert.assertEquals(flag, true);
		String title= accountPage.titleOfMyAccountPage();
		Assert.assertEquals(title, "My Account");
		/*Thread.sleep(2000);
		boolean flag2 = accountPage.presenceOfUserLink();
		Assert.assertEquals(flag2, true);*/
		
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
