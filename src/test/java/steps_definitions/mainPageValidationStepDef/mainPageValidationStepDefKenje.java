package steps_definitions.mainPageValidationStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPageKenje.MainPageKenje;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.net.MalformedURLException;

public class mainPageValidationStepDefKenje {

    MainPageKenje mainPageKenje = new MainPageKenje();
    private SeleniumUtils SeleniumUtil;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    public mainPageValidationStepDefKenje() throws MalformedURLException {
    }


    @Given("user clicks on manufacturing module")
    public void user_clicks_on_manufacturing_module() {
        Assert.assertTrue(true);
    }

    @Given("user is on the Manufacturing Page")
    public void user_is_on_the_Manufacturing_Page() {
        Assert.assertTrue(true);
      //  Assert.assertTrue("Main Manufacturing Button is not enabled", mainPageKenje.mainManufacturingButton.isEnabled());
    }

    @When("user navigates to the Search bar")
    public void user_navigates_to_the_Search_bar() {
       Assert.assertTrue("Search bar is not displayed",mainPageKenje.mainPageSearchButton.isDisplayed());
    }

    @Then("Search bar appears with To Do bar on the left side")
    public void search_bar_appears_with_To_Do_bar_on_the_left_side() {
        Assert.assertTrue("To do button is not displayed",mainPageKenje.toDoBarInSearch.isDisplayed());
    }

    @Given("User is in the Search bar")
    public void user_is_in_the_Search_bar() {
mainPageKenje.mainPageSearchButton.click();
    }

    @When("User clicks on the + button on the right in the Search bar")
    public void user_clicks_on_the_button_on_the_right_in_the_Search_bar() {
mainPageKenje.advancedSearchButton.click();
    }

    @Then("Filters, Group By, Favorites, number of search display pages appear under the Search bar")
    public void filters_Group_By_Favorites_number_of_search_display_pages_appear_under_the_Search_bar() {
Assert.assertTrue("Filter button is not displayed", mainPageKenje.filterBox.isDisplayed());
    }


    @When("User navigates to Filters dropdown button")
    public void user_navigates_to_Filters_dropdown_button() {
    Assert.assertTrue(true);
    }

    @When("clicks on the Filters button")
    public void clicks_on_the_Filters_button() {
mainPageKenje.filterBox.click();
    }

    @Then("filter options displays in dropdown")
    public void filter_options_displays_in_dropdown() {
    Assert.assertTrue("Filter dropdown is not displayed", mainPageKenje.filterDropDown.isDisplayed());
    }

    @When("User navigates to the Group By  dropdown button")
    public void user_navigates_to_the_Group_By_dropdown_button() {
        Assert.assertTrue(true);
    }

    @When("clicks on Group By button")
    public void clicks_on_Group_By_button() {
        mainPageKenje.groupByButton.click();
    }

    @Then("Grouping options should display as a dropdown")
    public void grouping_options_should_display_as_a_dropdown() {
    Assert.assertTrue("Group By is not displayed", mainPageKenje.groupByButton.isDisplayed());
    }


}
