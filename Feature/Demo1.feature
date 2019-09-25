Feature: login feature

Scenario: User enters Username and Password
Given the login page is opened
When user enters lalitha as user name
And user enters password123 as password
Then user will find TestMeApp homepage
And user clicks on SignOut to exit from the app