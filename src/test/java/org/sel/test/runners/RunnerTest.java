package org.sel.test.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/org.sel.test/features"},
        glue = {"org.sel.test.stepdefinitions","org.sel.test.hooks"},
        plugin = {"pretty",
                  "json:target/cucumber-reports/cucumber.json",
                  "junit:target/cucumber-reports/cucumber.xml",
                  "html:target/cucumber-reports/cucumber-html-report.html",
                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        )
public class RunnerTest {
}
