package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeDtaProvider {
	static WebDriver driver;
	
	@BeforeTest
  
  public void property() {
		WebDriverManager.chromedriver().setup();
		
  }
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-7pbb867a/login.do");
		
		
		
	}
	@DataProvider(name="testactitime")
	public Object[][] dataprovider (){
		Object [][]dataprovider=new Object	[5][2];
		dataprovider [0][0]="Admin";
		dataprovider [0][1]="Manager";
		dataprovider [1][0]="Admin123";
		dataprovider [1][1]="Manager123";
		dataprovider [2][0]="admin1234";
		dataprovider [2][1]="manager123445";
		
		return dataprovider;
		
		
	}
	@Test(dataProvider="testactitime")
	public void LoginInvalid(String usn,String pass)
	{
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		
		
	}
}
