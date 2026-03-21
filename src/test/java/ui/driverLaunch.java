package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class driverLaunch {
public static WebDriver driver;
@BeforeMethod
public void driSetup() {
	driver =  new ChromeDriver();
	driver.get("https://www.ebay.com");
	driver.manage().window().maximize();
}
@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
