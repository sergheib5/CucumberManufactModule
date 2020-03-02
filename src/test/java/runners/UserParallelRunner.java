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
                "json:target/parallel-cucumber2.json",
        },
        features = "src/test/resources/features/User",
        glue = "steps_definitions"
)



public class UserParallelRunner {

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
                String username = null;
                String password = null;
                username = Config.getProperty("userLogin");
                password = Config.getProperty("userPassword");
                Driver.getDriver().get(Config.getProperty("erbUrl"));
                loginPage.username.sendKeys(Config.getProperty("userLogin"));
                loginPage.password.sendKeys(Config.getProperty("userPassword"));
                loginPage.loginBtn.click();
                SeleniumUtils.pause(4);
                loginPage.usermanufacturingModule.click();
                SeleniumUtils.pause(3);
        }

}
