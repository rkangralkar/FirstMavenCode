package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class MyaccountPage extends TestBase {
	
	
	@FindBy(xpath="//*[@id='body-section']/div/div[1]/div/div[1]/h3")
	WebElement userName;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/ul/ul/li[1]/ul/li[2]/a")
	WebElement logoutButton;
	
	@FindBy(xpath="//div[@class='navbar-collapse collapse']/ul/ul/li/a[@class='dropdown-toggle go-text-right']/b")
	WebElement user;
	
	@FindBy(xpath="//div[@class='navbar-collapse collapse']/ul/ul/li[2]/a/strong")
	WebElement DropDownUSD;
	
	@FindBy(xpath="//*[@id='body-section']/div/div[1]/div/div[1]/div/img")
	WebElement UserImage;
	
	@FindBy(xpath="//*[@id='body-section']/div/div[3]/div/div[1]/ul/li[2]/a")
	WebElement MyProfileLink;
	
	
	
	
	
	
	
	
	public MyaccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String textOfUSDlink() throws Exception{
		Thread.sleep(2000);
		return DropDownUSD.getText();
	}
	
	public LoginPage doLogout() throws Exception{
		user.click();
		Thread.sleep(2000);
		logoutButton.click();
		return new LoginPage();
	}
	
	
	public boolean presenceOfUserNameLink() throws Exception{
		Thread.sleep(2000);
		return userName.isDisplayed();
	}
	
	public boolean presenceOfUserImage() throws Exception{
		Thread.sleep(2000);
		return UserImage.isDisplayed();
	}
	
	public String titleOfMyAccountPage(){
		return driver.getTitle();
	}
	
	public boolean presenceOfUserLink() throws Exception{
		Thread.sleep(4000);
		return user.isDisplayed();
	}
	
	public MyProfilePage ClickOnMyProfile(){
		MyProfileLink.click();
		return new MyProfilePage();
	}

}
