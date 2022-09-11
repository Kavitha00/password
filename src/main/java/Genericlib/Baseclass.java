package Genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public WebDriver driver;
	
	public propertyfile p=new propertyfile();
	public WebElementUtilies wb=new WebElementUtilies();
	@BeforeMethod
	public void openapp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(p.propertyfiledata("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeapp(ITestResult result) throws IOException
	{
		int status = result.getStatus();
		String name = result.getName();
		if(status==2) {
			screenshot s=new screenshot();
			s.getscreenshot(driver, name);
		}
		
		driver.quit();
	}
}
