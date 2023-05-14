


Feature: Add-Edit-Delete Add Document Types under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: I should be able to Add Document Types under Parameters Setup
    Given I navigate Document Type
    When I click on Add Ducument Type
    And  I fill new Document Type
    And  I click on right Save button
    Then I verify name is added Document Types under Parameters Setup


  Scenario: I should be able to Edit Document Types under Parameters Setup
    Given I navigate Document Type
    And  I enter added new Document Type
    And I click on right Search button
    And I click on Edit button to edit
    And I click on right Save button again
    Then I verify name is edited Document Types under Parameters Setup


  Scenario: I should be able to Delete Document Types under Parameters Setup
    Given I navigate Document Type
    And  I enter name of Ducument for delete
    And I click on the Search button for delete
    And I click on Delete button on the right
    And  I click on Delete buttonn
    Then I verify name is deleted Document Types under Parameters Setup