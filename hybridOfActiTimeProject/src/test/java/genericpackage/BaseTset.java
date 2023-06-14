package genericpackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTset extends Flib implements IautoConsant {

	
		public static WebDriver driver;
		
		//it is open and close browser
		@BeforeMethod
		public void setup(String browser, String url)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(url);
				
			}
			else if(browser.equalsIgnoreCase("edge"))
			{
				driver= new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(url);
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver= new FirefoxDriver()	;
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(url);
			}
			else
			{
				Reporter.log("InvalidBrowser ",true);
			}
		}
		public void faliedMethodToTakeScreenshot(String failedMethod)
		{
			try
			{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(SCREENSHOT_PATH+failedMethod+".png");
			Files.copy(src, dest);
			}
			catch(Exception e)
			{
				
			}
		}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		
}
