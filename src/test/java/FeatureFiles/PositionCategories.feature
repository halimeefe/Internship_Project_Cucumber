
Feature: Add-Edit-Delete functionalities Position Categories Under Human Resources Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: I should be able to Add Position Categories Under Human Resources Setup
    Given I navigate to Position page
    When I click on Add button
    And I fill in the name field
    And I click on Save button
    Then I verify name is added Positions list


  Scenario: I can’t Add Position Categories Under Human Resources Setup with current name
    Given I navigate to Position page
    When I click on Add button
    And I fill in the name field with exist a name
    And I click on Save button
    Then I verify that the name is not added to the list of Positions


  Scenario: I should be able to Edit Position Categories Under Human Resources Setup
    Given I navigate to Position page
    When I fill in the general name field
    And I click on the Search button
    And I click on Edit button
    And I fill in the name field
    And I click on Save button
    Then I verify name is edited Positions list


  Scenario: I can’t Delete Position Categories under Human Resources Setup without opening the Delete window
    Given I navigate to Position page
    When I fill in the general name field
    And I click on the Search button
    And I click on Delete button
    And I click on Cancel button
    Then I verify name is not deleted on Position Categories list


  Scenario:  I should be able to Delete Position Categories Under Human Resources Setup
    Given I navigate to Position page
    When I fill in the general name field
    And I click on the Search button
    And I click on Delete button
    And I click on Delete button again
    Then I verify name is deleted Position Categories list