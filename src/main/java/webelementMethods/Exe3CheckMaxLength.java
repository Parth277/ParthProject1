package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe3CheckMaxLength {

	public static void main(String[] args) {

		int expResult = 30;
		int actResult;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTH\\OneDrive\\Documents\\Automation Class\\chromedriver_win32\\chromedriver.exe");  //MAC Machine
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  //This will maximize the browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");
		
		WebElement element = driver.findElement(By.name("keywords"));
		
		String attrDetails = element.getAttribute("maxlength");
		
		actResult = Integer.parseInt(attrDetails);
		
		System.out.println("Actual Result is->"+actResult);
		System.out.println("Expected Result is->"+expResult);

		if(actResult==expResult) {
			
			System.out.println("PAss");
		}else {
			
			System.out.println("Fail");
		}
		
	}

}
