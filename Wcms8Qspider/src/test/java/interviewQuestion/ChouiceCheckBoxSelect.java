package interviewQuestion;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChouiceCheckBoxSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver 	driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		for (WebElement webElement : allcheckbox) {
			
			String checkbox = webElement.getAttribute("id");
			
			if(checkbox.equals("monday")  ||   checkbox.equals("saturday"))
			{
				webElement.click();
				
			}
		}
	}

}
