package cukeRunners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = { "pretty",
		"html:target/htmlreports" }, glue = "stepDefinitions", plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, features = "src/test/resources/functionalTests/")

public class DefaultRunnerTest {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/report.xml"));

	}
}