package stepsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import commonPage.CommonEngvid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.PageofScreenShot;

public class StepsOfScreenShot {
	
	WebDriver driver;
	PageofScreenShot PSS;
	
	
	@Given("^user alredy in web page$")
	public void user_alredy_in_web_page() throws Throwable {
		driver = CommonEngvid.getDriver("Chrome", driver);
		driver.get(CommonEngvid.getGetURL());
		PSS = PageFactory.initElements(driver,PageofScreenShot.class);
	  
	   
	}

	@When("^user click on Resources button$")
	public void user_click_on_Resources_button() throws Throwable {
		PSS.getresourcebutton().click();
	  
	   
	}

	@When("^user click on the resume sample tip button$")
	public void user_click_on_the_resume_sample_tip_button() throws Throwable {
		PSS.getresumebutton().click();
	  
	   
	}

	@Then("^user take a screen shot of the page$")
	public void user_take_a_screen_shot_of_the_page() throws Throwable {
		PSS.ss(driver, "engvidResume");
		/*
		 * Thread.sleep(5000); driver.navigate().back(); driver.close();
		 */
	   
	}

}
