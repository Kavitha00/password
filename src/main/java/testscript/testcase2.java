package testscript;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import Genericlib.Baseclass;
import pom.skillraryfirstpg;
import pom.skillraryforthpg;
import pom.skillrarysecondpg;

public class testcase2 extends Baseclass{

	@Test
	public void tc2() throws IOException, InterruptedException {
	skillraryfirstpg f = new skillraryfirstpg(driver);
	f.gear();
	f.skillarydemo();
	
	skillrarysecondpg s = new skillrarysecondpg(driver);
	wb.switchtab(driver);
	wb.dropdown(s.getDd(),p.propertyfiledata("dd"));
	
	
	skillraryforthpg o = new skillraryforthpg(driver);
	wb.draganddrop(driver, o.getSeleniumtraining(),o.getMycart());
	Point loc = o.getFbicon().getLocation();
	int x = loc.getX();
	int y = loc.getY();
	wb.scrollbar(driver, x, y);
	o.fb();
	Thread.sleep(3000);
	}
}
