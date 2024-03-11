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
@backgroundorange
Feature: control orange home page functionality

  Background: the use is logged in
    Given bck the user navigated the login page
    When bck user enter username and password on the login page
    Then bck user navigate home page

  Scenario: Title of your scenario outline
    When bck the user click arrow on the right top
    Then bck the user will see the logout option

  
