package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1500)");
		
		//WebElement ele = driver.findElement(By.xpath("//strong[@class='poll-display-text']"));
		
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//js.executeScript("window.scrollBy(0, document.body.scrollHeight");
		
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
	

		driver.findElement(By.xpath("//input[@id='singleFileInput']"));
	}

}
