package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		          features = {".//feature file/register.feature"},
		          glue = "stepDefinations"
		        )


public class TestRunner {

}
