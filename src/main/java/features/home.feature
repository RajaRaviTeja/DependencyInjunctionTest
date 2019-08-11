Feature: DependencyInjusctionTest

Background: User naviagtes to Home page
Given user make browser cache clear
Given User is on Loginpage
When User should click SignIn link
Then User should see login page
And User click login button
Then User is on Homepage


#Given User launch site
#Then  User should entered un and pwd
#When User click login btn
#Then User should be on home page


@Regression
Scenario: Validate if user name is displayed
Then User should see username 
Then user should see today date
@Smoke
Scenario: Validate if user see account details
When User select account 
And User click go button
Then User should see account details
@Regression
Scenario: Validate if user see account details for negative flow
When User did not select account 
And User click go button
Then User should see account details


 
 