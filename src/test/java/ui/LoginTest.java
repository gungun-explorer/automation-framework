package ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void loginToApplicaton(){
		System.out.println("Login sucessful");
}
	
	@AfterTest
	public void loginOutApplicaton(){
		System.out.println("Logout sucessful");
}
	
	 
	      @Test(priority=1, description = "this is login test")
		public void loginTest(){
			System.out.println("test a executed");
}
@Test(priority=2, description = "this is logout test" )	      
public void logoutTest(){
	System.out.println("test a finished");
}	

   }


