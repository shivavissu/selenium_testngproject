package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
//	@BeforeMethod
	@BeforeTest
	public void setup(String strbrowser) {
	//	WebDriver driver;
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
