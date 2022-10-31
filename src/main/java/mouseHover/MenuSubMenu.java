package mouseHover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MenuSubMenu {

	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARTH\\OneDrive\\Documents\\Automation Class\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test
	public void testMenuSubMenu() {
	
		driver.get("https://www.myntra.com/");
	
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[4]/div/a"));
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[4]/div/div/div/div/li[1]/ul/li[3]/a"));

		Actions act = new Actions(driver);
		
		act.moveToElement(mainMenu).build().perform();
		
		subMenu.click();
		
			
}
}