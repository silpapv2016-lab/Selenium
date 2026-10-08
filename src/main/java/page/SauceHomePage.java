package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SauceHomePage
{
    WebDriver driver;
	
    By product =By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By price = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	
	By cart1 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
	By cart2 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
	By cart3 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	By cart4 = By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
	By cart5 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By cart6 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
	
	By cartdisplay = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

	
	public SauceHomePage() 
	{
		this.driver=driver;	
	}
	
	public String products()
	{
		return driver.findElement(product).getText();
	}
	public void prices()
	{
		Select low = new Select(driver.findElement(price));
	    low.selectByVisibleText("Price(low to high)");
	    
	}
	public void addcart()
	{
		driver.findElement(cart1).click(); 
		driver.findElement(cart2).click(); 
		driver.findElement(cart3).click(); 
		driver.findElement(cart4).click(); 
		driver.findElement(cart5).click(); 
		driver.findElement(cart6).click(); 	
	}
	public void clickcart()
	{
		driver.findElement(cartdisplay).click();
	}
	
}
