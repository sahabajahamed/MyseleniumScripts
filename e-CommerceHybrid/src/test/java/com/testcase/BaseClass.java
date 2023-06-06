package com.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utillies.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	Readconfig readconfig= new Readconfig();

	String url =readconfig.getBaseUrl();
	String browser= readconfig.getBrowser();
	
	public static WebDriver driver;

	@BeforeClass
	public void setup() {
		switch (browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		default:
			driver= null;
			break;
		}
		//wait code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		
		
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();

	}
}
