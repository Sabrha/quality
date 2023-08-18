package Quality_Page_Actions;

import Quality_Page_Locators.Quality_SignUpPageLocator;
import Quality_TestData.Quality_TestData;
//import Quality_Utility.Quality_Base;

public class Quality_SignUpPageActions extends Quality_ProductPageActions{
	Quality_SignUpPageLocator quality_SignUpPageLocator = new Quality_SignUpPageLocator();
	
	public void EnterUsernameandPassword() throws Exception {
		
		Thread.sleep(3000);
		quality_SignUpPageLocator.Q_UserName.sendKeys(Quality_TestData.User5);
		Thread.sleep(3000);
		quality_SignUpPageLocator.Q_Password.sendKeys(Quality_TestData.Password5);
		
	}
	
	public void ClickSignupbutton() throws Exception {
		
		quality_SignUpPageLocator.Q_SignUpButton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}
}
