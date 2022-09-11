package testscript;

import org.testng.annotations.Test;

import Genericlib.Baseclass;
import pom.skillrary5;
import pom.skillrary6;
import pom.skillraryfirstpg;

public class Testcase3 extends Baseclass{

	@Test
	public void tc1() throws InterruptedException {
		
		skillraryfirstpg s1=new skillraryfirstpg(driver);
		s1.textfieldarea();
		s1.searchbox();
		
		skillrary5 s5=new skillrary5(driver);
		s5.selenium();
		
		skillrary6 s6=new skillrary6(driver);
		s6.cancelbt();
		wb.switchframe(driver);
		s6.playbt();
		Thread.sleep(3000);
		s6.pausebt();
		wb.switchbackframe(driver);
		s6.wishlitbt();
		Thread.sleep(3000);

		
	}
	
}
