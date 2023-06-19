package com.testcase;

import org.testng.annotations.Test;

import com.e_commerceProject.PageObject.ShopperLogin;
import com.e_commerceProject.PageObject.indexPage;

public class TC_01_SHPSTK_LOGIN extends BaseClass {
	@Test
	public void VerifyUserShouldBeAbleToLogin()
	{
		indexPage pg= new indexPage(driver);

		pg.ClickOnLogin();
		ShopperLogin pg1= new ShopperLogin(driver);

		pg1.EmailAdress("wasimahammed800@gmail.com");
		pg1.Password("Wasim@800");
		pg1.clickLoginButton();

	} 
}
