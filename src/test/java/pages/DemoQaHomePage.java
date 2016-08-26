package pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaHomePage extends BasePage{
	
	

	public DemoQaHomePage() {
		super();
		System.out.println("driver instance"+driver);
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//li[@id='menu-item-374']/a")
	WebElement registrationButton;
	
	
	public void demQA_HomePage_launchPage() {
		driver.get("http://demoqa.com");	
	}

	public void demoQA_HomePage_validateTitleIsCorrect(String expected_title) {
		System.out.println("expected"+expected_title);
		Assert.assertTrue(expected_title.equals(driver.getTitle()));
	}

	public void demoQA_clickOnRegisterButton() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		registrationButton.click();		
	}
}
