package stepsPage;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import commonPage.CommonEngvid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.PageScrollDown;

public class StepsScrollDown {
	WebDriver driver;
	PageScrollDown ScrollDown;
	
	@Given("^User alredy on engvid page$")
	public void user_alredy_on_engvid_page() throws Throwable {
		driver=CommonEngvid.getDriver("chrome", driver);
		driver.get(CommonEngvid.getGetURL());
		ScrollDown=PageFactory.initElements(driver,PageScrollDown.class);
	
	}

	@When("^user scroll down the page$")
	public void user_scroll_down_the_page() throws Throwable {
		//This will scroll the web page till end.
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		/*
		 * Thread.sleep(8000); driver.close();
		 */
		
	  
	}

	@Then("^User click the like button$")
	public void user_click_the_like_button() throws Throwable {
		ScrollDown.getLikebutton().click();
		/*
		 * Actions act = new Actions(driver); act.moveToElement(driver.findElement(By.
		 * xpath("//a[@class='social_link-fb icon-facebook social_link']")));
		 * act.click().build().perform();
		 */
		driver.getTitle();
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		 
	}

}
