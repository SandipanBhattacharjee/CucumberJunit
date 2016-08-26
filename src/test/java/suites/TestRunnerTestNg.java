package suites;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.AfterSuite;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.BasePage;


//@RunWith(Cucumber.class)
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport="target/cucumber.json",
detailedReport=true,
jsonUsageReport="target/cucumber-usage.json",
usageReport = true,
toPDF = true,
outputFolder = "target")

@CucumberOptions(plugin={"html:target/cucumber-html-report",
		"json:target/cucumber.json",
		"pretty:target/cucumber-pretty.txt",
		"usage:target/cucumber-usage.json", 
"junit:target/cucumber-results.xml" },
features="src/test/resources/features/demoqa", 
glue={"cucumberSteps"})
public class TestRunnerTestNg extends ExtendedTestNGRunner{


	@AfterSuite
	public static void tearDown(){
		int counter=0;
		//just want the webdriver instance to wait for some time before closing
		while(counter<10){
			BasePage.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			System.out.println(counter);
			counter++;
		}
		BasePage.getDriver().quit();		
	}

}
