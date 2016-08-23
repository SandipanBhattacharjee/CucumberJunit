package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	static WebDriver driver;
	
	public BasePage(){
		System.out.println("Base page constructor");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}

	public WebDriver getDriver(){
		return driver;
	}
}
