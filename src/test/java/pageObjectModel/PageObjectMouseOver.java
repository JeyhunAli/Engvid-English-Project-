package pageObjectModel;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectMouseOver {

	WebDriver driver;

	public PageObjectMouseOver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * }@FindBy(xpath ="//a[contains(text(),'Teachers')]") private WebElement
	 * TeacherButton; public WebElement getTeacherButton() { return TeacherButton; }
	 * 
	 * @FindBy(xpath ="@FindBy(xpath =\"//a[contains(text(),'Teachers')]\")\r\n" +
	 * "	private WebElement TeacherButton;\r\n" +
	 * "	public WebElement getTeacherButton() {\r\n" +
	 * "		return TeacherButton;") private WebElement Ronnie; public WebElement
	 * getRonnie() { return Ronnie;
	 */

	public void mouseover() throws InterruptedException { // write throes and press cntrl and space
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[text()='Teachers']")); // this link is of the accoumt aand list
		action.moveToElement(we)
				.moveToElement(driver
						.findElement(By.xpath("//li[@class='teacher_listitem first']//a[contains(text(),'Adam')]")))
				.click().build().perform();
	
	}
	public void takess(WebDriver driver,String AdamEngvid)throws Throwable{
		TakesScreenshot tkss = (TakesScreenshot)driver;
		File file = tkss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Ali-c\\eclipse-workspace\\EngvidEnglish\\src\\test\\java\\commonPage"+AdamEngvid+".jpg"));
		
		
		  
	}


}
