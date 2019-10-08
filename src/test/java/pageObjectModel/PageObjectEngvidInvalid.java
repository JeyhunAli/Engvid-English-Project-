package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectEngvidInvalid {
	
	WebDriver driver;
	
	public PageObjectEngvidInvalid(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath= "//input[@id='user_login']")
	private WebElement getusername;
	public WebElement getgetusername() {
		return getusername;
		
	}
	@FindBy(name = "pwd")
	private WebElement getpassword;
	public WebElement getgetpassword() {
		return getpassword;
		
	}
	
	@FindBy(xpath = "//input[@class='input_login_button']")
	private WebElement clickloginbutton;
	public WebElement getclicklogbutton() {
		return clickloginbutton;
	}
	
	
	}
