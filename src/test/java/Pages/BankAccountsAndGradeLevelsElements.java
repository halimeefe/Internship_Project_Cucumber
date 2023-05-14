package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankAccountsAndGradeLevelsElements extends Parent {

    public BankAccountsAndGradeLevelsElements() {
        PageFactory.initElements(PageDriver.getDriver(), this);

    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "//*[text()='Bank Accounts']")
    public WebElement bankaccounts;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(css = "[formcontrolname='iban']>input")
    public WebElement iban;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    public WebElement currency;

    @FindBy(css = "ms-edit-button[class='ng-star-inserted']")
    public WebElement editbutton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'exist')]")
    public WebElement errorMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(css = "[formcontrolname='integrationCode']>input")
    public WebElement integrationCode;

    @FindBy(css = "[type='number']>input")
    public WebElement orderInput;
    @FindBy(xpath = "(//*[@class='mat-option-text'])[2]")
    public WebElement currencytext;

    @FindBy(css = "[class='mat-raised-button']")
    public WebElement srcBtn;

    @FindBy(xpath = "(//span[text()='Grade Levels'])[1]")
    public WebElement gradeLevels;

    @FindBy(xpath = "(//div[@id='container-3'])// tbody/tr//td")
    public WebElement tbodyGradeLevels;

    @FindBy(css = "button[aria-label='Close dialog']")
    public WebElement close;

    @FindBy(xpath = "//td[text()='txt1']//following::div//ms-edit-button")
    public WebElement gradeleveledit;

    @FindBy(xpath = "//td[text()='txt1']//following::div//ms-delete-button")
    public WebElement gradeleveldelete;

    public WebElement getWebElement(String strButton) {
        switch (strButton) {
            case "bankaccounts":
                return bankaccounts;
            case "iban":
                return iban;
            case "currency":
                return currency;
            case "searchInput":
                return searchInput;
            case "searchButton":
                return searchButton;
            case "deleteImageBtn":
                return deleteImageBtn;
            case "deleteDialogBtn":
                return deleteDialogBtn;
            case "addButton":
                return addButton;
            case "saveButton":
                return saveButton;
            case "nameInput":
                return nameInput;
            case "codeInput":
                return codeInput;
            case "integrationCode":
                return integrationCode;
            case "setup":
                return setup;
            case "parameters":
                return parameters;
            case "currencytext":
                return currencytext;
            case "srcBtn":
                return srcBtn;
            case "gradeLevels":
                return gradeLevels;
            case "shortName":
                return shortName;
            case "orderInput":
                return orderInput;
            case "tbodygradelevels":
                return tbodyGradeLevels;
            case "close":
                return close;
            case "editbutton":
                return editbutton;
            case "gradeleveledit":
                return gradeleveledit;
            case "gradeleveldelete":
                return gradeleveldelete;
            case "exist":
                return errorMessage;


        }
        return null;


    }
}




