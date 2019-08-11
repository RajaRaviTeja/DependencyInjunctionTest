Feature: DependencyInjusctionTest
Background: Browser should be ready
Given user make browser cache clear

@Regression
Scenario: Validate the erro login page
Given User is on Loginpage
When User should click SignIn link
Then User should see login page
When User enter wrong credentails
And User click login button
Then User is on Homepage



@Smoke
Scenario: Validate the login page
Given User is on Loginpage
When User should click SignIn link
Then User should see login page
When User enter credentails
And User click login button
Then User is on Homepage
 