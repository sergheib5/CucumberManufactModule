package pages.BillsofMaterialsBerfu;

import utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.List;

public class BillsOfMaterialsHomePage {


    public BillsOfMaterialsHomePage() throws MalformedURLException {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement CreateButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
     public WebElement ImportButton;

    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public WebElement actionsButton;

    @FindBy(xpath = "//td[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement checkBoxes;

    public List<WebElement> getAllCheckBoxes() throws MalformedURLException {
       return Driver.getDriver().findElements(By.xpath("//td[@class='o_list_record_selector']//input[@type='checkbox']"));
    }

    public List<WebElement> getAllActionOptions() throws MalformedURLException {
        return Driver.getDriver().findElements(By.xpath("(//ul[@class='dropdown-menu'])[4]//li"));
    }

    @FindBy(xpath = "//span[.='Ok']")
    public WebElement deleteAlert;




}
