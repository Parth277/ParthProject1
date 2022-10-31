package programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtractHomePageLinks {

	WebDriver driver;
	String url = "http://122.170.14.195:8080/uth/gadgetsgallery/catalog/";
	
	@BeforeTest
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void testExtractHomePageLinks() {
		
		driver.get(url);
		
		//WebElement firstLink = driver.findElement(By.tagName("a"));  //It will point to the first link on the webpage
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int linkCounts = allLinks.size();
		
		
		System.out.println("Total Number of Links:->"+linkCounts);
		
		//System.out.println(allLinks.get(1).getText());
		
		
		
		for(int count=0;count<linkCounts;count++) {
			
			System.out.println(allLinks.get(count).getText());
		}
		
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.close();
	}
}
