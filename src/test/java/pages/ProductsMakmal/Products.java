package pages.ProductsMakmal;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class Products {
    public Products() throws MalformedURLException {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[.='Products']")
//        @FindBy(xpath = "//div[@class="o_control_panel"]//li[@class="active"]]")
    public WebElement productsTitle;
    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement importBtn;

    @FindBy(xpath = "//div[.='Loading...']")
    public WebElement loadImportSign;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement productName;

}


