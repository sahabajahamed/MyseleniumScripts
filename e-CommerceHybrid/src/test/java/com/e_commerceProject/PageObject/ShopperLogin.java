package com.e_commerceProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopperLogin {

	WebDriver ldriver;
	public ShopperLogin(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);


	}
	//identify webelement

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement password;
	@FindBy(id="Login") private WebElement loginButton;





	//identify action on webelement

	public void EmailAdress(String emailadd)

	{
		email.sendKeys(emailadd);

	}
	public void Password(String pswd)

	{
		password.sendKeys(pswd);

	}

	public void clickLoginButton() {
		loginButton.click();
	}




}
