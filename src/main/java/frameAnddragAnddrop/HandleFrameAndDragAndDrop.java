package frameAnddragAnddrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleFrameAndDragAndDrop {
	
WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTH\\OneDrive\\Documents\\Automation Class\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test
	public void testHandleFrameAndDragAndDrop() {
	
		driver.get("https://jqueryui.com/droppable/");
		WebElement frameWindow = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		driver.switchTo().frame(frameWindow);
	
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, destination).build().perform();
		
		driver.switchTo().defaultContent();
	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.close();
	}
}
