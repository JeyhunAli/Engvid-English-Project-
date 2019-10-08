package stepsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commonPage.CommonEngvid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.PageObjectNullTesting;

public class StepsPageNull {
	
	PageObjectNullTesting NullTesting;
	WebDriver driver;

	
	@Given("^User alredy on login page$")
	public void user_alredy_on_login_page() throws Throwable {
		driver = CommonEngvid.getDriver("Chrome", driver);
		driver.get(CommonEngvid.getGetURL());
		NullTesting=PageFactory.initElements(driver, PageObjectNullTesting.class);
		
		}


	@When("^user enter blank user$")
	public void user_enter_blank_user() throws Throwable {
        NullTesting.getgetAccount().click();
	}

	@When("^user enter blank password$")
	public void user_enter_blank_password() throws Throwable {
		NullTesting.getgetpassword().click();
		

	}

	@When("^it has to displayan error message$")
	public void it_has_to_displayan_error_message() throws Throwable {
		
		  driver.getTitle();
		  String Pagetitle = driver.getTitle();
		  System.out.println("Nullvalue title is: " +Pagetitle);
		  if(driver.getTitle().equalsIgnoreCase("Engvid")) {
			  System.out.println("validation pass");
		  }else 
			  System.out.println("validation fail");
	  
	}

	

	@Then("^user has to stay on login page$")
	public void user_has_to_stay_on_login_page() throws Throwable {

	}

}
