package steps_definitions.Products_Makmal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.MainPageKenje.MainPageKenje;
import pages.ProductsMakmal.*;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.net.MalformedURLException;

public class Products_Step_def {

    LoginPage loginPage = new LoginPage();
    MainPageKenje main = new MainPageKenje();
    Products products = new Products();
    Create_button_page create_button_page = new Create_button_page();
    New_page_save new_page_save = new New_page_save();
    New_products_page new_products_page = new New_products_page();
    EditButtonPage editButtonPage = new EditButtonPage();

    public Products_Step_def() throws MalformedURLException {
    }


    @When("user clicks on product tab")
    public void user_clicks_on_product_tab() {
        main.products.click();
    }

    @Then("user is being navigated to products page and should be see all products with details")
    public void user_is_being_navigated_to_products_page_and_should_be_see_all_products_with_details() {
        String actualText =products.productsTitle.getText();
        String expectedText="Products";
        Assert.assertEquals("title is different", actualText,expectedText);

    }


    @Then("user able to see create button")
    public void user_able_to_see_create_button() {
        Assert.assertTrue("Create button is not displayed",create_button_page.createButton.isDisplayed());
        create_button_page.createButton.click();

    }

    @When("user click create button")
    public void user_click_create_button() {
        create_button_page.createButton.click();
    }

    @Then("it should navigate to new page")
    public void it_should_navigate_to_new_page() throws MalformedURLException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.titleIs("New - Odoo"));
    }

    @Then("user should be able to see checkbox can be sold, can be purchased are selected by default")
    public void user_should_be_able_to_see_checkbox_can_be_sold_can_be_purchased_are_selected_by_default() {
        Assert.assertTrue("Is not selected",new_page_save.can_be_sold.isSelected());
        Assert.assertTrue("Is not selected",new_page_save.can_be_purchased.isSelected());
    }

    @Then("user should be able to see dropdown Product Type is on option Stockable Product")
    public void user_should_be_able_to_see_dropdown_Product_Type_is_on_option_Stockable_Product() {
        Select select = new Select(new_page_save.dropdownProductype);
        Assert.assertEquals("is not selected","Stockable Product", select.getFirstSelectedOption().getText());
    }

    @Then("user should be able to see dropdown Category is on option All")
    public void user_should_be_able_to_see_dropdown_Category_is_on_option_All() throws MalformedURLException {
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(new_page_save.dropdownCategory).perform();
        actions.click().perform();
        SeleniumUtils.pause(3);
        Assert.assertEquals("Dismatch",new_page_save.firstOneDropdownCategory.getText(),"All");
    }


    @When("user click button save")
    public void user_click_button_save() {
        // Write code here that turns the phrase above into concrete actions
        new_page_save.saveButton.click();
        new_page_save.products.click();

    }

    @Then("user click products tab and able to search created product")
    public void user_click_products_tab_and_able_to_search_created_product() {
        new_products_page.search.sendKeys("parfum777"+ Keys.ENTER);

    }


    @When("user select any product")
    public void user_select_any_product() {
    SeleniumUtils.pause(5);
    new_products_page.productanyitem.click();
    }


    @When("user click edit button")
    public void user_click_edit_button() {
        SeleniumUtils.pause(3);
        editButtonPage.clickEdit.click();
    }

    @Then("user  should be able edit and save product information")
    public void user_should_be_able_edit_and_save_product_information() throws MalformedURLException {
        new_page_save.inputText.clear();
        new_page_save.inputText.sendKeys("Book2");
        new_page_save.saveButton.click();
        SeleniumUtils.pause(3);
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals("Title dismatch",Driver.getDriver().getTitle(),"Book2 - Odoo");

        //just to reenter again Book
        editButtonPage.clickEdit.click();
        new_page_save.inputText.clear();
        new_page_save.inputText.sendKeys("Book");
        new_page_save.saveButton.click();

    }







}