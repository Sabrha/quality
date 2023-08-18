package Quality_Page_Actions;

import org.testng.Assert;

import Quality_Page_Locators.Quality_ProfilePageLocator;
import Quality_Utility.Quality_Base;
import Quality_Utility.Quality_Utility;

public class Quality_ProfilePageActions extends Quality_Base{
	
	Quality_ProfilePageLocator quality_ProfilePageLocator = new Quality_ProfilePageLocator();
	
	public void Verifyusercanloginwithvalidcredential() throws Exception {
		
		
		Thread.sleep(5000);
		boolean VerifyLoginProfile = quality_ProfilePageLocator.ProfileVerification.isDisplayed();
		Assert.assertTrue(VerifyLoginProfile);
		Thread.sleep(5000);
		
		Quality_Utility.takeMyScreenshot(driver, "Profile Page");
	}

}
