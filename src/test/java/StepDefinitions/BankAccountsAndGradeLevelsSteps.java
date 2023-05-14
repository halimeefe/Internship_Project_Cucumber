package StepDefinitions;

import Pages.BankAccountsAndGradeLevelsElements;
import Utilities.PageDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BankAccountsAndGradeLevelsSteps {



    BankAccountsAndGradeLevelsElements dt= new BankAccountsAndGradeLevelsElements();

    WebDriverWait wait = new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(20));

    @And("Click on the element in DataTableElements")
    public void clickOnTheElementInDialogContent(DataTable elements) {
        List<String> strButtons = elements.asList(String.class);
        for (String strButton : strButtons) {
            WebElement element = dt.getWebElement(strButton);
            wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
            dt.clickFunction(element);
        }
    }


    @And("User sending the keys in DataTableElements")
    public void userSendingTheKeysInDataTableElements(DataTable data) {
        List<List<String>> elements = data.asLists(String.class);
        for (int i = 0; i < elements.size(); i++) {
            WebElement element = dt.getWebElement(elements.get(i).get(0));
            dt.sendKeysFunction(element, elements.get(i).get(1));


        }
    }
    @And("Click on the searchButton in DataTableElements")
    public void clickOnTheSearchButtonInDataTableElements() {
        //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ms-search-button//button")));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        dt.clickFunction(dt.searchButton);

    }
    @Then("Verify the bank account already exist")
    public void verifyTheNewBankAccountAlreadyExist() {
        dt.verifyContainsTextFunction(dt.errorMessage, "exist");
    }

    @Then("Verify the Grade Level already exist")
    public void verifyTheGradeLevelAlreadyExist() {
        dt.verifyContainsTextFunction(dt.errorMessage, "exist");

    }

    @And("Click on the edit button in DataTableElements")
    public void clickOnTheEditButtonInDataTableElements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ms-edit-button[class='ng-star-inserted']")));
        dt.clickFunction(dt.editbutton);
    }

    @Then("Verify updating Grade Level succesfully")
    public void verifyUpdatingGradeLevelSuccesfully() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        dt.verifyContainsTextFunction(dt.successMessage, " successfully updated");


    }

    @Then("Verify deleting Grade Level succesfully")
    public void verifyDeletingGradeLevelSuccesfully() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        dt.verifyContainsTextFunction(dt.successMessage, " successfully deleted");

    }

    @Then("Verify creating a new bank account succesfully")

    public void verify_creating_a_new_bank_account_succesfully() {
        dt.verifyContainsTextFunction(dt.successMessage, "successfully created");

    }
    @Then("Verify deleting bank account succesfully")
    public void verify_deleting_bank_account_succesfully() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        dt.verifyContainsTextFunction(dt.successMessage, "successfully deleted");

    }

    @Then("Verify updating bank account succesfully")
    public void verify_updating_bank_account_succesfully() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));
        dt.verifyContainsTextFunction(dt.successMessage, "successfully updated");

    }
}






