package module2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseFour {

	@BeforeTest
	public void beforeTest4() {
		
		System.out.println("Before Test of Test Case 4");
	}
	
	@Test
	public void testCaseFour() {
		
		System.out.println("This is Test Case Four");
	}
	
	@AfterTest
	public void afterTest4() {
		
		System.out.println("After Test of Test Case 4");

	}
}
