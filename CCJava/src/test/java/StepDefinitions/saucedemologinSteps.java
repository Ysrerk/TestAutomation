package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class saucedemologinSteps {
	WebDriver driver=null;
	public void createwebdriver() {
		
		String pth=System.getProperty("user.dir");
		System.out.println(pth);
		
		
		System.setProperty("Webdriver.chrome.driver", pth+"/src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@Given("browse  saucedemo loginpage")
	public void browse_saucedemo_loginpage() {
		createwebdriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
	    
	}

	@And("enter username and password")
	public void enter_username_and_password() {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	   
	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.id("login-button")).click();
	   
	}

	@Then("navigate homepage")
	public void navigate_homepage() {
		
		driver.getPageSource().contains("Products");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		driver.quit();
	   
	}




}
