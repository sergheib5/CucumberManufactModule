package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"@target/rerun.txt"},
        plugin = {
                "pretty", "html:target/cucumber-html-report",
                "json:target/cucumber.json", "junit:target/cucumber.xml"},
        glue = "steps_definitions"
)

public class ReRunFailed {



}
