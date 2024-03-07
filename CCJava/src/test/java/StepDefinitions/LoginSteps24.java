package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps24 {

	@Given("user is loggin page")
	public void user_is_loggin_page() {
		// Write code here that turns the phrase above into concrete actions
			System.out.println("inside step user in login page");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user enter user name and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user click button");
	}

	@Then("user is navigated home page")
	public void user_is_navigated_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user navigated home page");
	}


}
