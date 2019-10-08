package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectNullTesting {
	WebDriver driver;
	
	public PageObjectNullTesting (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath= "//input[@id='user_login']")
	private WebElement MyAccount;
	public WebElement getgetAccount() {
		return MyAccount;
		
	}
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement getpassword;
	public WebElement getgetpassword() {
		return getpassword;
		
	}
	@FindBy(xpath = "//input[@class='input_login_button']")
	private WebElement NullValue;
	public WebElement getlogbutton() {
		return NullValue;
	}
	
	

	
	
	

}
