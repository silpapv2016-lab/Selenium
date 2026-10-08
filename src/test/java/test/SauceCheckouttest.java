package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Saucebase;

public class SauceCheckouttest extends Saucebase{
	
	@Test(priority = 1)
	public void continueshop()
	{
		boolean continues = check.continueshopping();
	    Assert.assertEquals(continues,"Button is not enabled");
	    
	}
   @Test(priority = 2)
   public void checkout()
   {
	 boolean checkouts = check.checkoutenable();
	 Assert.assertEquals(checkouts, "Checkout button is not enabled");
   }
   @Test(priority = 3)
   public void checkoutclick()
   {
	   check.clickcheckoutbutton();
   }
   @Test(priority = 4)
   public void checkoutinformation()
   {
	   String Actualtext = check.checkoutinformations();
	   Assert.assertEquals(Actualtext, "Checkout: Your Information text is not verified");
   }
   @Test(priority = 5)
   public void address()
   {
	   check.address("Silpa", "Puthanpurakkal", "680640");
	   check.continueclick();
   }
   @Test(priority = 6)
   public void finishh()
   {
 	  check.finishing();
   }
}
