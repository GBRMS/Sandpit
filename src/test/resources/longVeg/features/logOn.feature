@run
Feature: Log on

  As a user of the system
  I want to be able to log onto the system
  So that I can use the system to help with my my day to day tasks

  Scenario: Valid user
    Given The system is available for use
    When I enter my valid user name and password
    Then The system should authenticate
    And display the relevant home page

  Scenario: Invalid user
    Given The system is available for use
    When An invalid user name and password is entered
    Then The system should not authenticate the user
    And display an error message
    And allow the user to re-enter the credentials