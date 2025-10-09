package Day2;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAndkeybordAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");
		
		Actions act = new Actions(driver);
		
		//control+A(selact all)
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//copy all
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//press tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//contop+v (paste all)
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		/*
		WebElement slider = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
		System.out.println(slider.getLocation());//(949, 2026)
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 980, 2026).perform();
		System.out.println(slider.getLocation());
		*/
	}

}
