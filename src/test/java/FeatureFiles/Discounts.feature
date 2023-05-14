

Feature: Discounts Functionality Add - Edit -Delete

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario:Create Add Discounts
    Given Navigate to Discount page
    When create add discount
    Then Success message should be displayed


  Scenario:Create Add Discounts Negatif
    Given Navigate to Discount page
    When create add discount
    Then negative message should be displayed


  Scenario:Create Edit Discounts
    Given Navigate to Discount page
    When create edit discount
    Then Success message should be displayed


  Scenario:Create Delete Discounts
    Given Navigate to Discount page
    When create delete discount
    Then Success message should be displayed