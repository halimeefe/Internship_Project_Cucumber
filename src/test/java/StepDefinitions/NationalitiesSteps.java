package StepDefinitions;

import Pages.CommonElements;
import Pages.DiscountsAndNationalitiesElements;
import Utilities.PageDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NationalitiesSteps {


    DiscountsAndNationalitiesElements yt=new DiscountsAndNationalitiesElements();
    CommonElements g=new CommonElements();


    WebDriverWait wait = new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(5));

    @Given("Navigate to Nationalities page")
    public void navigateToNationalitiesPage() {
        yt.clickFunction(yt.setup);
        yt.clickFunction(yt.parameters);
        yt.clickFunction(yt.nationalities);
    }

    @When("create add Nationalities")
    public void createAddNationalities() {
        g.clickFunction(g.addButton);
        g.sendKeysFunction(g.nameInput, "aza1");
        g.clickFunction(g.saveButton);

    }

    @When("create edit Nationalities")
    public void createEditNationalities() {
        g.sendKeysFunction(g.searchInputName, "aza1");
        g.clickFunction(g.searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        g.clickFunction(g.editButton);
        g.clickFunction(g.saveButton);
    }

    @When("create delete Nationalities")
    public void createDeleteNationalities() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        g.sendKeysFunction(g.searchInputName, "aza1");
        g.clickFunction(g.searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        g.clickFunction(g.deleteButton);
        g.clickFunction(g.deleteDialogBtn);


    }
}




