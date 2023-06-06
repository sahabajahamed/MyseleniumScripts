package testNGAnnotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazone {

	static WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}
	@Test

	public void amazoneSearch() {
		driver.switchTo().activeElement().sendKeys("T-shirt", Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		Reporter.log("amazone test case pass",true);


	}
	@Test
	public void mouseOverAction()

	{
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement target2 = driver.findElement(By.xpath("//span[text()='Baby Wishlist']"));
		act.moveToElement(target).moveToElement(target2).click().build().perform();
		Reporter.log("moveActions pass",true);


	}
	@Test
	public void babyWishlist()
	{
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement target2 = driver.findElement(By.xpath("//span[text()='Baby Wishlist']"));
		act.moveToElement(target).moveToElement(target2).click().build().perform();
		driver.findElement(By.id("nameOrEmailField")).sendKeys("Sahabaj ahammed");
		driver.findElement(By.id("search-submit-button")).click();
		Reporter.log("Babywishlist pass",true);
	}

	@Test
	public void formFil() throws InterruptedException
	{
		Actions act1 = new Actions(driver);
		WebElement target1 = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement target3 = driver.findElement(By.xpath("//span[text()='Baby Wishlist']"));
		act1.moveToElement(target1).moveToElement(target3).click().build().perform();
		driver.findElement(By.id("nameOrEmailField")).sendKeys("Sahabaj ahammed");
		driver.findElement(By.id("search-submit-button")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("cityField")).sendKeys("Kandi");
		driver.findElement(By.id("stateField")).sendKeys("West Bengal");
		WebElement drop1 = driver.findElement(By.id("a-autoid-2-announce"));
		drop1.click();
		driver.findElement(By.id("eventDateMonthField_3")).click();

		Thread.sleep(3000);


		WebElement dropdown2 = driver.findElement(By.id("a-autoid-3-announce"));
		dropdown2.click();
		driver.findElement(By.id("eventDateYearField_1")).click();




		Reporter.log("Babywishlist pass",true);

	}







	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
