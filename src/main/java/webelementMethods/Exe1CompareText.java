package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe1CompareText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTH\\OneDrive\\Documents\\Automation Class\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  //This will maximize the browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");
		
		String textBeforeLogin = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/span")).getText();
		
		driver.findElement(By.linkText("log yourself in")).click();
		driver.findElement(By.name("email_address")).sendKeys("tanmay@unicodetechnologies.in");
		driver.findElement(By.name("password")).sendKeys("unicode");
		driver.findElement(By.id("tdb1")).click();
	
		String textAfterLogin = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/span")).getText();

		System.out.println("Text Before Login-"+textBeforeLogin);
		System.out.println("Text After Login-"+textAfterLogin);

		if(!(textBeforeLogin.equalsIgnoreCase(textAfterLogin))) {
			
			System.out.println("PASS");
		}else {
			
			System.out.println("FAIL");
		}
		
	}

}

