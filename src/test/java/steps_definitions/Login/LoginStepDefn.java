package steps_definitions.Login;

import cucumber.api.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

public class LoginStepDefn {

    LoginPage loginPage = new LoginPage();

    @Given("user login as user")
    public void user_login_as_user() {
        Driver.getDriver().get("http://app.briteerp.com/web/login");
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys(Config.getProperty("userLogin"));
        loginPage.password.sendKeys(Config.getProperty("userPassword"));
        loginPage.loginBtn.click();
        loginPage.usermanufacturingModule.click();
    }

    @Given("user click manufacturing module")
    public void user_click_manufacturing_module() {
        loginPage.managermanufacturingModule.click();
        SeleniumUtils.pause(3);
    }


    @Given("user login as manager")
    public void userLoginAsManager() {
        Driver.getDriver().get("http://app.briteerp.com/web/login");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
        wait.until(ExpectedConditions.visibilityOf(loginPage.username)).sendKeys(Config.getProperty("managerLogin"));
        //loginPage.username.sendKeys(Config.getProperty("managerLogin"));
        loginPage.password.sendKeys(Config.getProperty("managerPassword"));
        loginPage.loginBtn.click();
        SeleniumUtils.pause(4);
    }


}
