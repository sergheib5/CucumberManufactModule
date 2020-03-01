package pages.Reports_Serghei;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Config;
import utilities.Driver;

import java.net.MalformedURLException;

public class UserProductPage {
    public UserProductPage() throws MalformedURLException {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    String productNum = Config.getProperty("Productnumber");
    String xpathNumberOfProduct = "(//div[@class='oe_kanban_details'])["+productNum+"]";


    @FindBy(xpath = "(//div[@class='oe_kanban_details'])[1]")
    public WebElement selectProduct;

    @FindBy(xpath = "//button[contains(text(), 'Print')]")
    public WebElement printBtn;

    @FindBy(xpath = "//*[contains(text(), 'Products Labels')]")
    public WebElement productsLabel;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement accountMenu;



}
