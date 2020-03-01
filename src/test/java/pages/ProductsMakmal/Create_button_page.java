package pages.ProductsMakmal;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class Create_button_page {
    public Create_button_page() throws MalformedURLException {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@accesskey='c']")

    public WebElement createButton;

    }


