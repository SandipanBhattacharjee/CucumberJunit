package cucumberSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.DemoQaSteps;

public class DemoQA_GlueCode {
	
	DemoQaSteps steps=new DemoQaSteps();
	
	@Given("^I am able to launch the demoQa site$")
	public void i_am_able_to_launch_the_demoQa_site() throws Throwable {
		steps.validate_demoQAIsCorrectlyLaunched();
	}

	@When("^I click on the registration button$")
	public void i_click_on_the_registration_button() throws Throwable {
       steps.validate_ClickOnRegisterButton();
	}

	@When("^fill in the demoQa registration form$")
	public void fill_in_the_demoQa_registration_form() throws Throwable {
		System.out.println("when");
	}

	@Then("^I should be able to submit the form$")
	public void i_should_be_able_to_submit_the_form() throws Throwable {
		System.out.println("then");
	}
}
