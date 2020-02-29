package pages.Reports_Serghei;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductImportFilePage {
    public ProductImportFilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
     @FindBy(css = ".input-group-btn>label")
    public WebElement loadBtn;

    @FindBy(xpath = "//div[@class='col-sm-12']")
    public WebElement formatText;

    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement cancelBtn;
    ////*[@for='my-file-selector']

    @FindBy(xpath = "//li[contains(text(), 'Import a File')]")
    public WebElement pageTitle;

    @FindBy(xpath = "//*[@placeholder='No file chosen...']")
    public WebElement uploadFile;


}
