package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrary6 {

	@FindBy(xpath="//a[text()='X']")
	private WebElement cancel;
	
	@FindBy(xpath="//div[@class=\"play-icon\"]")
	private WebElement play;
	
	@FindBy(xpath="//div[@class=\"pause-icon\"]")
	private WebElement pause;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlist;
	
	public skillrary6(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void cancelbt() {
		cancel.click();
	}
	
	public void playbt() {
		play.click();
	}
	
	public void pausebt() {
		pause.click();
	}
	
	public void wishlitbt() {
		wishlist.click();
	}
}
