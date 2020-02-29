package steps_definitions.Reports_Serghei;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.MainPageKenje.MainPageKenje;
import pages.ProductsMakmal.Products;
import pages.Reports_Serghei.ProductImportFilePage;
import pages.Reports_Serghei.Reporting;
import pages.Reports_Serghei.UserProductPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class Reports_Step_Def {

    MainPageKenje mainPageKenje = new MainPageKenje();
    Reporting reporting = new Reporting();
    LoginPage loginPage = new LoginPage();
    Products products = new Products();
    UserProductPage userProductPage = new UserProductPage();

    ProductImportFilePage productImportFilePage = new ProductImportFilePage();

    @Given("user is on the manufacturing module")
    public void user_is_on_the_manufacturing_module() {

    }

    @When("user clicks on reporting")
    public void user_clicks_on_reporting() {
        mainPageKenje.reportManufOrders.click();
        SeleniumUtils.pause(3);
        String actualTitle = reporting.pageTitle.getText();
        String expectedTitle = "Manufacturing Orders";
        Assert.assertEquals("title is different", expectedTitle, actualTitle);
        Assert.assertTrue("bar chart is not displayed", reporting.barChartBtn.isDisplayed());
        Assert.assertTrue("line chart is not displayed", reporting.lineChartBtn.isDisplayed());
        Assert.assertTrue("pie chart is not displayed", reporting.pieChartBtn.isDisplayed());
        Assert.assertTrue("measure btn is not displayed", reporting.measureBtn.isDisplayed());
        Assert.assertTrue("graph btn is not displayed", reporting.graphBtn.isDisplayed());
        Assert.assertTrue("pivot table is not displayed", reporting.pivotBtn.isDisplayed());
        Assert.assertTrue("list btn is not displayed", reporting.listBtn.isDisplayed());
        Assert.assertTrue("search Btn is not displayed", reporting.searchBtn.isDisplayed());

    }

    @Then("the default report will be displayed on the page")
    public void the_default_report_will_be_displayed_on_the_page() {
        reporting.barChartBtn.click();
        String barChartExpected = "bar";
        String barChartImage = reporting.getImg.getAttribute("class").toLowerCase();
        Assert.assertTrue("Bar chart imagine is wrong", barChartImage.contains(barChartExpected));
        SeleniumUtils.pause(3);

    }

    @When("user clicks on line type chart")
    public void user_clicks_on_line_type_chart() {
        reporting.lineChartBtn.click();

    }

    @Then("the same data is being displayed on the linear chart")
    public void the_same_data_is_being_displayed_on_the_linear_chart() {
        String lineChartExpected = "line";
        String lineChartImage = reporting.getImg.getAttribute("class").toLowerCase();
        Assert.assertTrue("Line chart imagine is wrong", lineChartImage.contains(lineChartExpected));
        SeleniumUtils.pause(3);
}

    @When("user clicks on the pie chart")
    public void user_clicks_on_the_pie_chart() {
        reporting.pieChartBtn.click();
    }

    @Then("the data is displayed on a pie chart")
    public void the_data_is_displayed_on_a_pie_chart() {
        String pieChartExpected = "pie";
        String pieChartImage = reporting.getImg.getAttribute("class").toLowerCase();
        Assert.assertTrue("Bar chart imagine is wrong", pieChartImage.contains(pieChartExpected));
    }

    @When("user clicks on products tab")
    public void user_clicks_on_products_tab() {
        mainPageKenje.products.click();
    }

    @Then("user is being navigated to products page")
    public void user_is_being_navigated_to_products_page() {
        String expectedTitle = "Products";
        String actualTitle = products.productsTitle.getText();
        Assert.assertEquals("title is not correct",expectedTitle,actualTitle);
    }


    @When("user is clicking on product")
    public void user_is_clicking_on_product() {
        userProductPage.selectProduct.click();
    }

    @Then("the product page is being displayed")
    public void the_product_page_is_being_displayed() {
        String titleExpected = products.productName.getText().toLowerCase();
        String titleActual = Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue("title is correct", titleActual.contains(titleExpected));

    }

    @Then("user clicks on print button")
    public void user_clicks_on_print_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(userProductPage.printBtn));
        userProductPage.printBtn.click();
    }

    @Then("print label is downloaded to local machine")
    public void print_label_is_downloaded_to_local_machine() {
        userProductPage.productsLabel.click();
        //verifying if the load sign is displayed
        Assert.assertTrue(products.loadImportSign.isDisplayed());
    }

    @Then("user clicks on import button")
    public void user_clicks_on_import_button() {
        products.importBtn.click();
    }

    @Then("Products import a File page is displayed")
    public void products_import_a_File_page_is_displayed() {
        String actualTitle = productImportFilePage.pageTitle.getText();
        String expectedTitle = "Import a File";
        //text displayed about format should be as expected
        Assert.assertTrue("text format allowing is not displayed, ",actualTitle.contains(expectedTitle));
    }

    @Then("load button is displayed")
    public void load_button_is_displayed() {
        Assert.assertTrue(productImportFilePage.loadBtn.isDisplayed());
    }

    @Then("user can see allowing file format")
    public void user_can_see_allowing_file_format() {
        String actualFormatOfTxt = productImportFilePage.formatText.getText();
        String expectedFormatOfTxt = "Select a CSV or Excel file to import.";
        //text displayed about format should be as expected
        Assert.assertTrue("text format allowing is not displayed, or same",actualFormatOfTxt.contains(expectedFormatOfTxt));
    }

    @Then("user is choosing a file to upload")
    public void user_is_choosing_a_file_to_upload() {
       productImportFilePage.uploadFile.sendKeys("Test1.xlsx");
    }

    @Then("file is uploaded the name is displayed")
    public void file_is_uploaded_the_name_is_displayed() {
       String actualFilename = productImportFilePage.uploadFile.getAttribute("value");
       String expected = "Test1.xlsx";
        Assert.assertEquals(actualFilename,expected);
    }
}
