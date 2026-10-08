package test;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.Saucebase;
import page.SauceHomePage;

public class SauceHometest extends Saucebase
{
@Test(priority = 1)
public void product()
{  
	test=extent.createTest("product");
	
	String actproduct = home.products();
    String expproduct = "products";
    Assert.assertEquals(actproduct, expproduct,"Non match");
    System.out.println("Product verified");
}
@Test(priority = 2)
public void pricelowhigh()
{   
	test=extent.createTest("pricelowhigh");
	home.prices();
}
@Test(priority = 3)
public void cart()
{   
	test=extent.createTest("cart");
	
	home.addcart();
	
}
@Test(priority = 4)
public void clickcarts()
{
	home.clickcart();
}
} 
