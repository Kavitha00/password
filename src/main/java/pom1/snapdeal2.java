package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class snapdeal2 {

	@FindBy(xpath="//img[contains(@title,\"Bewakoof Blue Round Neck Sweater Single\")]")
	private WebElement viewdetails;
	
	public WebElement getViewdetails() {
		return viewdetails;
	}

	@FindBy(xpath="(//div[contains(text(),\"Quick View\")])[1]")
	private WebElement view;
	
	@FindBy(xpath="(//div[@class=\"clear\"])[1]")
	private WebElement click;
	
	public snapdeal2(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void viewbt() {
		view.click();
	}
	
	public void clickbt()
{
		click.click();
}
}
