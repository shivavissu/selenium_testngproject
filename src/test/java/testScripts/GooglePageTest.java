package testScripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import commonUtils.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GooglePageTest {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	
	@BeforeTest
	public void setupextent() {
		extentReports=new ExtentReports();
		spark=new ExtentSparkReporter("test-output/sparkreport.html");
		extentReports.attachReporter(spark);
		
	}
	@Parameters("browser")
//	@BeforeMethod
	@BeforeTest
	public void setup(String strbrowser) {
		if(strbrowser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}
		else if(strbrowser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
  @Test
  public void javasearchtest() {
	extentTest=extentReports.createTest("Java Search Test");
		//4.10
		driver.navigate().to("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Java Tutorial");
		schBox.submit();
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");

  }
  @Test
  public void seleniumsearchtest() {
	  extentTest=extentReports.createTest("Selenium Search Test");
		//4.10
		driver.navigate().to("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Selenium Tutorial");
		schBox.submit();
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google");
  }
  
  @Test(alwaysRun=true,dependsOnMethods="seleniumsearchtest" )
  public void appiumsearchtest() {
	  extentTest=extentReports.createTest("Appium Search Test")	;	
		//4.10
		driver.navigate().to("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Appium Tutorial");
		schBox.submit();
		Assert.assertEquals(driver.getTitle(), "Appium Tutorial - Google");
  }
  
  @AfterTest
  public void finishExtent() {
	  extentReports.flush();
  }
  @AfterMethod
  public void generateReport(ITestResult result) {
	  if(result.getStatus()==ITestResult.FAILURE) {
		  extentTest.fail(result.getThrowable().getMessage());
		  String path=Utility.getScreenshotPath(driver);
		  extentTest.addScreenCaptureFromPath(path);
	  }
	  driver.close();
  }
  

}
