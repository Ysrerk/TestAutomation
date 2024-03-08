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
@saucePFHook
Feature: Hook fauture sauce

  Scenario Outline: Hook fauture sauce
    Given hook user navigate the sauce login
    When hook user enter <username> and <password> in login
    And hook user clik login
    Then hook user navigate homepage

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | visual_user   | secret_sauce |
