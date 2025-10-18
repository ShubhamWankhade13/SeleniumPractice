package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;


	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='password']")
    WebElement txt_password;
    
    @FindBy(xpath="//input[@id='username']")
    WebElement txt_username;
    
    @FindBy(xpath="//button[@id='submit']")
    WebElement txt_button;
	
	
	//action methods
    public void setUsername(String user) {
    	txt_username.sendKeys(user);
    }
    
    public void setPassword(String pass) {
    	txt_password.sendKeys(pass);
    }
    
    public void clicklogin() {
    	txt_button.click();
    }

}
