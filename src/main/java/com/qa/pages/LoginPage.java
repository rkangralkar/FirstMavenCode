package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactoryOjbect OR Object Repository
	
	@FindBy(xpath="//input[@type='email']")
			WebElement emailID;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;

	@FindBy(css=".btn.btn-action.btn-lg.btn-block.loginbtn")
	WebElement loginButton;
	
	@FindBy(xpath="//form/p/img")
	WebElement loginImage;

	
	// Actions on login page:
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	public boolean validateLoginImage(){
		return loginImage.isDisplayed();
	}
	
	public MyaccountPage ValidLogin(String ID, String pw){
		emailID.sendKeys(ID);

		password.sendKeys(pw);
		
		loginButton.click();
		return new MyaccountPage();
		
	}
	
	
}
