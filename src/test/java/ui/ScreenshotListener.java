package ui;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener{
	
	
public void onTestFailure(ITestResult result){
	System.out.println("Test failed" +result.getName());
	try {
		ScreenshotUtility.takesScreenshot(driverLaunch.driver, result.getName());
	} catch (Exception e) {
	
		e.printStackTrace();
	}
}
}
