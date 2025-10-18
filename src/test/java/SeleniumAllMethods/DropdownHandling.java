package SeleniumAllMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdownEle = driver.findElement(By.xpath("//select[@id='country']"));
		//select dropdown
		Select dropdown = new Select(dropdownEle);
		//dropdown.selectByVisibleText("France");
		//dropdown.selectByValue("uk");
		//dropdown.selectByIndex(3);
		
		List<WebElement> option = dropdown.getOptions();
		System.out.println(option.size());
		
		for(WebElement op: option) {
			System.out.println(op.getText());
			
		
		
			
		
		}
	}

}
