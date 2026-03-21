package ui;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ScreenshotListener.class)
public class TestExecution extends driverLaunch {
	
	@Test
	public void invalidLogin() {
		Assert.assertTrue(false);
	}

}
