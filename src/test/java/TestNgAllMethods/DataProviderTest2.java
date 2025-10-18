package TestNgAllMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2 {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@DataProvider(name="dp")
	Object[][] LoginData(){
		Object data[][] = {
			{"akashay@gmail.com", "akshay123"},
			{"sudhir@gmail.com", "sudhir123"},
			{"shubhamw@gmail.com", "shubham123"}
		};
		return data;
	}
	
	@Test(dataProvider="dp")
	void LoginTest(String email, String pwd) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}
	@AfterClass
	void teardown() {
		driver.quit();
	}
}
