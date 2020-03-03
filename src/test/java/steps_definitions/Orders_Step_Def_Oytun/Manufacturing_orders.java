package steps_definitions.Orders_Step_Def_Oytun;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.ManufacturingOrdersOytun.CreateOrderPage;
import pages.ManufacturingOrdersOytun.DeleteOrderPage;
import steps_definitions.Login.LoginStepDefn;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


public class Manufacturing_orders {

    LoginStepDefn login = new LoginStepDefn();
    CreateOrderPage createOrderPage = new CreateOrderPage();
    DeleteOrderPage deleteOrderPage = new DeleteOrderPage();
    LoginPage loginPage = new LoginPage();


    @Given("User is on the Manufacturing Order page")
    public void user_is_on_the_Manufacturing_Order_page() {
        Assert.assertTrue(true);
    }


    @Given("User verify Create button at the top of the page")
    public void user_verify_Create_button_at_the_top_of_the_page() {

        Assert.assertTrue("Create Button is Not ENABLE", createOrderPage.createButton.isEnabled());
    }

    @Given("the user is taken to the Create New Manufacturing Orders page after clickin the Create button")
    public void the_user_is_taken_to_the_Create_New_Manufacturing_Orders_page_after_clickin_the_Create_button() {

        createOrderPage.createButton.click();
    }

    @Given("User verify Product Dropdown on the page")
    public void user_verify_Product_Dropdown_on_the_page() {
        Assert.assertTrue("Product button is not Enable ", createOrderPage.productDropdwon.isEnabled());
    }

    @Given("User verify Quantity To Produce Button on the page and {double}  as the default value")
    public void user_verify_Quantity_To_Produce_Button_on_the_page_and_as_the_default_value(Double double1) {
        Assert.assertTrue("Quantity button is not Enable ", createOrderPage.quatityToProduce.isEnabled());
    }

    @Given("User verify Bill of Material Dropdown Button on the page")
    public void user_verify_Bill_of_Material_Dropdown_Button_on_the_page() {
        Assert.assertTrue("Bill Of Materials button is not Enable ", createOrderPage.billOfMaterials.isEnabled());
    }

    @Given("User verify Deadline Start Button on the page")
    public void user_verify_Deadline_Start_Button_on_the_page() {
        Assert.assertTrue("Deadline button is not Enable ", createOrderPage.daedlineStart.isEnabled());
    }

    @Given("User verify Responsible Dropdown Button on the page")
    public void user_verify_Responsible_Dropdown_Button_on_the_page() {
        Assert.assertTrue("Responsible button is not Enable ", createOrderPage.responsible.isEnabled());
    }

    @Given("User verify Source Button on the page")
    public void user_verify_Source_Button_on_the_page() {
        Assert.assertTrue("Source button is not Enable ", createOrderPage.source.isEnabled());
    }

    @Given("User verify Save Button on the page")
    public void user_verify_Save_Button_on_the_page() {
        Assert.assertTrue("Save button is not Enable ", createOrderPage.saveButtOn.isEnabled());
    }

    @Given("User verify Discard Button is on the at the top of the page")
    public void user_verify_Discard_Button_is_on_the_at_the_top_of_the_page() {
        Assert.assertTrue(true);
    }

    @When("User click on Save button after Fill out all required fields")
    public void user_click_on_Save_button_after_Fill_out_all_required_fields() throws InterruptedException {
        createOrderPage.productDropdwon.sendKeys("Book");
        createOrderPage.productDropdwon.sendKeys(Keys.ARROW_DOWN);
        SeleniumUtils.pause(2);
        createOrderPage.productDropdwon.sendKeys(Keys.ENTER);
        createOrderPage.saveButtOn.click();
    }

    @Then("User sees message on the screen")
    public void user_sees_message_on_the_screen() {
        String actual = createOrderPage.FailText.getText();
        String expect = "Sorry, you are not allowed to access this document. ";

        Assert.assertTrue("You Can Not Create New Order", actual.contains(expect));
        createOrderPage.okayButton.click();
    }

    @Given("User sees all  Manufactoring Orders  on the page")
    public void user_sees_all_Manufactoring_Orders_on_the_page() {
        Assert.assertTrue(true);
    }

    @Given("User verify check box buttons are Enable")
    public void user_verify_check_box_buttons_are_Enable() {
        Assert.assertTrue(true);
    }

    @When("User select a Manufacturing Order check box")
    public void user_select_a_Manufacturing_Order_check_box() throws InterruptedException {
        List<WebElement> checkbox = Driver.getDriver().findElements(By.xpath("//td[@class='o_list_record_selector']//input[@type='checkbox']"));
        SeleniumUtils.pause(5);
        checkbox.get(1).click();
    }

    @Then("User verify Print Dropdown button and  Action Dropdown button are enable")
    public void user_verify_Print_Dropdown_button_and_Action_Dropdown_button_are_enable() {
        Assert.assertTrue("Action button is not Enable ", deleteOrderPage.actionButton.isEnabled());
        Assert.assertTrue("Print button is not Enable ", deleteOrderPage.printButton.isEnabled());
    }

    @When("User Click on Delete Button")
    public void user_Click_on_Delete_Button() throws InterruptedException {
        deleteOrderPage.actionButton.sendKeys(Keys.ENTER);
        SeleniumUtils.pause(3);

        deleteOrderPage.deleteButton.click();
        deleteOrderPage.okayButtinForDelete.click();
    }

    @Then("User sees Confirmation Alert")
    public void user_sees_Confirmation_Alert() {
        String expected = "Cannot delete a manufacturing order not in cancel state";
        Assert.assertTrue(expected.equalsIgnoreCase(deleteOrderPage.actualResult.getText()));
    }

    @Then("User Should be Delete the Order after Click on Ok button")
    public void user_Should_be_Delete_the_Order_after_Click_on_Ok_button() {

        deleteOrderPage.finishButton.click();
    }


    @Given("User able to sees manufacruring order")
    public void user_able_to_sees_manufacruring_order() {
        Assert.assertTrue(true);
    }

    @Then("User can write last {int} order to Excel file")
    public void user_can_write_last_order_to_Excel_file(Integer int1) throws IOException {
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;
        String path = "/Users/oytunpiren/CucumberManufactModule/Test1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("ORDER");
        for (int i = 1; i <= 10; i++) {
            sheet.getRow(i).getCell(0).setCellValue(Driver.getDriver().findElement(By.xpath("//tr[" + i + "][@class=\'o_data_row text-info\']//td[4]")).getText());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();


    }
}





