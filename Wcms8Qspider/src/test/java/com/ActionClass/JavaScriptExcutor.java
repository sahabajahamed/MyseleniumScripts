package com.ActionClass;
import org.openqa.selenium.JavascriptExecutor;

import com.browser.*;
public class JavaScriptExcutor  extends Browser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bs = new Browser();
		bs.BrowserLaunch("chrome");
		driver.get("https://www.instagram.com/");
		// scrolling operations
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)");
		jse.executeScript("window.scrollBy(0,-700)");
		
		

	}

}
