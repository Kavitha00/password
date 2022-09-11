package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class snapdeal1 {

	@FindBy(xpath="//span[text()=\"Men's Fashion\"]")
	private WebElement mens;
	
	
	public WebElement getMens() {
		return mens;
	}

	@FindBy(xpath="//span[text()=\"Sweaters\"]")
	private WebElement sweaters;
	
	public snapdeal1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void sweatersbt() {
	  sweaters.click();
	}
}
