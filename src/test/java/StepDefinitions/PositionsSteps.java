package StepDefinitions;

import Pages.CommonElements;
import Pages.PositionsElements;
import Utilities.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PositionsSteps {

    PositionsElements ds=new PositionsElements();
    CommonElements ce=new CommonElements();

    WebDriverWait wait=new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(5));

    @Given("I navigate to Positions page")
    public void iNavigateToPositionsPage() {
        ds.clickFunction(ds.humanResources);
        ds.clickFunction(ds.setupPositions);
        ds.clickFunction(ds.Positions);
    }

    @When("I click on Add button on Positions")
    public void iClickOnAddButtonOnPositions() {
        ce.clickFunction(ce.addButton);
    }

    @And("I fill in the name and short name fields on Positions")
    public void iFillInTheNameAndShortNameFieldsonPositions() {
        ce.sendKeysFunction(ce.nameInput,"david");
        ce.sendKeysFunction(ce.shortName,"d");
    }

    @And("I click on Save button on Positions")
    public void iClickOnSaveButtonOnPositions() {
        ce.clickFunction(ce.saveButton);
    }

    @Then("I verify name is added list on Position")
    public void iVerifyNameIsAddedListOnPosition() {
        ds.verifyContainsTextFunction(ds.successMessage,"success");
    }

    @When("I fill in the general name field on Positions Page")
    public void iFillInTheGeneralNameFieldOnPositionsPage() {
        ce.sendKeysFunction(ce.searchInputName,"david");
    }

    @And("I click on the Search button on Positions Page")
    public void iClickOnTheSearchButtonOnPositionsPage() {
        ce.clickFunction(ce.searchButton);
    }

    @And("I click on Edit button on Positions Page")
    public void iClickOnEditButtonOnPositionsPage() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        ce.clickFunction(ce.editButton);
    }

    @Then("I verify name is edited on Positions Page list")
    public void iVerifyNameIsEditedOnPositionsPageList() {
        ds.verifyContainsTextFunction(ds.successMessage,"success");
    }

    @And("I click on Delete button on Positions Page")
    public void iClickOnDeleteButtonOnPositionsPage() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        ce.clickFunction(ce.deleteButton);
    }

    @And("I click on Delete button again on Positions Page")
    public void iClickOnDeleteButtonAgainOnPositionsPage() {
        ce.clickFunction(ce.deleteDialogBtn);
    }

    @Then("I verify name is deleted on Positions Page list")
    public void iVerifyNameIsDeletedOnPositionsPageList() {
        ds.verifyContainsTextFunction(ds.successMessage,"success");
    }
}




