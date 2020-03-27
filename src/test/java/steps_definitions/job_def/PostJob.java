package steps_definitions.job_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.Alert;
import pages.job.Dice_page;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

public class PostJob {
    Dice_page dice_page = new Dice_page();


    @Given("user open the dice website {string}")
    public void user_open_the_dice_website(String site) {
        Driver.getDriver().get(site);


    }

    @Given("user put credentials {string} and {string}")
    public void user_put_credentials_and(String string, String string2) {
        SeleniumUtils.pause(2);
        dice_page.loginBtn.click();
        dice_page.loginOpenBtn.click();
        dice_page.emailInput.sendKeys(Config.getProperty("dicelogin"));
        dice_page.passwordInput.sendKeys(Config.getProperty("dicepass"));
        dice_page.emailInput.click();
        dice_page.signInBtn.click();

    }

    @Given("user open the profile")
    public void user_open_the_profile() {
        SeleniumUtils.waitForVisibility(dice_page.editBtn,3);
        dice_page.editBtn.click();

    }

    @Given("user clicks on edit resume")
    public void user_clicks_on_edit_resume() {
        SeleniumUtils.waitForVisibility(dice_page.editOfProfile,5);
        dice_page.editOfProfile.click();

    }

    @Then("user upload nee resume")
    public void user_upload_nee_resume() {
//        SeleniumUtils.waitForVisibility(dice_page.uploadBtn,5);
        dice_page.uploadBtn.sendKeys("C:/Users/Serghei/Desktop/S_Buciuscan_Resume.pdf");
        SeleniumUtils.pause(2);
        dice_page.noChanges.click();


    }

    @Then("user saved the profile")
    public void user_saved_the_profile() {
        SeleniumUtils.pause(2);
        dice_page.savedBtn.click();

    }
}
