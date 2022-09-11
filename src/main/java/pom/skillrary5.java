package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrary5 {

	@FindBy(xpath="//a[contains(text(),' Core Java For Selenium Trainin')]")
	private WebElement seleniumlink;
	
	public skillrary5(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void selenium() {
		seleniumlink.click();
	}
}
