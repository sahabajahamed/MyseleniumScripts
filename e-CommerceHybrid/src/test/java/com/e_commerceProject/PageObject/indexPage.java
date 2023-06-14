package com.e_commerceProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	//create object webdriver;

	WebDriver ldriver;
	public indexPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);


	}
	//identify webelement

	@FindBy(id = "loginBtn")
	WebElement login;
	@FindBy(xpath="//div[@class='welcomebar_welcomeBar__IBwyG']/h3") private WebElement welcomePage;
	@FindBy (xpath="(//img[@alt='logo'])[1]") private WebElement logo;


	//identify action on webelement

	public void ClickOnLogin()
	{
		login.click();
	}
	public void WelcomeShopperStack() {
		welcomePage.isDisplayed();
	}
	public void logocheck()
	{
		logo.isDisplayed();
	}



}
