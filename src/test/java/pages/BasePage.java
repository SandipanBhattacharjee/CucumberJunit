package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
   static WebDriver driver;
	
	public BasePage(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}

}
