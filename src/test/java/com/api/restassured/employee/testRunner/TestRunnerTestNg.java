package com.api.restassured.employee.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "features",
		glue ={"stepDefinations"},
		plugin= {"pretty",
		 "html:target/cucmber-Report.html","json:target/report.json"},
		tags="@smoke")
public class TestRunnerTestNg extends AbstractTestNGCucumberTests {

}
