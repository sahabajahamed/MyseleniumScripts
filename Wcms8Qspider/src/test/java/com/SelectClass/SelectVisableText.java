package com.SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.browser.Browser;

public class SelectVisableText extends Browser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bs = new Browser();
		bs.BrowserLaunch("chrome");
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdrive");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='first']"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Iphone");
		

	}

}
