package OrgBackgroundPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrnHomePF {
	
	@FindBy(id = "user-name")
	WebElement txtusername;
	
	@FindBy(id ="password" )
	WebElement txtpassword;
	
	@FindBy(id = "login-button")
	WebElement btnlogin;
	/*
	@FindBy(id = "user-name")
	WebElement text_username_loginElement;
	@FindBy(id ="password" )
	WebElement text_password_loginElement;
	@FindBy(id = "login-button")
	WebElement button_loginElement;
	
	*/
	WebDriver driver;

	public OrnHomePF(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enter_username_passsword(String username , String password) {
		txtusername.sendKeys(username);
		
	
		txtpassword.sendKeys(password);
	}
	public void entertext(String username,String password) {
		
		txtusername.sendKeys(username);
		txtpassword.sendKeys(password);
		
	}
	
	
	public void clickbutton() {
		btnlogin.click();
	}
	

}
