package stepdefinations;

import cucumber.api.java.en.Given;

public class Background {

	
	@Given("^user make browser cache clear$")
	public void user_make_browser_cache_clear() { 
		System.out.println("Background");
	}
	
}
