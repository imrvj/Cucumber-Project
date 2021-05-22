package Cucumber_Learn.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/Cucumber_Learn/featureFiles/"},
		glue={"Cucumber_Learn.stepDefinition"},
		tags={"@LoginPage"},
		monochrome=true,
		dryRun=false,
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})


public class TestRunner {

	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
    
    }
}
