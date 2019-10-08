package commonPage;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonEngvid {
	
	private static String getURL = "https://www.engvid.com/";

	public static String getGetURL() {
		return getURL;
	}
	
	WebDriver driver;
	
	public static WebDriver getDriver(String BrowserName, WebDriver driver) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,20); //explicit wait WebElement
		 * element; element =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//input[@name='pwd']"))); return driver;
		 */
		
		return driver;
	}

	



}
