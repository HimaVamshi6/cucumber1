Feature: CRMLogin Feature

#Scenario: Valid Login
#Given User is on login page
#When User enters Login credentials
#Then User is on Home page

#Scenario: Valid Login
#Given User is on login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then User is on Home page

Scenario Outline: Valid Login
Given User is on login page
When User enters "<usename>" and "<password>"
Then User is on Home page

Examples:
	|username|password|
	|testuser1|welcome1|
	|testuser2|welcome2|
	|tomsmith|SuperSecretPassword!|