package Quality_Page_Actions;

import Quality_Page_Locators.Quality_ProductPageLocator;
import Quality_Utility.Quality_Base;

public class Quality_ProductPageActions extends Quality_Base{
	Quality_ProductPageLocator quality_ProductPageLocator = new Quality_ProductPageLocator();	
	
	public void Clickaddtocart() {
		quality_ProductPageLocator.Q_AddToCartButton.click();
	}
	
	public void Clickcartlink() throws Exception {
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		quality_ProductPageLocator.Q_CartLink.click();
		
	}
}
