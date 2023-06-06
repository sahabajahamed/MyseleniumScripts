package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	//method or annotation is enabled or disabled
	
  @Test(enabled = false,description = "login performed")
  public void method1() {
	  Reporter.log("login performend ",true);
	  

  }
  @Test(enabled = true, description = "logout performed")
  public void method2()
  {
	  Reporter.log("logout performed!!",true);
  }
}
