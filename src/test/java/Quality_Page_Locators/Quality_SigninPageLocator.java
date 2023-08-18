package Quality_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Quality_Utility.Quality_Base;

public class Quality_SigninPageLocator extends Quality_Base{

	public Quality_SigninPageLocator () {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id =   "loginusername")
	public WebElement Q_UserName;
	
	@FindBy(id =   "loginpassword")
	public WebElement Password;
	
	@FindBy(xpath =   "//button[text()='Log in']")
	public WebElement Signinbutton2;
	
	
}
		

