package StepDefinitions;

import Pages.CommonElements;
import Pages.PositionAndSubjectCategoriesElements;
import Utilities.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SubjectCategoriesSteps {

    PositionAndSubjectCategoriesElements cd=new PositionAndSubjectCategoriesElements();
    CommonElements ce=new CommonElements();

    WebDriverWait wait=new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(5));

    @Given("I navigate to Subject Categories")
    public void iNavigateToSubjectCategories() {
        cd.clickFunction(cd.education);
        cd.clickFunction(cd.setupEducation);
        cd.clickFunction(cd.subjectCategories);
    }

    @And("I fill in the name and code fields")
    public void iFillInTheNameAndCodeFields() {
        ce.sendKeysFunction(ce.nameInput,"vfdvf");
        cd.sendKeysFunction(cd.codeInput,"45635");

    }

    @Then("I verify name is added Subject Categories list")
    public void iVerifyNameIsAddedSubjectCategoriesList() {
        cd.verifyContainsTextFunction(cd.successMessage,"success");
    }

    @Then("I verify that the name is not added to the list of Subject Categories")
    public void iVerifyThatTheNameIsNotAddedToTheListOfSubjectCategories() {
        cd.verifyContainsTextFunction(cd.errorMessage,"exist");
    }

    @And("I fill in the name and code fields with exist a name,code")
    public void iFillInTheNameAndCodeFieldsWithExistANameCode() {
        ce.sendKeysFunction(ce.nameInput,"vfdvf");
        cd.sendKeysFunction(cd.codeInput,"45635");
    }

    @And("I fill in the general name and code fields")
    public void iFillInTheGeneralNameAndCodeFields() {
        cd.sendKeysFunction(cd.generalName,"vfdvf");
        cd.sendKeysFunction(cd.generalCode,"45635");


    }

    @Then("I verify name is edited Subject Categories list")
    public void iVerifyNameIsEditedSubjectCategoriesList() {
        cd.verifyContainsTextFunction(cd.successMessage,"success");
    }

    @Then("I verify name is deleted Subject Categories list")
    public void iVerifyNameIsDeletedSubjectCategoriesList() {
        cd.verifyContainsTextFunction(cd.successMessage,"success");
    }

    @Then("I verify name is not deleted on Subject Categories list")
    public void iVerifyNameIsNotDeletedOnSubjectCategoriesList() {
        Assert.assertNotNull(cd.data);
    }

}


