package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageScrollDown {

	WebDriver driver;

	public PageScrollDown(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}

	@FindBy(xpath ="//span[contains(text(),'Like')]")
	private WebElement likebutton;                  
    public WebElement getLikebutton() {
		return likebutton;

	}
	

}