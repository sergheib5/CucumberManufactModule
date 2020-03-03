package steps_definitions.UnbuildOrders_Ivan;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;
import pages.UnbuildOrdersIVAN.UONewPage;
import pages.UnbuildOrdersIVAN.UOPage;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.Random;

public class Unbuild_Step_Def {

    LoginPage login = new LoginPage();
    UOPage manufactPage = new UOPage();
    UOPage unbuildOrdersPage = new UOPage();
    UOPage createButton = new UOPage();
    UONewPage saveButton = new UONewPage();
    UONewPage productField = new UONewPage();
    UONewPage quantityField = new UONewPage();
    UONewPage discardButton = new UONewPage();
    UONewPage unbuildButton = new UONewPage();

    @Given("user is on the manufacturing module page")
    public void user_is_on_the_manufacturing_module_page() {
    }

    @When("user click Unbuild Orders")
    public void user_click_Unbuild_Orders() {
        unbuildOrdersPage.UnbuildOrdersPage.click();
    }


    @When("user click Create button")
    public void user_click_Create_button() {
        SeleniumUtils.pause(2);
        createButton.CreateButton.click();
    }


    @When("user chose any product from Product dropdown list")
    public void user_chose_any_product_from_Product_dropdown_list() {
        productField.ProductField.click();
        Random random = new Random();
        int numOfDropDown = random.nextInt(4)+1;
        Driver.getDriver().findElement(By.xpath("(//li[@class='ui-menu-item'])["+numOfDropDown+"]")).click();
        SeleniumUtils.pause(2);
    }


    @When("user put number in Quantity field")
    public void user_put_number_in_Quantity_field() {
        quantityField.QuantityField.click();
        quantityField.QuantityField.clear();
        quantityField.QuantityField.sendKeys("1");
    }


    @When("user click Save button")
    public void user_click_Save_button() {
        saveButton.SaveButton.click();
    }


    @Then("the message Unbuild Order Created is displayed")
    public void the_message_Unbuild_Order_Created_is_displayed() {
        boolean actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='o_thread_message_content']")).isDisplayed();
        Assert.assertTrue("Unbuild Order created is DISPLAYED",actualResult);
    }


    @When("user click Discard button")
    public void user_click_Discard_button() {
        discardButton.DiscardButton.click();
    }


    @Then("user will see Warning message with Ok and Cancel buttons")
    public void user_will_see_Warning_message_with_Ok_and_Cancel_buttons() {
        boolean actualResult = Driver.getDriver().findElement(By.xpath("//h4[@class='modal-title']")).isDisplayed();
        Assert.assertTrue("Warning is DISPLAYED",actualResult);
    }


    @When("user click Unbuild button")
    public void user_click_Unbuild_button() {
        unbuildButton.UnbuildButton.click();
    }
}
