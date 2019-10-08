package pageObjectModel;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageofScreenShot {
	
	
	WebDriver driver;
	public PageofScreenShot(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath = "//a[@class=\"main\" and @title=\"English Resources\"]")
	private WebElement resourcebutton;
	public WebElement getresourcebutton() {
		return resourcebutton;
	}
	
	@FindBy(xpath = "//div[@id='lessonlinks_all_content']//div[1]")
	private WebElement resumebutton;
	public WebElement getresumebutton() {
		return resumebutton;
		
	}
	public void ss(WebDriver driver,String engvidResume)throws Throwable{
		TakesScreenshot tkss = (TakesScreenshot)driver;
		File file = tkss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(engvidResume+".jpg"));
		

}
}