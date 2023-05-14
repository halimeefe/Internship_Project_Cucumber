

Feature: Add-Edit-Delete functionalities Subject Categories under Education Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: I should be able to Add Subject Categories under Education Setup
    Given I navigate to Subject Categories
    When I click on Add button
    And  I fill in the name and code fields
    And  I click on Save button
    Then I verify name is added Subject Categories list


  Scenario: I can’t Add Subject Categories under Education Setup with current name
    Given I navigate to Subject Categories
    When I click on Add button
    And I fill in the name and code fields with exist a name,code
    And  I click on Save button
    Then I verify that the name is not added to the list of Subject Categories


  Scenario: I should be able to Edit Subject Categories under Education Setup
    Given I navigate to Subject Categories
    And  I fill in the general name and code fields
    And I click on the Search button
    And I click on Edit button
    And  I fill in the name and code fields
    And  I click on Save button
    Then I verify name is edited Subject Categories list


  Scenario: I can’t Delete Subject Categories under Education Setup without opening the Delete window
    Given I navigate to Subject Categories
    And  I fill in the general name and code fields
    And I click on the Search button
    And I click on Delete button
    And I click on Cancel button
    Then I verify name is not deleted on Subject Categories list


  Scenario: I should be able to Delete Subject Categories under Education Setup
    Given I navigate to Subject Categories
    And  I fill in the general name and code fields
    And I click on the Search button
    And I click on Delete button
    And I click on Delete button again
    Then I verify name is deleted Subject Categories list

