package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage extends BasePage {
	
	@FindBy(id="name_3_firstname")
	WebElement firstName;
	
	public FormPage() {
		super();
		PageFactory.initElements(driver, this);
	}
    
	public void formPage_validateCorrectTitle(String title){
		Assert.assertFalse(title.equals(driver.getTitle()));
	}
	
	public void formPage_fillInForm(){
		firstName.sendKeys("Sandy");
	}
	
	public void clickOnSubmit(){
		
	}
}
