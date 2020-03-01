package pages.ManufacturingOrdersOytun;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeleteOrderPage {

    public DeleteOrderPage () {
            PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement actionButton;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[4]//a[@data-index='1']")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement okayButtinForDelete;

    @FindBy(xpath =  "//div[@class='o_dialog_warning modal-body']")
    public  WebElement actualResult;

    @FindBy (xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement finishButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement pickOrder;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[1]")
    public WebElement printButton;


}
