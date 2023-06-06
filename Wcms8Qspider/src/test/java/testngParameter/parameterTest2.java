package testngParameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest2 {
	
  @Test
  @Parameters({"automobile company"})
  public void Testcas2(String name ) {
		System.out.println(name + " automobile commpany ");
  }
}
