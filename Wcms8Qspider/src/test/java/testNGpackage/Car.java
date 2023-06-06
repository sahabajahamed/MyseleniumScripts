package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Car {
  @Test
  public void carStart() {
	Reporter.log("Car is start", true);
  }
  @Test
  public void carPrice() {
	  int i,j,res;
	  i=1000;
	  j=0;
	  res=i/j;
	  Reporter.log("result is ==" + res,true );
	  
  }
}
