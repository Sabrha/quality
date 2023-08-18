package Quality_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Quality_Utility.Quality_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Quality_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Quality_StepDeff", tags = {"@Jahan1"})

public class Quality_TestRunner extends AbstractTestNGCucumberTests {

	
	@BeforeTest
	public void QualityStartURL() {
		Quality_Base startURL = new Quality_Base();
		startURL.Quality_Browser();
	}
		@AfterTest
		public void QualityCloseURL() {
			Quality_Base startURL = new Quality_Base();
			startURL.driver.quit();
				
			
		}
	}
	

