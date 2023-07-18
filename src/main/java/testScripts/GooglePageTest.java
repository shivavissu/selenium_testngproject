package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GooglePageTest {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
	   driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
  @Test
  public void javasearchtest() {
		
		//4.10
		driver.navigate().to("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Java Tutorial");
		Assert.assertEquals(driver.getTitle(), "Java Tutorial");
		schBox.submit();

  }
  @Test
  public void seleniumsearchtest() {
		
		//4.10
		driver.navigate().to("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Selenium Tutorial");
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial");
		schBox.submit();

  }
  @AfterMethod
    public void teardown() {
	  driver.close();
  }
  

}
