package pages;

import org.openqa.selenium.WebDriver;

public class DemoQaHomePage extends BasePage{

	//WebDriver driver;
	
	public DemoQaHomePage() {
		super();
		//driver=getDriver();
		System.out.println("demoqa home page constructor");
		driver.get("http://demoqa.com/");
	}
	
	public void getTitile(){
		System.out.println("title "+driver.getTitle());
	}

	public void launchPage() {
		// TODO Auto-generated method stub
		
	}

	public void validateTitleIsCorrect() {
		// TODO Auto-generated method stub
		
	}

	public void clickOnRegisterButton() {
		// TODO Auto-generated method stub
		
	}
}
