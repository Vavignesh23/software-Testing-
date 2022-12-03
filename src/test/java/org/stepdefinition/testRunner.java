package org.stepdefinition;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.stepdefinition",monochrome = true,
dryRun = false,
strict = true,
snippets = SnippetType.UNDERSCORE,
plugin = {"html:Report","junit:Report\\junitreport.xml","json:Report\\jsonreport.json"})

public class testRunner {
	@AfterClass

	public static void afterClass() {
	jvReport.generateJvmReport("C:\\Users\\SHRI\\eclipse-workspace\\Cucumber\\Report\\report.json");
	}


}
