Feature: Login page automation of automation exercise


Scenario Outline: Check login in successful with valid credintials

Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on Login button
Then User should navigate to homepage
And Close the browser

Examples:
|	username	| password	|
| officialpmk01@gmail.com	| Pass@1234	|

Scenario Outline: Verify user is not able to login with invalid credentials

Given User is on login page
When User enters invalid "<username>" and "<password>"
And Clicks on Login button
Then Error message displayed correctly
And Close the browser

Examples:
|	username	| password	|
| somerandommail@gmail.com	| Pass@1234	|
| officialpmk01@gmail.com	| wrongPassword@1234	|