package Quality_Page_Actions;

import Quality_Page_Locators.Quality_CreateAccountPageLocator;
import Quality_Utility.Quality_Base;

public class Quality_CreateAccountPageActions extends Quality_Base {
	Quality_CreateAccountPageLocator quality_CreateAccountPageLocator = new Quality_CreateAccountPageLocator();	
	
	public void EnterFirstNameLastName() {
		quality_CreateAccountPageLocator.FirstName.sendKeys("Tomas");	
		quality_CreateAccountPageLocator.LastName.sendKeys("Sandy");
	}
	
	public void Enteremailaddress () {
		quality_CreateAccountPageLocator.EmailAddress.sendKeys("tomas@test.com");
		
	}
	public void EnterPassword() {
		quality_CreateAccountPageLocator.PassWordField.sendKeys("Tomas12345");
		
	}
	public void Clickcreateaccountbutton () {
		quality_CreateAccountPageLocator.CreateAccountButton.click();
	}
}
