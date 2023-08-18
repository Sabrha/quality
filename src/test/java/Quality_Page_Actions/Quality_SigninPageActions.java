package Quality_Page_Actions;

import Quality_Page_Locators.Quality_SigninPageLocator;
import Quality_Utility.Quality_Base;

public class Quality_SigninPageActions extends Quality_Base{

	Quality_SigninPageLocator quality_SigninPageLocator = new Quality_SigninPageLocator();
	
	public void Quality_UserCard(String u, String P) {
		
		quality_SigninPageLocator.Q_UserName.sendKeys(u);
		quality_SigninPageLocator.Password.sendKeys(P);
		quality_SigninPageLocator.Signinbutton2.click();
		
	}
	
}
