package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FieldsElements extends Parent{

    public FieldsElements(){
        PageFactory.initElements(PageDriver.getDriver(),this);


    }
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[11]")
    public WebElement yeniedit;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    public WebElement fields;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code']/input")
    public WebElement code;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;

    @Override
    public void scrollToElement(WebElement element) {
        super.scrollToElement(element);
    }
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;


}


