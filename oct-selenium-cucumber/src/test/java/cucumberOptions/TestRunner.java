package cucumberOptions;

import java.io.File;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("unused")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features_testcases", // path of the feature file
		// path of the java implimentation package name
		glue = "stepDefination", monochrome = true, tags = "@login", strict = true, plugin = { "pretty",
				"html:target/cucumber", "json:target/cucumber.json", "junit:target/cukes.xml" })
public class TestRunner {

}
