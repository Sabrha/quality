package Quality_Page_Actions;

//import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Actions;

import Quality_Page_Locators.Quality_HomePageLocator;
import Quality_Utility.Quality_Base;

public class Quality_HomePageActions extends Quality_Base {
	
	Quality_HomePageLocator quality_HomePageLocator  = new Quality_HomePageLocator ();
	
	public void Clicksignuplink() {
		quality_HomePageLocator.SignUpLink.click();
	
	}
	
	public void  ClickLoginlink () {
		quality_HomePageLocator.Q_LoginLink.click();
		
	}
	
	 public void  ClickSamsungGalaxyS6() {
		 quality_HomePageLocator.Q_Samsung6Phone.click();
	 }
	
}
