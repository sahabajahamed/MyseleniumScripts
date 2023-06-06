package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	@Test
	public void Method5() {
		Reporter.log("method5",true);
	}
	
	@Test
	public void Method1() {
		Reporter.log("method1",true);
	}
	@Test
	public void Method3() {
		Reporter.log("method3",true);
	}
	@Test(priority = -1)
	public void Method2() {
		Reporter.log("method2",true);
	}
	@Test
	public void Method7() {
		Reporter.log("method7",true);
	}
	@Test
	public void Method6() {
		Reporter.log("method6",true);
	}
	@Test
	public void Method4() {
		Reporter.log("method4",true);

	}
}
