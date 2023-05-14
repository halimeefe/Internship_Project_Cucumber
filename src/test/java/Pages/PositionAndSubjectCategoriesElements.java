package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PositionAndSubjectCategoriesElements extends Parent{


    public PositionAndSubjectCategoriesElements(){
        PageFactory.initElements(PageDriver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setupPositionCategories;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    public WebElement positionCategories;

    @FindBy(xpath = "//div[contains(text(),'success')]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'exist')]")
    public WebElement errorMessage;

    @FindBy(css = "[data-placeholder='Name']")
    public WebElement generalName;

    @FindBy(xpath = "//fuse-progress-bar/*")
    public WebElement progressBar;

    @FindBy(xpath = "//span[text()=' Cancel ']")
    public  WebElement cancel;

    @FindBy(css = "tbody[role='rowgroup'] td:nth-child(2)")
    public WebElement data;

    @FindBy(xpath = "//*[text()='Education']")
    public WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement setupEducation;

    @FindBy(xpath = "//*[text()='Subject Categories']")
    public WebElement subjectCategories;

    @FindBy(css = "ms-text-field[formcontrolname='code']>input")
    public WebElement codeInput;

    @FindBy(css = "ms-text-field[placeholder='GENERAL.FIELD.CODE']>input")
    public WebElement generalCode;

}


