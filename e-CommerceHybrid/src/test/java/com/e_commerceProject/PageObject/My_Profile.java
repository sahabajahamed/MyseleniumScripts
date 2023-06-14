package com.e_commerceProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Profile {
	

	WebDriver ldriver;

	public My_Profile(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);

	}
	
	// identify the webelement
	
	@FindBy (xpath="//div[text()='My Profile']") WebElement myprofile;
	@FindBy (xpath="//div[text()='My Addresses']") WebElement myadress;
	@FindBy (xpath="//div[text()='My Wallet']") WebElement wallet;
	@FindBy (xpath="//div[text()='My Likes']") WebElement likes;
	@FindBy (xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-1hw9j7s']") WebElement addAdresses;
	@FindBy (xpath="/button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textSuccess MuiButton-sizeSmall MuiButton-textSizeSmall  css-n3v15g']") WebElement editButton;
	
	
	public void ClickMyprofile()
	{
		myprofile.click();
	}
	public void clickMyAdress()
	{
		 myadress.click();
	}
	public void clickWallet()
	{
		wallet.click();
	}
	public void clickLikes()
	{
		 likes.click();
	}
	public void clickAddAdress()
	{
		addAdresses.click();
	}
	

}
