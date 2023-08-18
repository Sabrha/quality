package Quality_StepDeff;

import Quality_Page_Actions.Quality_HomePageActions;
import Quality_Page_Actions.Quality_ProfilePageActions;
import Quality_Page_Actions.Quality_SignUpPageActions;
import Quality_Page_Actions.Quality_SigninPageActions;
import Quality_Utility.Quality_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSprint1 extends Quality_Base{
	private static final String URL = null;
	Quality_HomePageActions quality_HomePageActions = new Quality_HomePageActions();
	Quality_SignUpPageActions quality_SignUpPageActions = new Quality_SignUpPageActions();
	Quality_ProfilePageActions quality_ProfilePageActions = new Quality_ProfilePageActions();
	Quality_SigninPageActions quality_SigninPageActions = new Quality_SigninPageActions();
	
    
	@Given("^Open \"([^\"]*)\"  application$")
	public void open_application(String arg1) throws Throwable {
		QualityLaunchingURL(URL);		
	
	}

	@Then("^Click signup link$")
	public void click_signup_link() throws Throwable {
		quality_HomePageActions.Clicksignuplink();
	}

	@Then("^Enter Username and Password$")
	public void enter_Username_and_Password() throws Throwable {
		quality_SignUpPageActions.EnterUsernameandPassword();
	}

	@Then("^Click Signup button$")
	public void click_Signup_button() throws Throwable {
		quality_SignUpPageActions.ClickSignupbutton(); 
	}

	@Then("^Click Login link$")
	public void click_Login_link() throws Throwable {
		quality_HomePageActions.ClickLoginlink();
	}
	@Then("^Enter Username Password$")
	public void enter_Username_Password() throws Throwable {
		quality_SigninPageActions.Quality_UserCard(QPro.getProperty("QUserName1"), QPro.getProperty("QPassword1") );
	}

	@Then("^Verify user can login with valid credential$")
	public void verify_user_can_login_with_valid_credential() throws Throwable {
		quality_ProfilePageActions.Verifyusercanloginwithvalidcredential();
	}


}
