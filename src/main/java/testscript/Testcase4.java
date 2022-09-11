package testscript;

import org.testng.annotations.Test;

import Genericlib.Baseclass;
import pom1.snapdeal1;
import pom1.snapdeal2;

public class Testcase4 extends Baseclass {

	@Test
	public void tc1() throws InterruptedException {
		
		snapdeal1 s1=new snapdeal1(driver);
		wb.mousehover(driver, s1.getMens());
		s1.sweatersbt();
		Thread.sleep(3000);
		
		snapdeal2 s2=new snapdeal2(driver);
		wb.mousehover(driver,s2.getViewdetails());
		s2.viewbt();
		s2.clickbt();
	}
	
}
