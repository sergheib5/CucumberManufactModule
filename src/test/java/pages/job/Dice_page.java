package pages.job;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dice_page {
    public Dice_page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")
    public WebElement emailInput;

    @ FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    @FindBy(xpath = "//a[@id='navbarDropdown-8']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//a[contains(text(),  'Login')] )[2]")
    public WebElement loginOpenBtn;

    @FindBy(xpath = "//a[.='Edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//button[@id='editProfile']")
    public WebElement editOfProfile;

    @FindBy(xpath = " //input[@name='resumeFile']")
    public WebElement uploadBtn;

    @FindBy(xpath = "//button[.='No']")
    public WebElement noChanges;

    @FindBy(xpath = "//div[@class='row'] /button[@data-ng-if='isOnEditMode']")
    public WebElement savedBtn;
}
