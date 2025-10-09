package Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement reglink = driver.findElement(By.xpath("//a[@class='ico-register']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(reglink).keyUp(Keys.COMMAND).perform();
		
		List<String> ids= new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("shubham");

	}

}
