package Quality_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Quality_Utility.Quality_Base;

public class Quality_SignUpPageLocator extends Quality_Base {

	public Quality_SignUpPageLocator () {
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id =  "sign-username")
	public WebElement Q_UserName;
	
	@FindBy(id =  "sign-password")
	public WebElement Q_Password;
	
	@FindBy(xpath =  "//button[text()='Sign up']")
	public WebElement Q_SignUpButton;

	
}
