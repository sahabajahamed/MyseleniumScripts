package com.SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.browser.Browser;

public class GetOptions extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = new Browser();
		browser.BrowserLaunch("chrome");
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='second']"));
			Select sel = new Select(dropdown2);
			List<WebElement> all = sel.getOptions();
			for( WebElement e: all)
			{
				String alloptions = e.getText();
				System.out.println( alloptions);
			}

	}

}
