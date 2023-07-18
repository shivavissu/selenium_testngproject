package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTwoTest {
	@Test
	  public void javasearchtest() {
			
			//4.10
		WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://www.google.com/");
		//	Assert.assertEquals(driver.getTitle(), "Google");
			SoftAssert softassert=new SoftAssert();
			softassert.assertEquals(driver.getTitle(), "Google Page");
			WebElement schBox = driver.findElement(By.name("q"));
			schBox.sendKeys("Java Tutorial");
			schBox.submit();
			Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
		//	softassert.assertAll();
			driver.close();

	  }
}
