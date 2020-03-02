package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/parallel-cucumber1.json",
        },
        features = "src/test/resources/features/Manager",
        glue = "steps_definitions"
)



public class ManagerParallelRunner {

        public static LoginPage loginPage;

        static {
                try {
                        loginPage = new LoginPage();
                } catch (MalformedURLException e) {
                        e.printStackTrace();
                }
        }

        @BeforeClass
        public static void setUp() throws MalformedURLException {
                String username = null ;
                String password = null;
                username = Config.getProperty("managerLogin");
                password = Config.getProperty("managerPassword");
                Driver.getDriver().get(Config.getProperty("erbUrl"));
                WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
                wait.until(ExpectedConditions.visibilityOf(loginPage.username)).sendKeys(username);
                //loginPage.username.sendKeys(Config.getProperty("managerLogin"));
                loginPage.password.sendKeys(password);
                loginPage.loginBtn.click();
                SeleniumUtils.pause(5);
                loginPage.managermanufacturingModule.click();
                SeleniumUtils.pause(3);
        }

}
