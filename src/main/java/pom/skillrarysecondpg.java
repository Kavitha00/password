package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrarysecondpg {

	
	@FindBy(xpath="//a[text()=\"COURSE\"]")
	private WebElement course;
	
	@FindBy(xpath="(//a[contains(text(),\"Selenium Training\")])[1]")
	private WebElement seleniumtrainingbtn;
	
	
	@FindBy(name="addresstype")
	private WebElement dd;
	
	public WebElement getDd() {
		return dd;
	}

	public skillrarysecondpg(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getCourse() {
		return course;
	}
	
	public void seleniumtraining()
	{
		seleniumtrainingbtn.click();
	}
	
	
	
}
