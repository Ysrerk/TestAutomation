package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.SauceloginPF;
import io.cucumber.java.en.*;

public class sauceloginwithparemetricPF {
	
	
	SauceloginPF sauceloginPF;
	
	
	WebDriver driver=null;
	
	public void createdriver() {
		String pth=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", pth+"/src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
	@Given("browse login page")
	public void browse_login_page() {
		createdriver();
		driver.navigate().to("https://www.saucedemo.com/");
	   
	}

	@And("^when user type (.*) and (.*)$")
	public void when_user_type_standard_user_and_secret_sauce(String username,String password) {
		System.out.println("PF CALISTI");
		
		
		sauceloginPF=new SauceloginPF(driver);
		sauceloginPF.enterusername(username);
		sauceloginPF.enterpassword(password);
		//driver.findElement(By.id("user-name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}

	@When("the user click login button")
	public void the_user_click_login_button() {
		sauceloginPF.clickloginbutton();
	   
		//driver.findElement(By.id("login-button")).click();
	}

	@Then("user navigate the homepage")
	public void user_navigate_the_homepage() {
		
		driver.getPageSource().contains("Products");
		driver.close();
		driver.quit();
	    
	}
	
	
}
