package testNGAnnotations;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearch extends BaseTest{
  @Test
  public void Search1() throws InterruptedException {
	  
	 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	 Thread.sleep(4000);
  }@Test
  	public void Search2() throws InterruptedException {
  		driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
  		Thread.sleep(4000);
  	}
  @Test
  public void Search3() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
	  Thread.sleep(4000);
  }
}
