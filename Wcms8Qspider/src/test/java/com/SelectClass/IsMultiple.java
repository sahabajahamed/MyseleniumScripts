package com.SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.browser.Browser;

public class IsMultiple extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = new Browser();
		browser.BrowserLaunch("chrome");
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='first']"));
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='second']"));
				
		Select sel = new Select(dropdown);
		Select sel1 = new Select(dropdown2);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean verify = sel.isMultiple();
		System.out.println("CHECK BOOLEN OR NOT == " + verify);
		boolean verify2 = sel1.isMultiple();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CHECK BOOLEN OR NOT == " + verify2);
		driver.quit();
		

	}

}
