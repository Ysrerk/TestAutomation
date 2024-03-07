package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.SauceLogin;
import io.cucumber.java.en.*;

public class sauceloginwithparemetricPOM {
	/*
	WebDriver driver=null;
	SauceLogin loginsauce;
	
	public void createdriver() {
		String pth=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", pth+"/src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
	@Given("browse login page")
	public void browse_login_page() {
		createdriver();
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println("POM OLAN CALISTI");
	   
	}

	@And("^when user type (.*) and (.*)$")
	public void when_user_type_standard_user_and_secret_sauce(String username,String password) {
		loginsauce=new SauceLogin(driver);
		loginsauce.enterusername(username);
		loginsauce.enterpassword(password);
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
		
		
		loginsauce.clickloginbutton();
	   
		//driver.findElement(By.id("login-button")).click();
	}

	@Then("user navigate the homepage")
	public void user_navigate_the_homepage() {
		
		driver.getPageSource().contains("Products");
		driver.close();
		driver.quit();
	    
	}
	
	*/
}
