package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLoginage
{
	 WebDriver driver;
	  By usernamefield= By.id("user-name");
	  By passwordfield=By.id("password");
	  By login = By.id("login-button");
	  
	  
	  public SauceLoginage(WebDriver driver)
	  {
		  this.driver=driver;
	  }
	  
	  public void setvalue(String username, String password)
	  
	  {
		  driver.findElement(usernamefield).sendKeys(username);
		  driver.findElement(passwordfield).sendKeys(password);
	  }
	  public void logins()
	  {
		  driver.findElement(login).click();
	  }

}
