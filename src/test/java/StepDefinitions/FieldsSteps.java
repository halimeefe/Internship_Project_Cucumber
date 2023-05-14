package StepDefinitions;

import Pages.CommonElements;
import Pages.FieldsElements;
import Utilities.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FieldsSteps {

    FieldsElements so= new FieldsElements();
    CommonElements ce=new CommonElements();

    WebDriverWait wait=new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(5));
    @Given("Navigate to Fields Page")
    public void navigateToFieldsPage() {
        so.clickFunction(so.setup);
        so.clickFunction(so.parameters);
        so.clickFunction(so.fields);
    }

    @And("add field")
    public void addField() {

        ce.clickFunction(ce.addButton);
        ce.sendKeysFunction(ce.nameInput,"istanbul");
        so.sendKeysFunction(so.code,"343502");
        so.clickFunction(so.saveButton);
    }

    @Then("success message")
    public void successMessage() {
        so.verifyContainsTextFunction(so.successMessage,"successfully");
    }

    @And("search registered information")
    public void searchRegisteredInformation() {

        ce.sendKeysFunction(ce.searchInputName,"istanbul");
        ce.clickFunction(ce.searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
    }

    @And("click edit button")
    public void clickEditButton() {

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        so.clickFunction(so.yeniedit);
        ce.sendKeysFunction(ce.nameInput,"istanbul");
        ce.clickFunction(ce.saveButton);
    }
    @And("Search registered name")
    public void searchRegisteredName() {

        ce.sendKeysFunction(ce.searchInputName,"istanbul");
        ce.clickFunction(ce.searchButton);

    }

    @And("Click delete button")
    public void clickDeleteButton() {

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        ce.clickFunction(ce.deleteButton);
        ce.clickFunction(ce.deleteDialogBtn);

    }
}

