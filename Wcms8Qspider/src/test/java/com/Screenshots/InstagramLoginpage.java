package com.Screenshots;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.browser.*;
import com.google.common.io.Files;

public class InstagramLoginpage extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bs= new Browser();
		bs.BrowserLaunch("chrome");
		driver.get("https://www.amazon.in/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/amazonewbp.png");

		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("not found");
		}
		driver.close();
	}

}
