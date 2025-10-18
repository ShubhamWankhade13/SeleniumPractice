package SeleniumAllMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> CheckBox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//for(WebElement checkbox:CheckBox) {
		//	checkbox.click();
		//}
		
		for(int i=3;i<CheckBox.size();i++) {
			CheckBox.get(i).click();
			}
	}

}
