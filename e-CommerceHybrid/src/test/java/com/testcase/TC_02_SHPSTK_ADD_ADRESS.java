package com.testcase;

import org.testng.annotations.Test;

import com.e_commerceProject.PageObject.HomePage;
import com.e_commerceProject.PageObject.My_Profile;
import com.e_commerceProject.PageObject.ShopperLogin;
import com.e_commerceProject.PageObject.indexPage;

public class TC_02_SHPSTK_ADD_ADRESS extends BaseClass {
	
	@Test
	public void verifyUserShouldBeAbleToAddAdress()
	
	{
		driver.get(url);
		indexPage pg= new indexPage(driver);
		pg.ClickOnLogin();
		ShopperLogin sp= new ShopperLogin(driver);
		sp.EmailAdress("wasimahammed800@gmail.com");
		sp.Password("Wasim@800");
		sp.clickLoginButton();
		HomePage hm= new HomePage(driver);
		hm.clickAccountSetting();
		My_Profile pf =new My_Profile(driver);
		pf.clickMyAdress();
		pf.clickAddAdress();
		
	}

}
