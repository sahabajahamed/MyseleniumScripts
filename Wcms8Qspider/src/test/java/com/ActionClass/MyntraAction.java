package com.ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		WebElement target = driver.findElement(By.xpath("//a[@class='desktop-main'][text()='Men']"));
		WebElement target2 = driver.findElement(By.xpath("//a[text()='Casual Shirts']"));
		
		 Actions act = new Actions(driver);
		 Thread.sleep(3000);
		act.moveToElement(target).moveToElement(target2).click().build().perform();
			
		

	}

}

