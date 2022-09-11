package testscript;

import org.testng.annotations.Test;

import Genericlib.Baseclass;
import pom.skillarythirdpg;
import pom.skillraryfirstpg;
import pom.skillrarysecondpg;


public class testcase1 extends Baseclass {

	@Test
	public void tc1() throws InterruptedException
	{
		skillraryfirstpg f = new skillraryfirstpg(driver);
		f.gear();
		Thread.sleep(3000);
		f.skillarydemo();
		
		skillrarysecondpg s = new skillrarysecondpg(driver);
		wb.switchtab(driver);
	    wb.mousehover(driver, s.getCourse());
	   s.seleniumtraining();
	    
	   skillarythirdpg t =new skillarythirdpg(driver);
	   wb.doubleclick(driver, t.getPlusbtn());
	   t.addtocart();
	   wb.alertpopup(driver);
	    
	}
	
}
