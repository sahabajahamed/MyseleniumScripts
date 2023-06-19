package com.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.utillies.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	Readconfig readconfig= new Readconfig();

	String url =readconfig.getBaseUrl();
	String browser= readconfig.getBrowser();

	 public static WebDriver driver;

	
	@BeforeMethod
	public void setup(String browser,String url)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver()	;
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		
		else
		{
			Reporter.log("InvalidBrowser ",true);
		}
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.close();
		driver.quit();

	}
}

