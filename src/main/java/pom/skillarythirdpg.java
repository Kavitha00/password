package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillarythirdpg {

	
	@FindBy(xpath="//i[contains(@class,\"fa fa-plus\")]")
	private WebElement plusbtn;
	
	@FindBy(xpath="//button[contains(@ondblclick,\"addtocart()\")]")
	private WebElement addtocartbtn;
	
	public skillarythirdpg(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	
	public WebElement getPlusbtn() {
		return plusbtn;
	}



	public void addtocart()
	{
		addtocartbtn.click();
	}
}
