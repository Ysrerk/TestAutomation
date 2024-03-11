package StepDefinitionsWithBackground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OrgBackgroundPF.OrnHomePF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrgBackgroundStepDefinition {
	
	WebDriver driver=null;
	OrnHomePF ornpgHomePF;
	public void createbrowser() {
		String pth=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", pth+"/src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Given("bck the user navigated the login page")
	public void bck_the_user_navigated_the_login_page() {
		createbrowser();
		driver.navigate().to("https://www.saucedemo.com/");
		
	}

	/*@When("^bck user enter (.*) and (.*) on the login page$")
	public void bck_user_enter_username_and_password_on_the_login_page(String username,String password) {
		ornpgHomePF=new OrnHomePF(driver);
		ornpgHomePF.enter_username_passsword(username, password);
	}*/
	
	/*@When("^bck user enter (.*) and (.*) on the login page$")*/
	
	@When("bck user enter username and password on the login page")
	public void bck_user_enter_username_and_password_on_the_login_page() {
	    ornpgHomePF = new OrnHomePF(driver);
	    String username="standard_user";
		String password="secret_sauce";
	  
	    //ornpgHomePF.enter_username_passsword(username, password);
	    ornpgHomePF.entertext(username, password);
	   
	    ornpgHomePF.clickbutton();
	}



	@Then("bck user navigate home page")
	public void bck_user_navigate_home_page() {
		driver.getPageSource().contains("Products");
	}

	@When("bck the user click arrow on the right top")
	public void bck_the_user_click_arrow_on_the_right_top() {
	}

	@Then("bck the user will see the logout option")
	public void bck_the_user_will_see_the_logout_option() {
	}
}
