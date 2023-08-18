package Quality_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Quality_Utility.Quality_Base;

public class Quality_HomePageLocator extends Quality_Base {
		
	public Quality_HomePageLocator () {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id =  "signin2")
	public WebElement SignUpLink;
	
	@FindBy(id =  "login2")
	public WebElement Q_LoginLink;
	
	@FindBy(xpath =   "//a[text()='Samsung galaxy s6']")
	public WebElement Q_Samsung6Phone;
	
}
