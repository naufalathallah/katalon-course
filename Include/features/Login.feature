#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login
Feature: Login
  I want to login to heroku

  @login-module
  Scenario Outline: As a user, i can test login page
    Given I am on the login page
    When I fill "<uname>" and "<password>"
    And I click login button
    Then I verify the "<status>" login
    And I close the browser

    Examples: 
      | uname  		| password 													| status  |
      | tomsmith 	| T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI 	| success |
      | tomsmith2 | T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI2 | Fail    |