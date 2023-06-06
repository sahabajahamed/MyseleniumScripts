package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vehicle {
  @Test
  public void Start() {
	  
	  Reporter.log("Vechicle are start",true);
  }
  @Test
  public void Stop() {
	  Reporter.log("Vechile are stop",true);
  }
}
