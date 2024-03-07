package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLogin {
	WebDriver driver;
	By text_username_login=By.id("user-name");
	By text_password_login=By.id("password");
	By button_login_login=By.id("login-button");
	
	public SauceLogin(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void enterusername(String username) {
		driver.findElement(text_username_login).sendKeys(username);
	}
	public void enterpassword(String password) {
		
		driver.findElement(text_password_login).sendKeys(password);
		
	}
	
	public void clickloginbutton() {
		driver.findElement(button_login_login).click();
	}
	
	

}
