package ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ReportGeneration {
ExtentReports extent;
ExtentTest test;
@BeforeTest
public void setup() {
	ExtentSparkReporter reporter = new ExtentSparkReporter("reports/index.html");
 extent = new ExtentReports();
 extent.attachReporter(reporter);	 
 }
@Test
public void MyFirstTest() {
	test = extent.createTest("LoginTest");
	test.pass("Login successfull");
}
@Test
public void MySecondTest() {
	test = extent.createTest("LogoutTest");
	test.fail("Logout failed");
}
@AfterTest
public void tearDown() {
	extent.flush();
}
}