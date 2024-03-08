package StepDefinitionsHook;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactoryHook.PageFactoryHk;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HookSauceloginwithparameter {
	WebDriver driver=null;
	PageFactoryHk pgHk;
	@Before
	public void createbrowser() {
		String pth=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", pth+"/src/test/resources/driver/chromedriver.exe");
		//driver=new ChromeDriver();
	}
	/*
	@After
	public void endbrowser() {
		driver.close();
		
	}
	*/
	
	
	
	@After
	public void endbrowser() {
	    if(driver != null) {
	        try {
	            driver.close();
	        } catch (NoSuchSessionException e) {
	            
	        }
	    }
	}

	
	@Given("hook user navigate the sauce login")
	public void hook_user_navigate_the_sauce_login() {
		createbrowser();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
	    
	}

	@When("^hook user enter (.*) and (.*) in login$")
	public void hook_user_enter_standard_user_and_secret_sauce_in_login(String username, String password) {
	   pgHk=new PageFactoryHk(driver);
	   pgHk.entertext(username, password);
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@And("hook user clik login")
	public void hook_user_clik_login() {
		
		pgHk.clickloginbutton();
	
	}
	   

	@Then("hook user navigate homepage")
	public void hook_user_navigate_homepage() {
		driver.getPageSource().contains("Products");
		endbrowser();
		
		
	  
	}
	
	



}
