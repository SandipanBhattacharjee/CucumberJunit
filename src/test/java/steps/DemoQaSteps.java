package steps;

import java.util.List;

import pages.DemoQaHomePage;
import pages.FormPage;

public class DemoQaSteps {
	DemoQaHomePage demoQAHomePage=new DemoQaHomePage();
	FormPage formPage=new FormPage();
	
	public void validate_demoQAIsCorrectlyLaunched(String expectedTitle){
		demoQAHomePage.demQA_HomePage_launchPage();
		demoQAHomePage.demoQA_HomePage_validateTitleIsCorrect(expectedTitle);		
	}
	
	public void validate_ClickOnRegisterButton(String expectedString){
		demoQAHomePage.demoQA_clickOnRegisterButton();
		formPage.formPage_validateCorrectTitle(expectedString);
		
	}
    
	public void validate_CorrectNavigationToFormPage_and_FillInForm(List<String> formValue){
		System.out.println(formValue);
		formPage.formPage_fillInForm(formValue);
	}
	
	public void submitFormAndCheckError(String expectedErrorMessage){
		formPage.clickOnSubmit();
		formPage.confirmPresenceOfErrorMessage(expectedErrorMessage);
	}
}
