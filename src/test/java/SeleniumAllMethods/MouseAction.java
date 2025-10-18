package SeleniumAllMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		/*
		WebElement Text1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement Text2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Text1.clear();
		Text1.sendKeys("Welcome");
		
		Actions action = new Actions(driver);
		
		action.doubleClick(button).perform();
		
		if(Text2.getAttribute("value").equals("Welcome")) {
			System.out.println("true");
		}
		
		
		WebElement button = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).perform();
		*/
		
		WebElement dragele=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropele=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragele, dropele).perform();
	}

}
