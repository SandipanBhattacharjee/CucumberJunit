package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	static WebDriver driver;

	public BasePage(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//drivers//chromedriver.exe");
		//driver=new FirefoxDriver();
		if(driver==null){
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
}
