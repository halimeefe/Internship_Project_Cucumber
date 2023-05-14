package StepDefinitions;

import Pages.CommonElements;
import Pages.PositionAndSubjectCategoriesElements;
import Utilities.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PositionCategoriesSteps {

    PositionAndSubjectCategoriesElements cd=new PositionAndSubjectCategoriesElements();
    CommonElements ce=new CommonElements();

    WebDriverWait wait=new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(5));

    @Given("I navigate to Position page")
    public void iNavigateToPositionPage() {
        cd.clickFunction(cd.humanResources);
        cd.clickFunction(cd.setupPositionCategories);
        cd.clickFunction(cd.positionCategories);
    }

    @When("I click on Add button")
    public void iClickOnAddButton() {
        ce.clickFunction(ce.addButton);
    }

    @And("I fill in the name field")
    public void iFillInTheNameField() {
        ce.sendKeysFunction(ce.nameInput,"ggggggg");
    }

    @And("I click on Save button")
    public void iClickOnSaveButton() {
        ce.clickFunction(ce.saveButton);
    }

    @Then("I verify name is added Positions list")
    public void iVerifyNameIsAddedPositionsList() {
        cd.verifyContainsTextFunction(cd.successMessage,"success");
    }

    @And("I fill in the name field with exist a name")
    public void iFillInTheNameFieldWithExistAName() {
        ce.sendKeysFunction(ce.nameInput,"ggggggg");
    }

    @Then("I verify that the name is not added to the list of Positions")
    public void iVerifyThatTheNameIsNotAddedToTheListOfPositions() {
        cd.verifyContainsTextFunction(cd.errorMessage,"exist");
    }

    @And("I click on the Search button")
    public void iClickOnTheSearchButton() {
        ce.clickFunction(ce.searchButton);
    }

    @And("I click on Edit button")
    public void iClickOnEditButton() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        ce.clickFunction(ce.editButton);
    }

    @Then("I verify name is edited Positions list")
    public void iVerifyNameIsEditedPositionsList() {
        cd.verifyContainsTextFunction(cd.successMessage,"success");
    }

    @When("I fill in the general name field")
    public void iFillInTheGeneralNameField() {
        cd.sendKeysFunction(cd.generalName,"ggggggg");
    }

    @And("I click on Delete button")
    public void iClickOnDeleteButton()  {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        ce.clickFunction(ce.deleteButton);
    }

    @And("I click on Cancel button")
    public void iClickOnCancelButton() {
        cd.clickFunction(cd.cancel);
    }

    @Then("I verify name is not deleted on Position Categories list")
    public void iVerifyNameIsNotDeletedOnPositionCategoriesList() {
        Assert.assertNotNull(cd.data);
    }

    @And("I click on Delete button again")
    public void iClickOnDeleteButtonAgain() {
        ce.clickFunction(ce.deleteDialogBtn);

    }

    @Then("I verify name is deleted Position Categories list")
    public void iVerifyNameIsDeletedPositionCategoriesList() {
        cd.verifyContainsTextFunction(cd.successMessage,"success");
    }
}

