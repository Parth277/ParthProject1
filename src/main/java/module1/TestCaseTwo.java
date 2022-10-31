package module1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseTwo {

	@BeforeTest
	public void beforeTest2() {
		
		System.out.println("Before Test of Test Case 2");
	}
	
	@Test
	public void testCaseTwo() {
		
		System.out.println("This is Test Case Two");
	}
	
	@AfterTest
	public void afterTest2() {
		
		System.out.println("After Test of Test Case 2");

	}
}
