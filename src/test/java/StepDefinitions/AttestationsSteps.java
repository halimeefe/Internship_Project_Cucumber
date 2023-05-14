package StepDefinitions;

import Pages.Attestations;
import Utilities.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AttestationsSteps {


    Attestations io=new Attestations();


    WebDriverWait wait = new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(5));

    @Given("Navigate to Attestations page")
    public void navigateToAttestationsPage() {
        io.clickFunction(io.humanResources);
        io.clickFunction(io.setup);
        io.clickFunction(io.attestations);
    }

    @And("Click on Add Attestations")
    public void clickOnAddAttestations() {
        io.clickFunction(io.addButton);
    }

    @And("Fill in Add Attestations name field")
    public void fillInAddAttestationsNameField() {
        io.sendKeysFunction(io.nameInput, "Christian");
    }

    @When("Click on save button for adding attestation")
    public void clickOnSaveButtonForAddingAttestation() {
        io.clickFunction(io.saveButton);
    }

    @Then("Verify Attestation created message")
    public void verifyAttestationCreatedMessage() {
        io.verifyContainsTextFunction(io.successMessage, "success");
    }

    @When("Click on search button to find the needed name")
    public void clickOnSearchButtonToFindTheNeededName() {
        io.sendKeysFunction(io.searchInputName, "Christian");
        io.clickFunction(io.searchButton);
    }

    @And("Click on Edit button for editing attestation")
    public void clickOnEditButtonForEditingAttestation() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        io.clickFunction(io.editButton);
    }
    @And("Fill in the name field with a new name")
    public void fillInTheNameFieldWithANewName() {
        io.sendKeysFunction(io.editName, "Christian");


    }@When("Click on Save Button to save the new name")
    public void clickOnSaveButtonToSaveTheNewName() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ms-save-button/button")));
        io.clickFunction(io.saveButton);
    }

    @Then("Verify Attestation updated message")
    public void verifyAttestationUpdatedMessage() {
        io.verifyContainsTextFunction(io.successMessage,"success");
    }

    @And("Enter the needed name")
    public void enterTheNeededName() {
        io.sendKeysFunction(io.searchInputName, "Christian");

    }
    @When("Click on search button to find the edited name")
    public void clickOnSearchButtonToFindTheEditedName() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        io.clickFunction(io.searchButton);

    }

    @And("Delete the current name")
    public void deleteTheCurrentName() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        io.clickFunction(io.deleteButton);
        io.clickFunction(io.deleteDialogBtn);

    }

    @Then("Verify Attestation deleted message")
    public void verifyAttestationDeletedMessage() {
        io.verifyContainsTextFunction(io.successMessage,"success");
    }


}

