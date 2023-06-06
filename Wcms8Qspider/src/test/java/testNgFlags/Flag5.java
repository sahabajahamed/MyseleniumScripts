package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	@Test(description = "login method")
	public void loginmethod() {
		Reporter.log("Login perform",true);

	}@Test(description = "Crete method",dependsOnMethods = "")
	public void createUserMethod() {
		Reporter.log("user created",true);

	}@Test(description = "logout method")
	public void logOutmethod() {
		Reporter.log("logout perform", true);

	}
}
