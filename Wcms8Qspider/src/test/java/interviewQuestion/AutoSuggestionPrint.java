package interviewQuestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionPrint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement searchButton = driver.findElement(By.id("APjFqb"));

		searchButton.sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='erkvQe']"));
		for (WebElement webElement : suggestion) {

			String search = webElement.getText();

			System.out.println(search);
			
			if(webElement.getText().equals("javascript"))
			{
				Thread.sleep(2000);
				webElement.click();
				break;
				
			}
		}
		driver.quit();





	}

}
