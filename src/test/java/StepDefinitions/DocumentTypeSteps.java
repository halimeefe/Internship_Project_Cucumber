package StepDefinitions;

import Pages.CommonElements;
import Pages.DocumentsTypesElements;
import Utilities.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DocumentTypeSteps {


    DocumentsTypesElements rt=new DocumentsTypesElements();
    CommonElements ce =new CommonElements();

    WebDriverWait wait=new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(5));

    @Given("I navigate Document Type")
    public void iNavigateDocumentType() {
        rt.clickFunction(rt.setup);
        rt.clickFunction(rt.parameters);
        rt.clickFunction(rt.document_type);
    }

    @When("I click on Add Ducument Type")
    public void iClickOnAddDucumentType() {
        rt.clickFunction(rt.addButton);
    }

    @And("I fill new Document Type")
    public void iFillNewDocumentType() {
        Actions action=new Actions(PageDriver.getDriver());
        rt.sendKeysFunction(rt.newDocumentName,"Roman");
        rt.clickFunction(rt.stage);
        rt.clickFunction(rt.studentRegistration);
        action.moveToElement(rt.saveButton).click().build().perform();
    }
    @And("I click on right Save button")
    public void iClickOnRightSaveButton() {
        rt.clickFunction(rt.saveButton);
    }
    @Then("I verify name is added Document Types under Parameters Setup")
    public void iVerifyNameIsAddedDocumentTypesUnderParametersSetup() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") ,0 ));

        rt.verifyContainsTextFunction(rt.successMessage, "success");

    }

    @And("I enter added new Document Type")
    public void iEnterAddedNewDocumentType() {
        rt.sendKeysFunction(rt.searchInputName, "Roman");
    }

    @And("I click on right Search button")
    public void iClickOnRightSearchButton() {
        rt.clickFunction(rt.searchButton);
    }

    @And("I click on Edit button to edit")
    public void iClickOnEditButtonToEdit() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        rt.clickFunction(rt.editButton);
        rt.sendKeysFunction(rt.newDocumentName,"Roman2");

    }
    @And("I click on right Save button again")
    public void iClickOnRightSaveButtonagain() {
        rt.clickFunction(rt.saveButton);
    }
    @Then("I verify name is edited Document Types under Parameters Setup")
    public void iVerifyNameIsEditedDocumentTypesUnderParametersSetup() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        rt.verifyContainsTextFunction(rt.successMessage, "success");
    }
    ////////////////////////////
    @And("I enter name of Ducument for delete")
    public void iEnterNameOfDucumentForDelete() {
        rt.sendKeysFunction(rt.searchInputName,"Roman2");
    }

    @And("I click on the Search button for delete")
    public void iClickOnTheSearchButtonForDelete() {
        rt.clickFunction(rt.searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
    }

    @And("I click on Delete button on the right")
    public void iClickOnDeleteButtonOnTheRight() {
        rt.clickFunction(rt.deleteButton);
    }

    @And("I click on Delete buttonn")
    public void iClickOnDeleteButtonn() {
        rt.clickFunction(rt.deleteDialogBtn);
    }

    @Then("I verify name is deleted Document Types under Parameters Setup")
    public void iVerifyNameIsDeletedDocumentTypesUnderParametersSetup() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        rt.verifyContainsTextFunction(rt.successMessage, "success");
    }
}
