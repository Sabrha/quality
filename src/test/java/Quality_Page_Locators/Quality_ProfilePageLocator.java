package Quality_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Quality_Utility.Quality_Base;

public class Quality_ProfilePageLocator extends Quality_Base{
	 
	public Quality_ProfilePageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id =  "nameofuser")
	public WebElement ProfileVerification;
		
}

