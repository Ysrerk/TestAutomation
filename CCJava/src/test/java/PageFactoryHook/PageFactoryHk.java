package PageFactoryHook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class PageFactoryHk {
	
	WebDriver driver;
	
	@FindBy(id = "user-name")
	WebElement text_username_loginElement;
	@FindBy(id ="password" )
	WebElement text_password_loginElement;
	@FindBy(id = "login-button")
	WebElement button_loginElement;
	
	
	public PageFactoryHk(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void entertext(String username,String password) {
		
		text_username_loginElement.sendKeys(username);
		text_password_loginElement.sendKeys(password);
		
	}
	
	public void clickloginbutton() {
		button_loginElement.click();
	}

}
