package Quality_Page_Actions;

import org.testng.Assert;

import Quality_Page_Locators.Quality_CartPageLocator;
import Quality_Utility.Quality_Base;
import Quality_Utility.Quality_Utility;

public class Quality_CartPageActions extends Quality_Base {
	Quality_CartPageLocator quality_CartPageLocator = new Quality_CartPageLocator();
	
	public void Verifyusercanadditemincart () throws Exception {
		
		Thread.sleep(5000);
		boolean CartVerification = quality_CartPageLocator.CartVerify.isDisplayed();
		Assert.assertTrue(CartVerification);
		
		Quality_Utility.takeMyScreenshot(driver, "Cart Page");
	}
	
			 
		 
}
