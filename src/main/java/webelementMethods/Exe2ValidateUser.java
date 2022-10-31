package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe2ValidateUser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTH\\OneDrive\\Documents\\Automation Class\\chromedriver_win32\\chromedriver.exe");  //MAC Machine
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  //This will maximize the browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");
		
		driver.findElement(By.linkText("log yourself in")).click();
		driver.findElement(By.name("email_address")).sendKeys("tanmay@unicodetechnologies.in");
		driver.findElement(By.name("password")).sendKeys("unicode");
		driver.findElement(By.id("tdb1")).click();
	
		
		try {
			
			boolean checkLogin = driver.findElement(By.linkText("Log Off")).isDisplayed();
			
			System.out.println("User is logged in successfully");
			
			driver.findElement(By.linkText("Log Off")).click();
			driver.findElement(By.id("tdb1")).click();
			
		}catch(Exception e) {
			
			System.out.println("Invalid Email Address or Password");
		}
		
	}

}

