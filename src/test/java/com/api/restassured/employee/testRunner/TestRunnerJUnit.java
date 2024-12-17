package com.api.restassured.employee.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
glue ={"stepDefinations"},
monochrome = true,
publish = true,
plugin= {"pretty",
 "html:target/cucmber-Report.html","json:target/report.json"},
tags="@smoke")
public class TestRunnerJUnit {

}
