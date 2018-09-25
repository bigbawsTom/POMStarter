package cukeRunners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/functionalTests")

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:target/cucumber.json"},
		features = "src/test/resources/functionalTests"
		,glue={"stepDefinitions"}
		)


public class DefaultRunner {

}
