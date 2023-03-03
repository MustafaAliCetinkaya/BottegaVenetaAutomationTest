package com.bottegaVeneta.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber/report.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt",
        },
        features = "/Users/mustafacetinkaya/IdeaProjects/BottegaVenetaAutomationTest/src/test/resources/features/crm",
        publish = true //will enable a functionality from cucumber to generate a public daily link for the report of our final execution of our code

)

public class CukesRunner {

}
