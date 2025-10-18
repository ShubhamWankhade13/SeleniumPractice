package SeleniumAllMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//expected data
		String Date= "12";
		String Month= "May";
		String Year= "2025";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		
		while(true) 
		{
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(Month) && currentYear.equals(Year))
			{
				break;
				
			}
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		List<WebElement> AllDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
		
		for(WebElement dt:AllDate) {
			 
			if(dt.getText().equals(Date)) {
				dt.click();
				break;
			}
		}
	}

}
