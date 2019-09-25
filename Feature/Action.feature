Feature: login Action Test

Scenario: Successful login with valid credentials
Given the login page is loaded
When user enters lalitha as user name and user enters password123 as password
When user click on login button
Then user will find TestMeApp homepage
