package alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleAlertWindow {

	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTH\\OneDrive\\Documents\\Automation Class\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test
	public void testAlertWindow() throws InterruptedException {
		
		driver.get("http://localhost/uth/gadgetsgallery/catalog/index.php");
		driver.findElement(By.linkText("create an account")).click();
		
		driver.findElement(By.id("tdb1")).click();
		
		Thread.sleep(5000);
		
		//Code to handle alert window
		
		driver.switchTo().alert().accept();   //OK/YES button
		//driver.switchTo().alert().dismiss();  //CANCEL/NO button
		
		driver.findElement(By.name("firstname")).sendKeys("Tanmay");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.close();
	}
}

