package com.bottegaVeneta.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        dryRun = false,
        tags = "@TC01"
)
public class CukesRunner {
}
