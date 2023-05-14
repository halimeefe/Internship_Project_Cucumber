
Feature: As an Admin User I should be able to Add-Edit-Delete Positions under Human Resources Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: I should be able to Add Positions Under Human Resources Setup

    Given I navigate to Positions page
    When I click on Add button on Positions
    And I fill in the name and short name fields on Positions
    And I click on Save button on Positions
    Then I verify name is added list on Position


  Scenario: I should be able to Edit Positions Under Human Resources Setup
    Given I navigate to Positions page
    When I fill in the general name field on Positions Page
    And I click on the Search button on Positions Page
    And I click on Edit button on Positions Page
    And I fill in the name and short name fields on Positions
    And I click on Save button on Positions
    Then I verify name is edited on Positions Page list


  Scenario:  I should be able to Delete Positions Under Human Resources Setup
    Given I navigate to Positions page
    When I fill in the general name field on Positions Page
    And I click on the Search button on Positions Page
    And I click on Delete button on Positions Page
    And I click on Delete button again on Positions Page
    Then I verify name is deleted on Positions Page list