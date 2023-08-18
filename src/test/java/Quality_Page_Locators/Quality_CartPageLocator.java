package Quality_Page_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Quality_Utility.Quality_Base;

public class Quality_CartPageLocator extends Quality_Base{

	public Quality_CartPageLocator () {
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath =   "//td[text()='Samsung galaxy s6']")
	public WebElement CartVerify;
}
