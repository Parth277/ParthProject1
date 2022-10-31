package programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	static WebDriver driver;
	static String url = "http://122.170.14.195:8080/uth/gadgetsgallery/catalog/";
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(url);
		
		WebElement categoryElement = driver.findElement(By.xpath("//*[@id=\"left_sidebar\"]/div[1]/div[2]"));  
		
		List<WebElement> catLinks = categoryElement.findElements(By.tagName("a"));
		
		int catLinkCounts = catLinks.size();
		
		
		System.out.println("Total Number of Links:->"+catLinkCounts);
		

		
		for(int count=0;count<catLinkCounts;count++) {
			
			System.out.println(catLinks.get(count).getText());
			
			catLinks.get(count).click();
						
			System.out.println(driver.getTitle()+"->"+driver.getCurrentUrl());
			
			Thread.sleep(1000);
			
			driver.navigate().back();
			Thread.sleep(1000);

			categoryElement = driver.findElement(By.xpath("//*[@id=\"left_sidebar\"]/div[1]/div[2]"));  
			
			catLinks = categoryElement.findElements(By.tagName("a"));
			
		}
		
		driver.close();
	}

}
