package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PositionsElements extends Parent{

    public PositionsElements(){
        PageFactory.initElements(PageDriver.getDriver(),this);

    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setupPositions;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    public WebElement Positions;

    @FindBy(xpath = "//div[contains(text(),'success')]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'exist')]")
    public WebElement errorMessage;



}
