package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscountsAndNationalitiesElements extends Parent {

    public DiscountsAndNationalitiesElements(){
        PageFactory.initElements(PageDriver.getDriver(),this);

    }

    @FindBy(xpath = "//div[contains(text(),'success')]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'exist')]")
    public WebElement errorMessage;


    @FindBy(xpath = "(//*[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "(//*[text()='Parameters'])[1]")
    public WebElement parameters;


    @FindBy(xpath = "(//*[text()='Discounts'])[1]")
    public WebElement discounts;

    @FindBy(xpath = "(//*[text()='Nationalities'])[1]")
    public WebElement nationalities;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']/input")
    public WebElement description;
    @FindBy(xpath = "//ms-text-field[@placeholder='DISCOUNT.TITLE.DESCRIPTION']/input")
    public WebElement description1;


    @FindBy(xpath="//ms-text-field[@formcontrolname='code']/input")
    public WebElement integrationCode;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']/input")
    public WebElement priorityCode;

    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;

}


