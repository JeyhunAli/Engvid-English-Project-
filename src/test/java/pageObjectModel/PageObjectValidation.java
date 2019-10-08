package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectValidation {
	
	
	WebDriver driver;
	public  PageObjectValidation(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	
	}
	@FindBy(xpath= "//input[@id='user_login']")
	private WebElement ValidLogin;
	public WebElement getValidLogin() {
		return ValidLogin;
		
	}
	@FindBy(xpath = "//input[@type='password']")
	private WebElement getValidpassword;
	public WebElement getValidPassword() {
		return getValidpassword;
		
	}
	@FindBy(xpath = "//input[@class='input_login_button']")
	private WebElement ValidationValue;
	public WebElement getloginButton() {
		return ValidationValue;
	}
	
	
	
	
	
	}