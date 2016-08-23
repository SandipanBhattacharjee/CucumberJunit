package pages;

import org.junit.Assert;

public class FormPage extends BasePage {
	
	public FormPage() {
		super();
	}
    
	public void formPage_validateCorrectTitle(String title){
		Assert.assertTrue(title.equals(driver.getTitle()));
	}
	
	public void fillInForm(){
		
	}
	
	public void clickOnSubmit(){
		
	}
}
