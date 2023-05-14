

Feature: Add-Edit-Delete Attestations under Human Resources Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: I should be able to Add Attestations for Human Resources Details
    Given Navigate to Attestations page
    And Click on Add Attestations
    And Fill in Add Attestations name field
    When Click on save button for adding attestation
    Then Verify Attestation created message


  Scenario: I should be able to Edit Attestations for Human Resources Details
    Given Navigate to Attestations page
    When Click on search button to find the needed name
    And Click on Edit button for editing attestation
    And Fill in the name field with a new name
    When Click on Save Button to save the new name
    Then Verify Attestation updated message


  Scenario: I should be able to Delete Attestations
    Given Navigate to Attestations page
    And Enter the needed name
    When Click on search button to find the edited name
    And Delete the current name
    Then Verify Attestation deleted message