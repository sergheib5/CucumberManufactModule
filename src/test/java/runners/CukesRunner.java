package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources",
        glue = "steps_definitions",
        dryRun = true,
        tags = "@Manufacturing_module_Test"

)
public class CukesRunner {
}
