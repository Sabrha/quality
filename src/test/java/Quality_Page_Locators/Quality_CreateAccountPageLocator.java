package Quality_Page_Locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Quality_Utility.Quality_Base;


public class Quality_CreateAccountPageLocator extends Quality_Base {
	
		public Quality_CreateAccountPageLocator () {
			PageFactory.initElements(driver, this);
			
			
		}
		@FindBy(id =  "FirstName")
		public WebElement FirstName;
		
		@FindBy(id =  "LastName")
		public WebElement LastName;
		
		@FindBy(id =  "EmailAddress")
		public WebElement EmailAddress;
		
		@FindBy(name =  "userPwd_UserInputSecret")
		public WebElement PassWordField;
		
		@FindBy(id =   "btnCreateAccount")
		public WebElement CreateAccountButton;
}
