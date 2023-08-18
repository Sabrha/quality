package Quality_StepDeff;


import Quality_Page_Actions.Quality_CartPageActions;
import Quality_Page_Actions.Quality_HomePageActions;
import Quality_Page_Actions.Quality_ProductPageActions;
import Quality_Utility.Quality_Base;
import cucumber.api.java.en.Then;

public class CartSprint2 extends Quality_Base{
	Quality_CartPageActions quality_CartPageActions = new Quality_CartPageActions();
	Quality_HomePageActions quality_HomePageActions = new Quality_HomePageActions();
	Quality_ProductPageActions quality_ProductPageActions = new Quality_ProductPageActions();
	
	@Then("^Click Samsung GalaxyS(\\d+)$")
	public void click_Samsung_GalaxyS(int arg1) throws Throwable {
		quality_HomePageActions.ClickSamsungGalaxyS6(); 
	}

	@Then("^Click add to cart$")
	public void click_add_to_cart() throws Throwable {
		quality_ProductPageActions.Clickaddtocart();
	}

	@Then("^Click cart link$")
	public void click_cart_link() throws Throwable {
		quality_ProductPageActions.Clickcartlink();
	}

	@Then("^Verify user can add item in cart$")
	public void verify_user_can_add_item_in_cart() throws Throwable {
		quality_CartPageActions.Verifyusercanadditemincart();
	}



}
