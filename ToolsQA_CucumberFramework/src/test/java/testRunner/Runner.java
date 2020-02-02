package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/resources/functionalTests",
			
	       glue={"com.shopToolsQA.stepDefinition"},
			tags="@system",
	    		 //  plugin={"html:target/E2Ereport"}
			plugin= {"pretty:STDOUT" , "html:ToolsQA_CucumberFramework/Report"}
			
		)
public class Runner {
	
@AfterClass
public static void reportSetUp() {
	Reporter.loadXMLConfig(new File("ToolsQA_CucumberFramework/config/extent-config.xml"));
	Reporter.setSystemInfo("user name", System.getProperty("user.name"));
}
	
}
