package TestNgAllMethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class parallelTesting {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) {
		
		switch(br) {
			case "chrome" : driver = new ChromeDriver();break;
			case "edge"   : driver= new EdgeDriver(); break;
			case "firefox" : driver= new FirefoxDriver(); break;
			
			default : System.out.println("Invalid browser");return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	@Test
	void loginTest() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		boolean url = driver.getCurrentUrl().equals("https://practicetestautomation.com/logged-in-successfully/");
		System.out.println(url);
		WebElement button = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
		System.out.println(button.isDisplayed());
	}
	@AfterClass
	void teardown() {
		driver.quit();
	}
}
