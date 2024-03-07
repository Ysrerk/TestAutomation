package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceloginPF {
	
	WebDriver driver;
	
	public SauceloginPF(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id ="user-name" )
	WebElement text_username_login;
	
	@FindBy(id = "password")
	WebElement text_password_login;
	
	@FindBy(id = "login-button")
	WebElement button_login;
	
	public void enterusername(String username) {
		text_username_login.sendKeys(username);
		
	}
	public void enterpassword(String password) {
		
		text_password_login.sendKeys(password);
	}
	 public void  clickloginbutton() {
		 
		 button_login.click();
		 
	 }
	
	

}
