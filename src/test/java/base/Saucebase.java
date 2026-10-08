package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import page.SauceCheckout;
import page.SauceHomePage;

public class Saucebase 
{

	public static WebDriver driver;
	public static SauceHomePage home;
	public static SauceCheckout check;
	
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@BeforeTest
	public void setup()
	{
		
	 reporter = new ExtentSparkReporter("./Reports/myreport.html");
	 reporter.config().setDocumentTitle("Automation Reports");
	 reporter.config().setReportName("Functional test");
	 reporter.config().setTheme(Theme.DARK);
	 
	 extent = new ExtentReports();
	 extent.attachReporter(reporter);
	 extent.setSystemInfo("hostname", "localhost");
	 extent.setSystemInfo("testername", "Silpa P V");
	 
     ChromeOptions option = new ChromeOptions();
     option.addArguments("--incognito");
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objects()
	{
		home = new SauceHomePage();
		check = new SauceCheckout(driver);
	}
	
	
	@AfterMethod
	
	public void browserclass(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"test case failed" +result.getName());
			test.log(Status.FAIL,"test case failed" +result.getThrowable());
			test.log(Status.FAIL,"test case failed" +result.getStatus());
		}
		else if (result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case failed" +result.getName());
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed" +result.getName());
		}
	}
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
}
