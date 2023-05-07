package com.browser;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriver {
	public void  chrome()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= (WebDriver) new ChromeDriver();
	}

}
