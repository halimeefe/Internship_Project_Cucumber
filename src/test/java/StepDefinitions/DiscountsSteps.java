package StepDefinitions;

import Pages.CommonElements;
import Pages.DiscountsAndNationalitiesElements;
import Utilities.PageDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DiscountsSteps {


    DiscountsAndNationalitiesElements yt= new DiscountsAndNationalitiesElements();
    CommonElements g=new CommonElements();

    WebDriverWait wait = new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(5));

    @Given("Navigate to Discount page")
    public void navigateToDiscountPage() {
        yt.clickFunction(yt.setup);
        yt.clickFunction(yt.parameters);
        yt.clickFunction(yt.discounts);
    }

    @When("create add discount")
    public void createAddDiscount() {
        g.clickFunction(g.addButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        yt.sendKeysFunction(yt.description, "zay");
        yt.sendKeysFunction(yt.integrationCode, "45545");
        yt.sendKeysFunction(yt.priorityCode, "123");
        yt.clickFunction(yt.toggleBar);
        g.clickFunction(g.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        yt.verifyContainsTextFunction(yt.successMessage, "success");

    }

    @Then("negative message should be displayed")
    public void negativeMessageShouldBeDisplayed() {
        g.verifyContainsTextFunction(yt.errorMessage,"exist");
    }

    @When("create edit discount")
    public void createEditDiscount() {
        yt.sendKeysFunction(yt.description1,"zay");
        yt.clickFunction(g.searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        yt.clickFunction(g.editButton);
        yt.clickFunction(g.saveButton);

    }

    @When("create delete discount")
    public void createDeleteDiscount() {
        yt.sendKeysFunction(yt.description1,"zay");
        yt.clickFunction(g.searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        yt.clickFunction(g.deleteButton);
        yt.clickFunction(g.deleteDialogBtn);
    }
}
