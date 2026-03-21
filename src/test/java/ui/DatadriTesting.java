package ui;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DatadriTesting {
	@DataProvider(name="create")
	public Object[][] dataSet(){
		return new Object[][] {
			{"standard_user", "secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user", "secret_sauce"},
			{"performance_glitch_user", "secret_sauce"},
		};
		
	}
	
	
	
	@Test(dataProvider = "create")
	public void DataDriven(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.quit();
	}
}
