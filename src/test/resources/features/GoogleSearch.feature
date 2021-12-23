Feature: GoogleSearch

Scenario: Java Tutorial Search
Given User is on Google Page
When User Search Java Tutorial
Then Should display Java Result Page
And close the browser

Scenario: Selenium Tutorial Search
Given User is on Google Page
When User Search selenium Tutorial
Then Should display selenium Result Page
And close the browser