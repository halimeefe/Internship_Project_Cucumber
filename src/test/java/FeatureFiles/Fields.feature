

Feature: Add-Edit-Delete Fields under Parameters Setup

  Background:
    Given  Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario:As an Admin User I should be able to creating a new field
    Given  Navigate to Fields Page
    And add field
    Then success message


  Scenario:As Admin User I have to Edit registered field information
    Given Navigate to Fields Page
    And search registered information
    And click edit button
    Then success message


  Scenario: As Admin User I have to delete Fields
    Given Navigate to Fields Page
    And Search registered name
    And Click delete button
    Then success message