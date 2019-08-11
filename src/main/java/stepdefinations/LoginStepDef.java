package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.BaseUtil;

public class LoginStepDef extends BaseUtil {
	
	private BaseUtil base;
	
	public LoginStepDef(BaseUtil base){
		this.base=base;
	}
	
	
	@Given("^User is on Loginpage$")
	public void user_is_on_Loginpage() throws Throwable {
		System.out.println("user_is_on_Loginpage");
	    System.out.println(base.browser+"------>LoginStepDef page");	
	}

	@When("^User should click SignIn link$")
	public void user_should_click_SignIn_link() throws Throwable {
		System.out.println("user_should_click_SignIn_link");
	}

	@Then("^User should see login page$")
	public void user_should_see_login_page() throws Throwable {
		System.out.println("user_should_see_login_page");
	}

	@When("^User enter credentails$")
	public void user_enter_credentails() throws Throwable {
		System.out.println("user_enter_credentails");	}
	
	@When("^User enter wrong credentails$")
	public void user_enter_wrong_credentails() throws Throwable {
	   System.out.println("user_enter_wrong_credentails");
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
		System.out.println("user_click_login_button");
 	}

	@Then("^User is on Homepage$")
	public void user_is_on_Homepage() throws Throwable {
    System.out.println("user_is_on_Homepage");
	}


	
}
