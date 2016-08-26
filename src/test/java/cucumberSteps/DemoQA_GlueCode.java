package cucumberSteps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.DemoQaSteps;

public class DemoQA_GlueCode {
	
	DemoQaSteps steps=new DemoQaSteps();
	
	@Given("^I am able to launch the demoQa site with title:$")
	public void i_am_able_to_launch_the_demoQa_site(DataTable title) throws Throwable {
		List<List<String>> expectedTitle=title.raw();
		String expectedTitle_String=expectedTitle.get(1).get(0);
		steps.validate_demoQAIsCorrectlyLaunched(expectedTitle_String);
	}

	@When("^I click on the registration button I get a page with title:$")
	public void i_click_on_the_registration_button(DataTable formPageTitle) throws Throwable {
		List<List<String>> expectedTitle=formPageTitle.raw();
		String expectedTitle_String=expectedTitle.get(1).get(0);
       steps.validate_ClickOnRegisterButton(expectedTitle_String);
	}

	@When("^fill in the demoQa registration form with:$")
	public void fill_in_the_demoQa_registration_form(DataTable formPageFields) throws Throwable {
		List<List<String>> formFields=formPageFields.raw();
		for(int i=1;i<=formFields.size();i++){
		steps.validate_CorrectNavigationToFormPage_and_FillInForm(formFields.get(i));
	  }
	}

	@Then("^I on clicking submit I should get email error messege:$")
	public void i_should_be_able_to_submit_the_form(DataTable errorMessege) throws Throwable {
		List<List<String>> expectedTitle=errorMessege.raw();
		String expected_errorMsg=expectedTitle.get(1).get(0);
		steps.submitFormAndCheckError(expected_errorMsg);
	}
}
