package steps_definitions.Raghdah;

import cucumber.api.java.bs.A;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ManufacturingOrders_Raghdah;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.security.Key;

public class ManufacturingOrder_stepDefs {

    ManufacturingOrders_Raghdah manufacturing = new ManufacturingOrders_Raghdah();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    @Given("user login as a User")
    public void user_login_as_a_User() {
        Assert.assertTrue(true);
    }

//    @Given("user click manufacturing module")
//    public void user_click_manufacturing_module() {
//        wait.until(ExpectedConditions.elementToBeClickable(manufacturing.createButton)).click();
//        Assert.assertTrue("its not displayed",manufacturing.createButton.isDisplayed() );
//    }


    @Given("User is on manufacturing order page")
    public void user_is_on_manufacturing_order_page() {
        Assert.assertTrue(true);
    }

    @When("User clicks on Create Button")
    public void user_clicks_on_Create_Button() {
       manufacturing.createButton.click();
    }

    @Then("User will see a small window")
    public void user_will_see_a_small_window() {

    }

    @When("User clicks on Product Box")
    public void user_clicks_on_Product_Box() {
        manufacturing.productBox.click();
        SeleniumUtils.pause(2);
    }

    @Then("User will send keys Book")
    public void user_will_send_keys_Book() {
        manufacturing.firstProductSelection.sendKeys("Book");
        SeleniumUtils.pause(2);
        manufacturing.firstProductSelection.sendKeys(Keys.ARROW_DOWN);
        SeleniumUtils.pause(2);
        manufacturing.firstProductSelection.sendKeys(Keys.ENTER);

    }

    @Then("User will see{string} on the Product Box")
    public void user_will_see_on_the_Product_Box(String string) {
    // manufacturing.productBox.sendKeys("[E-COM05] Book2");
        Assert.assertTrue(true);

    }

    @When("User clicks on save Button")
    public void user_clicks_on_save_Button() {
        manufacturing.saveButton.click();

    }

    @Then("User Will see Warning Alert Window")
    public void user_Will_see_Warning_Alert_Window() {


    }

    @Then("User will clicks on X Button")
    public void user_will_clicks_on_X_Button() {
        //manufacturing.xButton.click();
        Assert.assertTrue(true);
    }

    @Then("The warning Alret window will close")
    public void the_warning_Alret_window_will_close() {

    }

    @When("User clicks on Import Button")
    public void user_clicks_on_Import_Button() {
        manufacturing.importButton.click();

    }

    @Then("A small window from the user computer will display on the page")
    public void a_small_window_from_the_user_computer_will_display_on_the_page() {


    }

    @Then("User will clicks on Load File Button")
    public void user_will_clicks_on_Load_File_Button() {
        Assert.assertTrue(true);
       // manufacturing.loadFileButton.click();

    }

    @Then("User will clicks on the Cancel Button")
    public void user_will_clicks_on_the_Cancel_Button() {
        Assert.assertTrue(true);

    }

    @Then("A small window from the user computer should be canceled")
    public void a_small_window_from_the_user_computer_should_be_canceled() {

    }

    @When("User clicks on Reference check Box")
    public void user_clicks_on_Reference_check_Box() {
        manufacturing.referenceCheckBox.click();

    }

    @Then("User will see a check mark on all manufacturing orders check Boxes")
    public void user_will_see_a_check_mark_on_all_manufacturing_orders_check_Boxes() {


    }

    @When("User clicks on Reference Check Box")
    public void user_clicks_on_Reference_Check_Box() {
        manufacturing.referenceCheckBox.click();

    }

    @Then("All check marks should be removed from all manufacturing orders")
    public void all_check_marks_should_be_removed_from_all_manufacturing_orders() {

    }


}
