package pages.UnbuildOrdersIVAN;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UOImportPage {
    public UOImportPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_import_cancel']")
    public WebElement CancelButton;

    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement LoadFileButton;






}
