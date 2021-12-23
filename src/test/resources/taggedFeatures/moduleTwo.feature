@PhaseTwo

Feature: CRM Tasks Feature

@RegressionTest
Scenario: Create Tasks
Given User is loggedIn
When User create a new Tasks

@SmokeTest
Scenario: View Tasks
Given User is loggedIn
When User view Tasks details

Scenario: Upate contact 
Given User is loggedIn 
When User update a Tasks detail
