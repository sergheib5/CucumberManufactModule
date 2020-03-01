package steps_definitions.BillsofMaterialsAsManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BillsofMaterialsBerfu.BillsOfMaterialsHomePage;
import pages.BillsofMaterialsBerfu.CreateBillsofMaterialsPage;
import pages.BillsofMaterialsBerfu.ImportFilePage;
import pages.MainPageKenje.MainPageKenje;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BillsofMaterials {

    MainPageKenje main=new MainPageKenje();
    CreateBillsofMaterialsPage createMaterialPage = new CreateBillsofMaterialsPage();
    ImportFilePage importFilePage = new ImportFilePage();
    pages.BillsofMaterialsBerfu.BillsOfMaterialsHomePage BillsOfMaterialsHomePage= new BillsOfMaterialsHomePage();
    List<WebElement> l;

    @When("user clicks the Bills of Materials")
    public void user_clicks_the_Bills_of_Materials() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
        wait.until(ExpectedConditions.visibilityOf(main.managerbillsOfMaterials)).click();
    }

    @Then("Create button is displayed and enabled")
    public void create_button_is_displayed_and_enabled() {
        Assert.assertTrue(BillsOfMaterialsHomePage.CreateButton.isDisplayed() && BillsOfMaterialsHomePage.CreateButton.isEnabled());
        utilities.SeleniumUtils.pause(5);

    }

    @When("user clicks on Create button")
    public void user_clicks_on_Create_button() {
        BillsOfMaterialsHomePage.CreateButton.click();
        utilities.SeleniumUtils.pause(5);
    }

    @Then("Quantity button,save button and discard button are displayed and enabled")
    public void quantity_button_save_button_and_discard_button_are_displayed_and_enabled() {
        Assert.assertTrue(createMaterialPage.QuantityInput.isDisplayed() && createMaterialPage.QuantityInput.isEnabled());
        Assert.assertTrue(createMaterialPage.SaveButton.isEnabled() && createMaterialPage.SaveButton.isDisplayed());
        Assert.assertTrue(createMaterialPage.DiscardButton.isEnabled()&& createMaterialPage.DiscardButton.isDisplayed());
    }

    @Then("reference button is displayed, and Bom type radio buttons are displayed and by default manufacture this product is selected")
    public void reference_button_is_displayed_and_Bom_type_radio_buttons_are_displayed_and_by_default_manufacture_this_product_is_selected() {
        Assert.assertTrue(createMaterialPage.ManufactureThisProductRadioButton.isSelected());
        Assert.assertTrue(createMaterialPage.ReferenceInput.isDisplayed() && createMaterialPage.ReferenceInput.isEnabled());
    }

    @When("user clicks Product Dropdown Button and choose first product")
    public void user_clicks_Product_Dropdown_Button_and_choose_first_product() {
        createMaterialPage.ProductInput.click();
        utilities.SeleniumUtils.pause(4);
        createMaterialPage.FirstProductInput.click();
    }

    @When("user clears and provides quantity information")
    public void user_clears_and_provides_quantity_information() {
        createMaterialPage.QuantityInput.clear();
        createMaterialPage.QuantityInput.sendKeys("1.00");
    }

    @When("user provides reference information")
    public void user_provides_reference_information() {
        createMaterialPage.ReferenceInput.sendKeys("1234");
    }

    @When("user clicks to the Save button")
    public void user_clicks_to_the_Save_button() {
        createMaterialPage.SaveButton.click();
    }

    @Then("import button is displayed and enabled")
    public void import_button_is_displayed_and_enabled() {
        SeleniumUtils.pause(3);
        Assert.assertTrue(BillsOfMaterialsHomePage.ImportButton.isDisplayed() && BillsOfMaterialsHomePage.ImportButton.isEnabled());
    }

    @When("user clicks on import button on the bills of materials page")
    public void user_clicks_on_import_button_on_the_bills_of_materials_page() {
        BillsOfMaterialsHomePage.ImportButton.click();
        SeleniumUtils.pause(4);

        //After Import click, it shows again create and import buttons
        importFilePage.secondimportbutton.click();

    }

    @Then("import button, reload and test import button are displayed but not enabled")
    public void import_button_reload_and_test_import_button_are_displayed_but_not_enabled() {
        Assert.assertTrue(importFilePage.ImportButton.isDisplayed());
        Assert.assertFalse(importFilePage.ImportButton.isEnabled());
        Assert.assertTrue(importFilePage.ReloadFileButton.isDisplayed());
        Assert.assertFalse(importFilePage.ReloadFileButton.isEnabled());
        Assert.assertTrue(importFilePage.TestImportButton.isDisplayed());
        Assert.assertFalse(importFilePage.TestImportButton.isEnabled());
    }

    @Then("load file button and cancel button are displayed and enabled")
    public void load_file_button_and_cancel_button_are_displayed_and_enabled() {
        Assert.assertTrue(importFilePage.LoadFileButton.isDisplayed());
        Assert.assertTrue(importFilePage.LoadFileButton.isEnabled());
        Assert.assertTrue(importFilePage.CancelButton.isDisplayed());
        Assert.assertTrue(importFilePage.CancelButton.isEnabled());
    }

    @Then("all checkboxes are enabled")
    public void all_checkboxes_are_enabled() {
        List<WebElement> list= BillsOfMaterialsHomePage.getAllCheckBoxes();
        SeleniumUtils.pause(2);
        for(int i=0; i< list.size(); i++ ){
            list= BillsOfMaterialsHomePage.getAllCheckBoxes();
            Assert.assertTrue(list.get(i).isEnabled());
        }
    }

    @When("user clicks one of the check boxes")
    public void user_clicks_one_of_the_check_boxes() {
        WebElement onecheckbox= BillsOfMaterialsHomePage.getAllCheckBoxes().get(7);
        onecheckbox.click();
        SeleniumUtils.pause(2);
    }

    @Then("action dropdown is displayed and enabled")
    public void action_dropdown_is_displayed_and_enabled() {
        Assert.assertTrue(BillsOfMaterialsHomePage.actionsButton.isDisplayed()&& BillsOfMaterialsHomePage.actionsButton.isEnabled() );
    }

    @When("user clicks action button")
    public void user_clicks_action_button() {
        BillsOfMaterialsHomePage.actionsButton.click();
        SeleniumUtils.pause(3);
    }

    @Then("Export, Archive, Unarchive, Delete options appear respectively")
    public void export_Archive_Unarchive_Delete_options_appear_respectively() {
        l = BillsOfMaterialsHomePage.getAllActionOptions();
        List <String> nameofList= new ArrayList<>();
        for(WebElement each: l){
            nameofList.add(each.getText().trim());
        }
        String [] expected= {"Export","Archive", "Unarchive","Delete"};
        List<String> expectedList= new ArrayList<>(Arrays.asList(expected));
        Assert.assertEquals(nameofList,expectedList);
    }

    @Then("user clicks delete button")
    public void user_clicks_delete_button() {
        l.get(3).click();
        SeleniumUtils.pause(2);
    }

    @Then("confirmation alert is displayed")
    public void confirmation_alert_is_displayed() {
      Assert.assertTrue(BillsOfMaterialsHomePage.deleteAlert.isDisplayed());
    }

    @Then("user clicks ok on the alert")
    public void user_clicks_ok_on_the_alert() {
        BillsOfMaterialsHomePage.deleteAlert.click();

    }

}
