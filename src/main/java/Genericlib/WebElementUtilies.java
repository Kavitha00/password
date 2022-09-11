package Genericlib;


import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebElementUtilies {

	public void dropdown(WebElement ele,String name) {
		Select s=new Select(ele);
		s.selectByVisibleText(name);
	}
	
	public void mousehover(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	
	public void doubleclick(WebDriver driver,WebElement ele) {

		Actions a=new Actions(driver);
        a.doubleClick(ele).perform();
	}
	
	public void draganddrop(WebDriver driver,WebElement ele,WebElement ele1) {
		Actions a=new Actions(driver);
		a.dragAndDrop(ele, ele1).perform();
	}
	
	public void switchframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void scrollbar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	
	public void switchtab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
		
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	
	}
}
