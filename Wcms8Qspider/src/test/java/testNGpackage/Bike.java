package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bike {
  @Test
  public void bikeStart() {
	  Reporter.log(" Bike are start",false);
  }
  @Test
  public void bikeSop()
  {
	  Reporter.log(" bike are stop",true);
  }
}
