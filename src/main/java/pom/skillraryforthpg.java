package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryforthpg {

	@FindBy(xpath="(//a[text()=\"Selenium Training\"])[2]")
	private WebElement seleniumtraining;
	
	@FindBy(id="mycart")
	private WebElement mycart;
	
	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public WebElement getMycart() {
		return mycart;
	}

	public WebElement getFbicon() {
		return fbicon;
	}

	@FindBy(xpath="(//i[contains(@class,\"fa fa-facebook\")])[2]")
	private WebElement fbicon;
	
	public skillraryforthpg(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void fb()
	{
		 fbicon.click();
	}
}
