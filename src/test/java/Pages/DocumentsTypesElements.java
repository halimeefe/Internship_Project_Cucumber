package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentsTypesElements extends Parent{



    public DocumentsTypesElements(){
        PageFactory.initElements(PageDriver.getDriver(),this);

    }


    @FindBy (xpath ="(//span[text()='Document Types'])[1]")
    public WebElement document_type;

    @FindBy (xpath ="(//*[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy (xpath ="(//span[text()='Parameters'])[1]")
    public WebElement parameters;

    @FindBy (xpath= "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input)[2]")
    public WebElement newDocumentName;

    @FindBy (xpath ="(//span[text()='Stage'])[3]")
    public  WebElement stage;

    @FindBy (xpath ="//span[text()=' Student Registration ']")
    public WebElement studentRegistration;

    // @FindBy(xpath="//div[contains(text(),'successfully')]")

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInputName;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath="(//ms-edit-button[@table='true']//button)[1]")
    public WebElement editButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "//fuse-progress-bar/*")
    public WebElement progressBar;

}

