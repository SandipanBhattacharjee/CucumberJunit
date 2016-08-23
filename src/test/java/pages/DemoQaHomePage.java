package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaHomePage extends BasePage{
	@FindBy(xpath="//li[@id='menu-item-374']/a")
	WebElement registrationButton;

	public DemoQaHomePage() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void demQA_HomePage_launchPage() {
		driver.get("http://demoqa.com");	
	}

	public void demoQA_HomePage_validateTitleIsCorrect(String title) {
		System.out.println(driver.getTitle());
		Assert.assertFalse(title.equals(driver.getTitle()));
		System.out.println("exiting assert");
	}

	public void demoQA_clickOnRegisterButton() {
		System.out.println("entering registration butoon");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		registrationButton.click();		
	}
}
