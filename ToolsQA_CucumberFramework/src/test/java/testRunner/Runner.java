package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/resources/functionalTests",
			
	       glue={"com.shopToolsQA.stepDefinition"}
			
		)
public class Runner {

}
