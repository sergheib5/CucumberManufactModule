package pages.Reports_Serghei.reportsSerghei;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class ProductImportFilePage {
    public ProductImportFilePage() throws MalformedURLException {
        PageFactory.initElements(Driver.getDriver(), this);
    }
     @FindBy(css = ".input-group-btn>label")
    public WebElement loadBtn;

    @FindBy(xpath = "//div[@class='col-sm-12']")
    public WebElement formatText;

    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement cancelBtn;

    @FindBy(xpath = "//li[contains(text(), 'Import a File')]")
    public WebElement pageTitle;



}
