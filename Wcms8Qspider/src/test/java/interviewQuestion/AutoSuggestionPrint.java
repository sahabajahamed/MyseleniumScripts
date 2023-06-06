package interviewQuestion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionPrint {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement searchButton = driver.findElement(By.id("APjFqb"));

		searchButton.sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='erkvQe']"));
		
		for(int i=0; i<list.size() ;i++)
			{
			System.out.println(list.get(i).getText());
			Thread.sleep(3000);
			if(list.get(i).getText().trim().equalsIgnoreCase("javascript")) {
				Thread.sleep(3000);
				list.get(i).click();
				break;
			}
			
			
		}
		
		
		

	//	driver.quit();





	}

}
