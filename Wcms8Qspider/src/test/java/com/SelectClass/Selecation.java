package com.SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.browser.Browser;

public class Selecation extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = new Browser();
		browser.BrowserLaunch("chrome");
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='first']"));
		Select sel = new Select(dropdown);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			sel.selectByIndex(2);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
	}

}
