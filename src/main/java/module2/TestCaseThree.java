package module2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseThree {

	@BeforeTest
	public void beforeTest3() {
		
		System.out.println("Before Test of Test Case 3");
	}
	
	@Test
	public void testCaseThree() {
		
		System.out.println("This is Test Case Three");
	}
	
	@AfterTest
	public void afterTest3() {
		
		System.out.println("After Test of Test Case 3");

	}
}
