package Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TableHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		/*
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println(rows.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		
		System.out.println(column.size());
		
		for(WebElement r: rows) {
			System.out.println(r.getText()+"\t");
		}
		*/
		
		WebElement ele = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]"));
		System.out.println(ele.getText());

	}

}
