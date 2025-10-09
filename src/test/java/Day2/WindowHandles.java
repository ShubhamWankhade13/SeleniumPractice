package Day2;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.className("wikipedia-search-button")).click();
		
		List<WebElement> AllLink = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
		
		System.out.println(AllLink.size());
		
		for(WebElement Link : AllLink) {
			try {
			Link.click();
			Thread.sleep(1000);
			}catch( Exception e) {
				
			}
		}
		Set<String> winodwid = driver.getWindowHandles();
		System.out.println(winodwid);
		
	}

}
