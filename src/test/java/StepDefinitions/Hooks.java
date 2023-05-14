package StepDefinitions;

import Utilities.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void after(Scenario scenario){

        System.out.println("End of Scenario");
        if(scenario.isFailed()){
            TakesScreenshot ts=(TakesScreenshot) PageDriver.getDriver();
            byte[] memory=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(memory,"image/png","screen shot");
        }
        PageDriver.quitDriver();
    }
}

