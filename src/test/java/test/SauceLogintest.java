package test;

import org.testng.annotations.Test;

import base.Saucebase;
import page.SauceLoginage;



public class SauceLogintest extends  Saucebase  {
	
	@Test
	public void test()
	{
		test=extent.createTest("test");
		SauceLoginage sl = new SauceLoginage(driver);
	    sl.setvalue("standard_user", "secret_sauce");
		sl.logins();
		
	}
	
}
