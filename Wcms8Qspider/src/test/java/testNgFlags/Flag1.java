package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	//to describe the method
  @Test(description = "This method perform login!!")
  public void method1() {
	  
	  Reporter.log("Method 1 Login!!",true);
  }
}
