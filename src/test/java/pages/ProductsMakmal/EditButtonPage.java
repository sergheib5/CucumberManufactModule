package pages.ProductsMakmal;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class EditButtonPage {
        public EditButtonPage() throws MalformedURLException {
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "//button[@accesskey='c']")

        public WebElement createButton;


        @FindBy(xpath = "//button[@accesskey='a']")

        public WebElement clickEdit;


    }

