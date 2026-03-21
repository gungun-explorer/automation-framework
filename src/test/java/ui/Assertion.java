package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//public class Assertion {
	

//public void asserTest() {
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.google.com");
//	String actual_string = "Google";
//	String expected_string = "driver.getTitle()";
//	Assert.assertEquals(actual_string, expected_string);
//	driver.close();
//}
//	public class SoftAsserts{
//		@Test
//		public void softAssert() {
//		SoftAssert sa =  new SoftAssert();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.ebay.com");
//		String expected_title = "abc";
//		String actual_title = driver.getTitle();
//		sa.assertEquals(expected_title, actual_title );
//		driver.close();
//		sa.assertAll();
//	}
//	}
//}
	public class Assertion {
		@Test(groups = "smoke")
		public void Number1() {
			System.out.println("number one is an smoke test");
		}
	        @Test(groups = "regression")
			public void Number2() {
				System.out.println("number two is a regression test");
			}
			@Test(groups = "smoke")
				public void Number3() {
					System.out.println("number two is a smoke test");
			}
			@Test(groups = "regression")			
					public void Number4() {
						System.out.println("number two is a regression test");
						

		}
		
		
	}
