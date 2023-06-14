package com.e_commerceProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {


	WebDriver ldriver;

	public Signup(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);

	}
	// identift the webelement

	@FindBy (id="First Name") WebElement firstname;
	@FindBy (id="Last Name") WebElement lastName;
	@FindBy (id="Male") WebElement male;
	@FindBy (id="Phone Number") WebElement phoneNumber;
	@FindBy (id="Email Address") WebElement emailAdress;
	@FindBy (id="Password") WebElement password;
	@FindBy (id="Confirm Password") WebElement confirmPassword;
	@FindBy (id="Terms and Conditions") WebElement checkBox;
	@FindBy (id="Register") WebElement register;



	public void firstName(String fname)
	{
		firstname.sendKeys(fname);
	}

	public void lastname(String lname)
	{
		lastName.sendKeys(lname);
	}

	public void Clickmale()
	{
		male.click();
	}

	public void  phonenumber(String pname)

	{
		phoneNumber.sendKeys(pname);

	}
	public void sendemailAdress(String email)
	{
		emailAdress.sendKeys(email);
	}

	public void sendpassword(String psw)
	{
		password.sendKeys(psw);
	}
	public void sendconfirmPassword(String cnfirmpsw)
	{
		confirmPassword.sendKeys(cnfirmpsw);
	}

	public void clickregister()
	{
		register.click();
	}



}
