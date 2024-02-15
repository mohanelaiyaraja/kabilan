package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepDef.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\emoha\\eclipse-workspace\\CucumberNew\\src\\test\\resources\\FeatureFile",
glue="org.stepDef", plugin= {"html:htmlreport","junit:junitReport\\junit.xml","json:jsonreport\\report.json"})

public class TestRunner {
	
	@AfterClass
	public static void jsonreport() {
		
		JVMReport.generatejvmReport("C:\\Users\\emoha\\eclipse-workspace\\CucumberNew\\jsonreport\\report.json");

	}
	
}
