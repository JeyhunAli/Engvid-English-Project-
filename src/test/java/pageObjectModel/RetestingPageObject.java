package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetestingPageObject {

	WebDriver driver;

	public RetestingPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='user_login']")
	private WebElement validlog;

	public WebElement getvalidlog() {
		return validlog;
	}

	/*
	 * @FindBy(id ="user_pass") private WebElement validpass; public WebElement
	 * getvalidpass(){ return validpass; }
	 */

	@FindBy(xpath = "//input[@class='input_login_button']")
	private WebElement validlogbut;

	public WebElement getvalidlogbut() {
		return validlogbut;
	}

}
