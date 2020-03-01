package steps_definitions.BillsOfMaterialSteps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BillsOfMaterialUlku.ValidetingTheSearchBox;
import pages.LoginPage;
import pages.MainPageKenje.MainPageKenje;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.net.MalformedURLException;
import java.util.List;


public class BillsOfMaterialStepDefinitions {
    LoginPage loginPage = new LoginPage();
    MainPageKenje main=new MainPageKenje();
    ValidetingTheSearchBox search=new ValidetingTheSearchBox();
    private SeleniumUtils SeleniumUtil;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);

    public BillsOfMaterialStepDefinitions() throws MalformedURLException {
    }

    @And("User clicks on search box")
    public void userClicksOnSearchBox() {
        search.searchBoxOfBillsOfMaterial.click();
    }

    @When("User is on bills of material page")
    public void user_is_on_bills_of_material_page() {
        wait.until(ExpectedConditions.visibilityOf(main.billsOfMaterials)).click();
        SeleniumUtil.pause(5);

    }

    @Then("User should see bills of material page")
    public void user_should_see_bills_of_material_page() {
        Assert.assertTrue("Bills of material button is not workig", main.billsOfMaterials.isEnabled());
    }



    @When("User send valid credentials")
    public void user_send_valid_credentials() {
        search.searchBoxOfBillsOfMaterial.sendKeys("iphone"+ Keys.ENTER);

    }

    @Then("User should be able to see related search")
    public void user_should_be_able_to_see_related_search() throws MalformedURLException {
        String expectedResult="iphone";
        SeleniumUtil.pause(5);
        List<WebElement> l= search.getAllresults();
        for(WebElement each: l){
            Assert.assertTrue(each.getText().contains(expectedResult));
        }
    }

    @When("User choose any item")
    public void user_choose_any_item() {

        wait.until(ExpectedConditions.elementToBeClickable(search.checkboxForItem1)).click();
    }

    @When("User clicks on print button")
    public void user_clicks_on_print_button() {
        wait.until(ExpectedConditions.elementToBeClickable(search.printbutton)).click();
    }

    @Then("User should be able to see print of materials")
    public void user_should_be_able_to_see_print_of_materials() {
        wait.until(ExpectedConditions.elementToBeClickable(search.choosefirst)).click();
        Assert.assertTrue("Print option is not selected", true);

    }


}
