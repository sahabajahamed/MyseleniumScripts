package com.Partice;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='first']"));
		Select sel = new Select(dropdown);
		List<WebElement> alloptions = sel.getOptions();
		TreeSet<String> ts = new TreeSet<String>();
		for(int i=0;i<alloptions.size();i++)
		{
			String op=alloptions.get(i).getText();
			ts.add(op);
			
			for(String options :ts)
			{
				Thread.sleep(2000);
				System.out.println(options);
			}
			
			
			
		}
		
		
		

	}

}
