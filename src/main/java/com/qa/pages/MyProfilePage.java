package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;
import com.qa.util.TestUtil;

public class MyProfilePage extends TestBase {
	
	TestUtil testutil = new TestUtil();
	
	//PageFactoryOjbect OR Object Repository
	
	@FindBy(xpath="//form[@id='profilefrm']//input[@name='firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//form[@id='profilefrm']//input[@name='lastname']")
	WebElement LastName;
	
	@FindBy(xpath="//form[@id='profilefrm']//input[@name='phone']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='address1']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='address2']")
	WebElement address2;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	// Actions on login page:
	
	public MyProfilePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyFirstName(){
		return FirstName.getAttribute("value");
	}
	
	public String verifyLastName(){
		return LastName.getAttribute("value");
	}
	
	public String verifyPhone(){
		return phone.getAttribute("value");
	}
	
	
	public void scrollToAddress(){
		
		TestUtil.scrollToElement(address);
		
	}
	
	
		
	
	
	
}
