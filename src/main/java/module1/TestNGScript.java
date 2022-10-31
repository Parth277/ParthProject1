package module1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGScript {

	WebDriver driver = null;
	
	@BeforeTest
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();   //Remember the line
		driver = new ChromeDriver();		
		driver.manage().window().maximize();  //This will maximize the browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
	}
		
	@Test
	public void testPractice() {
		
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");
		
		
		WebElement manufacturer = driver.findElement(By.name("manufacturers_id"));  //step 1
		Select sel = new Select(manufacturer);  //Step 2
		sel.selectByVisibleText("Motorola");  //Step 3
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.close();
	}
}
