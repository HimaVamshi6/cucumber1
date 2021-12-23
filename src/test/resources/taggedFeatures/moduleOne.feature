@PhaseOne
Feature: CRM Contact & Deal Feature

Background: User Login
Given User is loggedIn

@RegressionTest
Scenario: Create Contact
Given User is loggedIn
When User create a new contact

@SmokeTest
Scenario: View contact
Given User is loggedIn
When User view contact details

Scenario: Upate contact 
Given User is loggedIn 
When User update a contact detail

@RegressionTest
Scenario: Create Deal
Given User is loggedIn
When User create a new Deal

@RegressionTest  @SmokeTest
Scenario: View Deal
Given User is loggedIn
When User view Deal details

@SmokeTest
Scenario: Upate Deal 
Given User is loggedIn 
When User update a Deal detail

Scenario: Logout 
When User logout from app
