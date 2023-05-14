package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(15));

    public void sendKeysFunction(WebElement element, String yazi) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void clickFunctionNormal(WebElement element) {
        waitUntilClickable(element);
        element.click();
    }

    public void verifyContainsTextFunction(WebElement element,String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(PageDriver.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    public void scrollToElement(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) PageDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);

    }
    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitUntilClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}



