package com.ShoperstackTestCase;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Profile {
	public static WebDriver driver;
	@Test(priority = 1)
	public void userShouldBeableAddAdress() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(4000);
		WebElement emil = driver.findElement(By.id("Email"));
		emil.clear();
		emil.sendKeys("wasimahammed800@gmail.com");
		WebElement pswd = driver.findElement(By.id("Password"));
		pswd.clear();
		pswd.sendKeys("Wasim@800");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(4000);
		WebElement accountSetting = driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']"));
		accountSetting.click();
		WebElement myprofile = driver.findElement(By.xpath("//li[text()='My Profile']"));
		myprofile.click();
		WebElement myadress = driver.findElement(By.xpath("//div[text()='My Addresses']"));
		myadress.click();
		WebElement addadress = driver.findElement(By.xpath("//button[text()='Add Address']"));
		addadress.click();
		driver.findElement(By.id("Name")).sendKeys("Sultana parveen");
		driver.findElement(By.id("House/Office Info")).sendKeys("Cochbihar");
		driver.findElement(By.id("Street Info")).sendKeys("1/93 Dinhata");
		driver.findElement(By.id("Landmark")).sendKeys("Primary school");
		WebElement dropdown = driver.findElement(By.id("Country"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("India");
		WebElement state = driver.findElement(By.id("State"));
		Select sel2 = new Select(state);
		sel2.selectByVisibleText("West Bengal");
		WebElement city = driver.findElement(By.id("City"));
		Select sel3 = new Select(city);
		sel3.selectByVisibleText("Cooch Behar");
		
		
		driver.findElement(By.id("Pincode")).sendKeys("432102");
		driver.findElement(By.id("Phone Number")).sendKeys("7908324771");
		WebElement submit = driver.findElement(By.xpath("//button[text()='Add Address']"));
		submit.click();
		Thread.sleep(4000);
		
		driver.close();
		driver.quit();


	}
	@Test(priority = 2)
	public void userShouldBeUpdateAdress() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(4000);
		WebElement emil = driver.findElement(By.id("Email"));
		emil.clear();
		emil.sendKeys("wasimahammed800@gmail.com");
		WebElement pswd = driver.findElement(By.id("Password"));
		pswd.clear();
		pswd.sendKeys("Wasim@800");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(4000);
		WebElement accountSetting = driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']"));
		accountSetting.click();
		WebElement myprofile = driver.findElement(By.xpath("//li[text()='My Profile']"));
		myprofile.click();
		WebElement myadress = driver.findElement(By.xpath("//div[text()='My Addresses']"));
		myadress.click();
		driver.findElement(By.xpath("(//span[@class='MuiButton-startIcon MuiButton-iconSizeSmall css-u0g51i'])[1]")).click();
		WebElement name = driver.findElement(By.id("Name"));
		name.clear();
		Thread.sleep(1000);
		name.sendKeys("Sahabaj Ahammed");
		WebElement street = driver.findElement(By.id("Street Info"));
		street.clear();
		Thread.sleep(1000);
		street.sendKeys("Kolkata");
		WebElement ph = driver.findElement(By.id("Phone Number"));
		ph.clear();
		Thread.sleep(1000);
		ph.sendKeys("7872770717");
		driver.findElement(By.id("Update Address")).click();
		Thread.sleep(4000);

		driver.close();
		driver.quit();
		
	}
	@Test (priority = 3)
	public void userShoouldBeDeleteAdress() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(4000);
		WebElement emil = driver.findElement(By.id("Email"));
		emil.clear();
		emil.sendKeys("wasimahammed800@gmail.com");
		WebElement pswd = driver.findElement(By.id("Password"));
		pswd.clear();
		pswd.sendKeys("Wasim@800");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(4000);
		WebElement accountSetting = driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']"));
		accountSetting.click();
		WebElement myprofile = driver.findElement(By.xpath("//li[text()='My Profile']"));
		myprofile.click();
		WebElement myadress = driver.findElement(By.xpath("//div[text()='My Addresses']"));
		myadress.click();
		WebElement delete = driver.findElement(By.xpath("(//div[starts-with(@class,'MuiCardActions-root ')]//following::button)[1]"));
		delete.click();
		WebElement yes = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		yes.click();
		Thread.sleep(20000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();
		driver.quit();
	}
	@Test (priority = 4)
	public void userShouldBeAddOfficeAdress() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(4000);
		WebElement emil = driver.findElement(By.id("Email"));
		emil.clear();
		emil.sendKeys("wasimahammed800@gmail.com");
		WebElement pswd = driver.findElement(By.id("Password"));
		pswd.clear();
		pswd.sendKeys("Wasim@800");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(4000);
		WebElement accountSetting = driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']"));
		accountSetting.click();
		WebElement myprofile = driver.findElement(By.xpath("//li[text()='My Profile']"));
		myprofile.click();
		WebElement myadress = driver.findElement(By.xpath("//div[text()='My Addresses']"));
		myadress.click();
		WebElement addadress = driver.findElement(By.xpath("//button[text()='Add Address']"));
		addadress.click();
		driver.findElement(By.id("Office")).click();
		driver.findElement(By.id("Name")).sendKeys("ahammed sahabaj");
		driver.findElement(By.id("House/Office Info")).sendKeys("kolkata");
		driver.findElement(By.id("Street Info")).sendKeys("saltlak");
		driver.findElement(By.id("Landmark")).sendKeys("eden garden");
		WebElement dropdown = driver.findElement(By.id("Country"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("India");
		WebElement state = driver.findElement(By.id("State"));
		Select sel2 = new Select(state);
		sel2.selectByVisibleText("West Bengal");
		WebElement city = driver.findElement(By.id("City"));
		Select sel3 = new Select(city);
		sel3.selectByVisibleText("Cooch Behar");
		
		
		driver.findElement(By.id("Pincode")).sendKeys("432102");
		driver.findElement(By.id("Phone Number")).sendKeys("7908324771");
		WebElement submit = driver.findElement(By.xpath("//button[text()='Add Address']"));
		submit.click();
		Thread.sleep(4000);
		
		driver.close();
		driver.quit();
	}

}
