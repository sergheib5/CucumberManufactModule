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

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/parallel-cucumber1.json",
        },
        features = "src/test/resources/features/manufacture.feature",
        glue = "steps_definitions"
)



public class ManagerParallelRunner {
        static LoginPage loginPage = new LoginPage();

        @BeforeClass
        public static void setUp(){
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
                loginPage.usermanufacturingModule.click();
                SeleniumUtils.pause(3);

        }
}


