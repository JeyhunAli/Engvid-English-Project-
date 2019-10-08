package stepsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import commonPage.CommonEngvid;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.PageObjectNewTab;

public class StepsNewTab {
	WebDriver driver;
	PageObjectNewTab NewTab;
	
	@Given("^user already on web page$")
	public void user_already_on_web_page() throws Throwable {
	 
		driver = CommonEngvid.getDriver("chrome", driver);
		driver.get(CommonEngvid.getGetURL());
		NewTab=PageFactory.initElements(driver, PageObjectNewTab.class);
		
	}

	@When("^User right click on Topics$")                               //right click open new tab code context.
	public void user_right_click_on_Topics() throws Throwable {
		WebElement rightClickElement = driver.findElement(By.xpath("//a[contains(text(),'Topics')]"));
		Actions action = new Actions(driver);
		action.contextClick(rightClickElement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	 
	  
	}

	@Then("^User click open in new tab$")
	public void user_click_open_in_new_tab() throws Throwable {
	 
	  
	}

}
