package stepsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonPage.CommonEngvid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.PageObjectMouseOver;

public class StepsMouseOver {
	WebDriver driver;
	PageObjectMouseOver MouseOver;

	@Given("^User alredy on web page$")
	public void user_alredy_on_web_page() throws Throwable {
		driver = CommonEngvid.getDriver("driver", driver);
		driver.get(CommonEngvid.getGetURL());
		MouseOver = PageFactory.initElements(driver, PageObjectMouseOver.class);
	}

	@When("^User mouse over to teacher button$")
	public void user_mouse_over_to_teacher_button() throws Throwable {
		MouseOver.mouseover();

	}

	@When("^User selected Ronnie$")
	public void user_selected_Ronnie() throws Throwable {
		MouseOver.mouseover();
	
	} @Then("^User succeffuly get the page he want$")
	public void user_succeffuly_get_the_page_he_want() throws Throwable {
		driver.getTitle();
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		if(driver.getTitle().equalsIgnoreCase("Adam · engVid")){
			System.out.println("My test passed");
			}
		else {
			System.out.println("my test failed ");
			Assert.assertEquals(PageTitle, "Adam · engVid");
			
		
		}
	}
	

}
