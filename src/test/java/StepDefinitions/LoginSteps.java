package StepDefinitions;

import Pages.CommonElements;
import Utilities.PageDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {



    CommonElements lc=new CommonElements();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        PageDriver.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        lc.sendKeysFunction(lc.username, "turkeyts");
        lc.sendKeysFunction(lc.password, "TechnoStudy123");
        lc.clickFunction(lc.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        lc.verifyContainsTextFunction(lc.txtTechnoStudy, "Techno Study");

    }


}


