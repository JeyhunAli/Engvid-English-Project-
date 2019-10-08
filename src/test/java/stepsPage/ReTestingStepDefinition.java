package stepsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import commonPage.CommonEngvid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.RetestingPageObject;

public class ReTestingStepDefinition {
	WebDriver driver;
	RetestingPageObject Retesting;
	
	@Given("^USer alredy on engvid web page$")
	public void user_alredy_on_engvid_web_page() throws Throwable {
		driver = CommonEngvid.getDriver("chrome", driver);
		driver.get(CommonEngvid.getGetURL());
		Retesting=PageFactory.initElements(driver, RetestingPageObject.class);
		
	 }

	@When("^User entered username$")
	public void user_entered_username() throws Throwable {
		Retesting.getvalidlog().sendKeys("JNHUN");
	 
	    
	}

	@When("^user entered password$")
	public void user_entered_password() throws Throwable {
		//Retesting.getvalidpass().sendKeys("asderfgty");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//input[@id='user_pass']")));
		actions.click();
		actions.sendKeys("asderfgty");
		actions.build().perform();
	 
	    
	}

	@When("^user clicked on login button$")
	public void user_clicked_on_login_button() throws Throwable {
		Retesting.getvalidlogbut().click();
	 
	    
	}

	@Then("^USer succeffuly loged in$")
	public void user_succeffuly_loged_in() throws Throwable {
	 
	    
	}


}
