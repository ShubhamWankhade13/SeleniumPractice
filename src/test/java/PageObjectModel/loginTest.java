package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {
	WebDriver driver;
	@BeforeClass
	void setup(){
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
	}
	@Test
	void testLogin() {
		LoginPage lg = new LoginPage(driver);
		lg.setUsername("student");
		lg.setPassword("Password123");
		lg.clicklogin();
		
	}
	@AfterClass
	void teardown() {
		driver.quit();
		
	}

}
