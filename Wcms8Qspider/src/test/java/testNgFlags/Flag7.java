package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	//it is used to perform group excuation

	@Test(groups="funcational testing")
	public void ftc1() {
		Reporter.log("Ftc ",true);
	}@Test(groups="smoke testing")
	public void stc1() {
		Reporter.log("stc1",true);
	}@Test(groups="integration testing")
	public void int1() {
		Reporter.log("ITC1 ",true);
	}@Test(groups="end to end testing")
	public void ETc1() {
		Reporter.log("ETC1 ",true);
	}

	@Test(groups="regresion testinng")
	public void reg() {
		Reporter.log("reg ",true);
	
	}

	@Test(groups="funcational testing")
	public void ftc2() {
		Reporter.log("Ftc2 ",true);
	}@Test(groups="smoke testing")
	public void stc2() {
		Reporter.log("stc2",true);
	}@Test(groups="integration testing")
	public void int2() {
		Reporter.log("ITC2 ",true);
	}@Test(groups="end to end testing")
	public void ETc2() {
		Reporter.log("ETC2 ",true);
	}

	@Test(groups="regresion testinng")
	public void reg2() {
		Reporter.log("reg2 ",true);
	
	}

	@Test(groups="funcational testing")
	public void ftc3() {
		Reporter.log("Ft3 ",true);
	}@Test(groups="smoke testing")
	public void stc3() {
		Reporter.log("stc3",true);
	}@Test(groups="integration testing")
	public void int3() {
		Reporter.log("ITC3 ",true);
	}@Test(groups="end to end testing")
	public void ETc3() {
		Reporter.log("ETC3 ",true);
	}

	@Test(groups="regresion testinng")
	public void reg3() {
		Reporter.log("reg3 ",true);
	
	}
}
