package com.bottegaVeneta.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*- Dryrun: turns on and off the running of step_definitions.
- If I don't want to actually run my code, and just want to get my snippets for implementing, I will turn dryRun on by giving "true" value
dryRun = true --> do not run my step_definitions, but only check if any step is missing snippet
dryRun = false --> this will turn off dryRun, and our code will run as expected.
*/
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/bottegaVeneta/stepDefinitions",
        tags = "@TC02 and @Placeholder",
        dryRun = false
)

public class CukesRunner {

}
