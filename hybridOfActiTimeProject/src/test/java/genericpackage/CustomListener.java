package genericpackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener extends BaseTset implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("Browser opend & test will start ",true);
		
	}
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Excuted sucessful! ", true);
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("Test Failed due to " + failedMethod,true);
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		Reporter.log("Test Started!!",true);
		
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Test Finished!!",true);
	}
	

}
