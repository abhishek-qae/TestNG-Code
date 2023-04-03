package listenertuts;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Test started ");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");

	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");

	}
}
