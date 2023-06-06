package com.e_commerceProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.awtui.Logo;

public class AccountSetting {

	WebDriver ldriver;

	public AccountSetting(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
	}


	//identify homepage webelement

	@FindBy (xpath="//li[text()='My Profile']") public WebElement myProfile;
	@FindBy (xpath="//li[text()='Wish List']") public WebElement wishList;
	@FindBy (xpath="//li[text()='My Orders']") public WebElement myOrders;
	@FindBy (xpath="//li[text()='My Wallet']") public WebElement myWallet;
	@FindBy (xpath="//li[text()='My Likes']") public WebElement myLikes;
	@FindBy (xpath="//li[text()='Logout']") public WebElement logOut;


	public void clickMyProfile()
	{
		myProfile.click();
	}

	public void clickWishList()
	{
		wishList.click();
	}
	public void clickMyOrders()
	{
		myOrders.click();
	}
	public void clickMyWllet()
	{
		myWallet.click();
	}
	public void clickMylikes()
	{
		myLikes.click();
	}
	public void clicklogOut()
	{
		logOut.click();
	}

}
