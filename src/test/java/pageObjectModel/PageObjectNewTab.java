package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectNewTab {
	
	WebDriver driver;
	
	public PageObjectNewTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[contains(text(),'Topics')]")
	private WebElement ButtonTopics;
	public WebElement getButtonTopics() {
		return ButtonTopics;
		
	}
	
	
	
	

}
