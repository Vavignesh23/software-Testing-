Feature: To validate login functionality of facebook application

Background:
Given To launch the chromebrowser and maximize window

Scenario: To validate login  with valid username and  invalid password  
When To launch the url of the facebook application
And To pass the valid usermname in email field
And To pass invalid password  in password field
And To click the login button 
And To check whether navigate to the home page or not
Then To close thhe browser

Scenario Outline: To vaidate the positive and nagative combination of login functionality
When User has to hit the facebook url 
And  User has to pass the data "<emaildatas>" in email field
And  User has to pass the data "<passworddatas>" in password field
And  User has to click login button 
Then User has to close the browser

Examples:
|emaildatas|passworddatas|
|seleniuum@gmail.com|inmakes|
|nssnj@gmail.com|1234|
|bjhgsh@gmail.com|hhft23|