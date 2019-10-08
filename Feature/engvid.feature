Feature: Functionality of the English Engvid p
@TestingInvalid
Scenario: Testing Some Button On  Engvid WebPage 
Given User alredy on Engvid WebPpage 
When User entering invalid username 
And user entering invalid password
And it have to display error message on screen 
Then it have to stay on login page after run


@NullLogin
Scenario: To Test login with blank credentials

Given User alredy on login page 
When user enter blank user 
And user enter blank password
And it has to displayan error message 
Then user has to stay on login page


@ValidationLogin
Scenario Outline: Testing Login functionality with valid credentials
Given user on login page 
When User enter a valid email as a "<username>" 
And user enter valid password as a "<password>"
Then User login succefully
Examples:
|username||password|
|JNHUN||asderfgty|
