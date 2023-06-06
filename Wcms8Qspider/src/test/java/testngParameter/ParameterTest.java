package testngParameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Test
	@Parameters({"software company name"})
	public void tstcase1(String name ) {
		System.out.println(name + " software company");
	}
}
