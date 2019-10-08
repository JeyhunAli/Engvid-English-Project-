package stepsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commonPage.CommonEngvid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.PageObjectValidation;

public class StepsPageValid {
	
	WebDriver driver;
	PageObjectValidation ValidationPage;
	
	

	@Given("^user on login page$")
	public void user_on_login_page() throws Throwable {
		driver = CommonEngvid.getDriver("Chrome", driver);
		driver.get(CommonEngvid.getGetURL());
		ValidationPage=PageFactory.initElements(driver,PageObjectValidation.class);
		
		}

		
	@When("^User enter a valid email as a \"([^\"]*)\"$")
	public void user_enter_a_valid_email_as_a(String arg1) throws Throwable {
		ValidationPage.getValidLogin().sendKeys("JNHUN");
		
    }

	@When("^user enter valid password as a \"([^\"]*)\"$")
	public void user_enter_valid_password_as_a(String arg1) throws Throwable {
		ValidationPage.getValidPassword().sendKeys("asderfgty");
	  
	}
	   
	
	@Then("^User login succefully$")
	public void user_login_succefully() throws Throwable {
		ValidationPage.getloginButton().click();

	   
	}	
}	
