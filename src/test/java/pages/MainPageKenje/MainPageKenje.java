package pages.MainPageKenje;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.PanelUI;

public class MainPageKenje {

    public MainPageKenje(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-action-id='596']")
    public WebElement reportManufOrders;

    @FindBy(xpath = "//a[@data-action-id='596']")
    public WebElement unbuildOrders;

    @FindBy(xpath = "//a[@data-action-id='603']")
    public WebElement products;

    @FindBy(xpath = "//a[@data-action-id='600']")
    public WebElement billsOfMaterials;

    @FindBy (xpath ="//div[@class='o_facet_values']")
    public WebElement toDoBarInSearch;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement mainPageSearchButton;

    @FindBy(xpath = "//*[@id='oe_main_menu_navbar']/div[2]/ul[1]/li[6]/a/span)")
    public WebElement mainManufacturingButton;

    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement advancedSearchButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button")
    public WebElement filterBox;

    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[1]/a")
    public WebElement filterDropDown;

    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/button")
    public WebElement groupByButton;






}
