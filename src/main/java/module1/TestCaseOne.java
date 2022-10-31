package module1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseOne {

	@BeforeTest
	public void launchBrowser() {
		
		System.out.println("-------------Launching Browser- @BeforeTest-------------");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("***Before Method***");
	}
	
	
	@Test(priority = 1)
	public void positiveTest()
	{
		
		System.out.println("This is Positive Test");
		
	}
	
	
	@Test(priority = 2)
	public void negativeTest()
	{
		
		System.out.println("This is Negative Test");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("***After Method***");
	}
	
	
	@AfterTest
	public void closeBrowser() {
		
		System.out.println("-------------Closing Browser @AfterTest-------------");
	}
	

}
