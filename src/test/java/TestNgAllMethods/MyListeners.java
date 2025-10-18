package TestNgAllMethods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{
	
	 public void onStart(ITestContext context) {
		    System.out.println("onstart method...");
		  }
	
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("onTestSuccess method...");
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 System.out.println("onTestFailure method...");
		  }
	 
	 public void onFinish(ITestContext context) {
		 System.out.println("onFinish method...");
		  }
}
