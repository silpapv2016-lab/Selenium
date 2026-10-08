package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SauceCheckout
{
  WebDriver driver;
  
  By shopping = By.xpath("//*[@id=\"continue-shopping\"]");
  By checkoutenable = By.xpath("//*[@id=\"checkout\"]");
  By clickcheckout = By.xpath("//*[@id=\"checkout\"]");
  By information = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
  
  By firstname = By.xpath("//*[@id=\"first-name\"]");
  By lastname = By.xpath("//*[@id=\"last-name\"]");
  By postalcode = By.xpath("//*[@id=\"postal-code\"]");
  By continuebutton = By.xpath("//*[@id=\"continue\"]");
  
  By finish = By.xpath("//*[@id=\"finish\"]");
  
  public SauceCheckout(WebDriver driver)
  {
	  this.driver=driver;
  }
  
  public boolean continueshopping()
  {
	return driver.findElement(shopping).isEnabled();
  }
  
  public boolean checkoutenable()
  {
   return driver.findElement(checkoutenable).isEnabled();
  }
  public void clickcheckoutbutton()
  {
	  driver.findElement(checkoutenable).click();
  }
  public String checkoutinformations()
  {
	 return driver.findElement(information).getText(); 
  }
  public void address(String Firstname,String Lastname,String zip)
  {
	  driver.findElement(firstname).sendKeys(Firstname);
	  driver.findElement(lastname).sendKeys(Lastname);
	  driver.findElement(postalcode).sendKeys(zip);
  }
  public void continueclick()
  {
	  driver.findElement(continuebutton).click();
  }
  public void finishing()
  {
	  driver.findElement(finish).click();
  }
}
