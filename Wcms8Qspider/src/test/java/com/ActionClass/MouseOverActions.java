package com.ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		Actions target = new Actions(driver);
		WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
		WebElement gm1 = driver.findElement(By.xpath("//span[text()='1 gram' and @data-p='gold-coins-weight-1gms,m']"));
		Thread.sleep(2000);
		target.moveToElement(coins).moveToElement(gm1).click().build().perform();
		Thread.sleep(4000);
		WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		if(coin.isDisplayed())
		{
			System.out.println("it is displayed");
		}else {
			System.out.println("will get the no such element exception");
		}
		
		driver.quit();
		
		
		
		

	}

}
