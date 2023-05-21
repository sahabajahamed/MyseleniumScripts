package com.Partice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionAmazone {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		
		Actions action= new Actions(driver);
		WebElement web1 = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement web2 = driver.findElement(By.xpath("//div[@id='nav-al-your-account']/a[1]/span"));
		action.moveToElement(web1).moveToElement(web2).click().perform();
		driver.findElement(By.xpath("//a[text()='Mobiles']/parent::div")).click();

	 driver.findElement(By.xpath("//span[text()='OnePlus']/parent::a/child::div")).click();
	 List<WebElement> oneprice = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']/ancestor::div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']/descendant::span[@class='a-price-whole']"));
	List<WebElement> onename = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	
	for(int i=0;i<onename.size();i++)
	{
		String name = onename.get(i).getText();
		System.out.print(name+"		:");
		for(int j=i;j<=i;j++)
		{
			String price = oneprice.get(j).getText();
			System.out.println(price+"\n");
		}
	}
	driver.quit();
		
		
		
		

	}

}



