package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryfirstpg {

	@FindBy(xpath="//a[text()=\" GEARS \"]")
	private WebElement gearbtn;
	
	
	@FindBy(xpath="(//a[contains(text(),\" SkillRary Demo APP\")])[2]")
	private WebElement skillarydemobtn;
	
	@FindBy(name="q")
	private WebElement textfield;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement search;
	
	
	
	
	public skillraryfirstpg(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void gear()
	{
		gearbtn.click();
	}
	
	
	public void skillarydemo()
	{
		skillarydemobtn.click();
	}
	
	public void textfieldarea() {
		textfield.sendKeys("core java for selenium");
	}
	
	public void searchbox() {
		search.click();
	}
}
