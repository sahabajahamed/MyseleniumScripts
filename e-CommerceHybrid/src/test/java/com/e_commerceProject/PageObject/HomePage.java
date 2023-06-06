package com.e_commerceProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	//identify homepage webelement
	
	@FindBy (xpath="//a[text()='Home']") public  WebElement Home;
	@FindBy (id="search")  public WebElement Search;
	@FindBy (id="searchBtn") public WebElement searchBtn;
	@FindBy (id="cartIcon") public WebElement CartIcon;
	@FindBy (xpath="//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']") public WebElement AccountSetting;
	

}
