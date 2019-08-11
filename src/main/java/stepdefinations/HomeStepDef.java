package stepdefinations;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStepDef {
	@Then("^User should see username$")
	public void user_should_see_username() {System.out.println("user_should_see_username");}

	@Then("^user should see today date$")
	public void user_should_see_today_date() {System.out.println("user_should_see_today_date");}
	
	@When("^User select account$")
	public void user_select_account(){
		System.out.println("user_select_account");}

	@When("^User click go button$")
	public void user_click_go_button(){
		System.out.println("user_click_go_button");}

	@Then("^User should see account details$")
	public void user_should_see_account_details(){
		System.out.println("user_should_see_account_details");}

	@When("^User did not select account$")
	public void user_did_not_select_account() {
		System.out.println("user_did_not_select_account");}


}
