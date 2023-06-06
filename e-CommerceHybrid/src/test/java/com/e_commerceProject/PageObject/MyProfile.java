package com.e_commerceProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile {
	
	WebDriver ldriver;
	
	public MyProfile(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	//identify homepage webelement
	
	@FindBy(xpath="/HTML/BODY/DIV[1]/SECTION[2]/DIV/SECTION/SECTION/DIV[1]/BUTTON") public WebElement editProfile;
	@FindBy(xpath="//div[text()='My Addresses']") public WebElement myAdresses;
	
	
	
	public void editProfile() {
		
	}

}
