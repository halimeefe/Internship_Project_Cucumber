package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Attestations extends Parent{

    public Attestations(){
        PageFactory.initElements(PageDriver.getDriver(),this);

    }


    @FindBy (xpath = "//*[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy (xpath = "(//*[text()='Setup'])[3]")
    public WebElement setup;

    @FindBy (xpath = "//*[text()='Attestations']")
    public WebElement attestations;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy (xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "/html/body/hot-toast-container/div/div/hot-toast/div/div/div[2]/div/dynamic-view/div")
    public WebElement successMessage;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInputName;

    @FindBy (xpath = "//input[@id='ms-text-field-1']")
    public WebElement editName;

    @FindBy(xpath="(//ms-edit-button[@table='true']//button)[1]")
    public WebElement editButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;


}

