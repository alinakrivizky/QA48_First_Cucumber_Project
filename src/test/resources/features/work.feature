
Feature: LetCarWork
  @CarData
  Scenario: Let Car work with valid data
Given User launches Chrome browser
When User opens ilCarro HomePage
And User clicks on login link
And User enters valid data
And User clicks on <Yalla> button
And User verifies Success message is displayed
And User closes Success message
And User clicks on Let car work link
And User enters all types of data
Then User clicks on Submit button