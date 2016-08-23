package steps;

import pages.DemoQaHomePage;
import pages.FormPage;

public class DemoQaSteps {
	DemoQaHomePage demoQAHomePage=new DemoQaHomePage();
	FormPage formPage=new FormPage();
	
	public void validate_demoQAIsCorrectlyLaunched(){
		demoQAHomePage.launchPage();
		demoQAHomePage.validateTitleIsCorrect();
		
	}
	
	public void validate_ClickOnRegisterButtonAndFillInForm(){
		demoQAHomePage.clickOnRegisterButton();
		
	}

}
