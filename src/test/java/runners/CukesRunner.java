package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports",
        "json:target/cucumber.json"},
        features = "src/test/resources",
        glue = "steps_definitions",
        dryRun = false,
        tags =  "@Manufacturing_module_Test"




)
public class CukesRunner {
}
