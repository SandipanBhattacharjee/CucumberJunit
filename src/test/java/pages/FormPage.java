package pages;

import java.util.List;

import org.apache.batik.ext.awt.image.SVGComposite.DarkenCompositeContext_INT_PACK;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPage extends BasePage {

	@FindBy(id="name_3_firstname")
	WebElement firstName;

	@FindBy(id="name_3_lastname")
	WebElement lastName;

	@FindBy(name="pie_submit")
	WebElement submitButton;

	@FindBy(xpath=".//input[@value='reading']")
	WebElement readingCheckBox;
	
	@FindBy(xpath=".//input[@value='dance']")
	WebElement danceCheckBox;
	
	@FindBy(xpath=".//input[@value='cricket ']")
	WebElement cricketCheckBox;

	@FindBy(id="dropdown_7")
	WebElement countryDropDown;

	@FindBy(id="phone_9")
	WebElement phone;

	@FindBy(id="username")
	WebElement userNameTextBox;

	@FindBy(id="email_1")
	WebElement emailTexBox;

	@FindBy(id="password_2")
	WebElement passwordTextBox; 

	@FindBy(id="confirm_password_password_2")
	WebElement confirmPassword;
	
	@FindBy(xpath="//*[@id='pie_register']/li[8]/div/div/span")
	WebElement emailErrorMessege;


	public FormPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void formPage_validateCorrectTitle(String title){
		Assert.assertTrue(title.equals(driver.getTitle()));
	}

	public void formPage_fillInForm(List<String> formValue){
		fillDataInTextField(firstName,formValue.get(0));
		fillDataInTextField(lastName, formValue.get(1));
		
		driver.findElement(By.xpath("//input[@value='"+formValue.get(2) +"']")).click();  //maritial status radio button 
		
		if(formValue.get(3).equals("reading")){
			processCheckBox(readingCheckBox);
		}else if(formValue.get(3).equals("dancing")){  //hobby check box processing
			processCheckBox(danceCheckBox);
		}else{
			processCheckBox(cricketCheckBox);
		}
		
		readingCheckBox.click();
		
		Select country=new Select(countryDropDown);
		fillSelect(country, formValue.get(4));
		
		fillDataInTextField(phone,formValue.get(5));
		fillDataInTextField(userNameTextBox,formValue.get(6));
		fillDataInTextField(passwordTextBox,formValue.get(7));
		fillDataInTextField(confirmPassword,formValue.get(8));
	}

	public void clickOnSubmit(){
		submitButton.submit();	
	}
	 
	public void confirmPresenceOfErrorMessage(String expectedErrorMessege){
		Assert.assertTrue(expectedErrorMessege.equals(emailErrorMessege.getText()));
	}
	
	private void fillDataInTextField(WebElement element,String textToFill){
		element.clear();
		element.sendKeys(textToFill);
	}
	
	private void fillSelect(Select dropdown,String valueToSelect){
		dropdown.selectByValue(valueToSelect);
	}
	
	private void processCheckBox(WebElement checkBoxToCheck){
		checkboxPrecondition();
		checkBoxToCheck.click();
	}
	
	private void checkboxPrecondition(){
		uncheckCheckBox(danceCheckBox);
		uncheckCheckBox(cricketCheckBox);
		uncheckCheckBox(readingCheckBox);
	}
	
	private void uncheckCheckBox(WebElement checkbox){
		if(checkbox.isSelected()){
			checkbox.click();
		}
	}
}

