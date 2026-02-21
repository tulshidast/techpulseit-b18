package seleniumpractices;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		Reporter.log("Test " + result.getMethod().getMethodName() + " execution started!!!");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test " + result.getMethod().getMethodName() + " passed!!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test " + result.getMethod().getMethodName() + " execution failed!!!");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
