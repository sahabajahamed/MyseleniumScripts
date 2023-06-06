package testngParameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CivilCompany {
  @Test
  @Parameters({"civil company"})
  public void CivilCompany1(String name) {
	  System.out.println(name + " civil company");
  }
}
