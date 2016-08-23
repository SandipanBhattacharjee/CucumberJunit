package steps;

import pages.DemoQaHomePage;
import pages.FormPage;

public class DemoQaSteps {
	DemoQaHomePage demoQAHomePage=new DemoQaHomePage();
	FormPage formPage=new FormPage();
	
	public void validate_demoQAIsCorrectlyLaunched(){
		String title="test";
		demoQAHomePage.demQA_HomePage_launchPage();
		demoQAHomePage.demoQA_HomePage_validateTitleIsCorrect(title);
		
	}
	
	public void validate_ClickOnRegisterButton(){
		demoQAHomePage.demoQA_clickOnRegisterButton();
		
	}
    
	public void validate_CorrectNavigationToFormPage_and_FillInForm(){
		String title="test";
		formPage.formPage_validateCorrectTitle(title);
		formPage.formPage_fillInForm();
	}
}
