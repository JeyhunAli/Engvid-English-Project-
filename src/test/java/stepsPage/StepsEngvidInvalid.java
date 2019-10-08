package stepsPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import commonPage.CommonEngvid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.PageObjectEngvidInvalid;

public class StepsEngvidInvalid {
	
	WebDriver driver;
	PageObjectEngvidInvalid EngvidInvalid;
	
	@Given("^User alredy on Engvid WebPpage$")
	public void user_alredy_on_Engvid_WebPpage() throws Throwable {
		driver = CommonEngvid.getDriver("Chrome", driver);
		driver.get(CommonEngvid.getGetURL());
		EngvidInvalid=PageFactory.initElements(driver,PageObjectEngvidInvalid.class);
		
		}

	@When("^User entering invalid username$")
	public void user_entering_invalid_username() throws Throwable {
		EngvidInvalid.getgetusername().sendKeys("Ali-ceyhun@list.com");
				}

	@When("^user entering invalid password$")
	public void user_entering_invalid_password() throws Throwable {
		EngvidInvalid.getgetpassword().sendKeys("asderfgth");
		
	}

	@When("^it have to display error message on screen$")
	public void it_have_to_display_error_message_on_screen() throws Throwable {
		

		  driver.getTitle();
		  String Pagetitle = driver.getTitle();
		  System.out.println("invalid title is: " +Pagetitle);
		  if(driver.getTitle().equalsIgnoreCase("Engvid")) {
			  System.out.println("validation pass");
		  }else 
			  System.out.println("validation fail");
	  
	}

	@Then("^it have to stay on login page after run$")
	public void it_have_to_stay_on_login_page_after_run() throws Throwable {
	
		
		
	
	  
	}


	
	
}

