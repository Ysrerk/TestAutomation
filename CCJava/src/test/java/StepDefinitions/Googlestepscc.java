package StepDefinitions;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Googlestepscc {
	
	//private static final String APjFqb = null;
	WebDriver driver =null;
	//WebDriver driver2=null;
	/*
	public void sdriver() {
	String pth=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", pth+"/src/test/resources/driver/chromedriver.exe");
	driver=new ChromeDriver();
		
	}
	*/
	
	public void setDriver() {
		String syspath=System.getProperty("user.dir");
		System.out.println("yasar"+syspath);
		System.setProperty("webdriver.chrome.driver", syspath+"/src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		int timeoutSeconds=30;
		driver.manage().timeouts().implicitlyWait(timeoutSeconds, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	
	@Given("user open browser")
	public void user_open_browser() {
	   System.out.println("user opened the broeser");
	   //setDriver();
	   setDriver();
	   
	    
	}

	@And("see the google search bar")
	public void see_the_google_search_bar() {
		System.out.println("user saw the search bar");
		driver.navigate().to("https://www.google.com/");
	
	   
	}

	@When("enter the search text")
	public void enter_the_search_text() {
		System.out.println("user entered the something");
		driver.findElement(By.id("APjFqb")).sendKeys("yasar");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	}

	@And("click the enter")
	public void click_the_enter() {
		System.out.println("uclicked");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	  
	}

	@Then("navigate the search result")
	public void navigate_the_search_result() {
		System.out.println("result page");
		driver.getPageSource().contains("Yasar Corporation");
		driver.close();
		driver.quit();
		
	}
}
