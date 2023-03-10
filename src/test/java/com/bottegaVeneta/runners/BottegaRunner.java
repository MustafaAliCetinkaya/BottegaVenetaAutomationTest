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
        plugin = {
                //"pretty", not necessary. Because basically it just prints out additional information about the scenario that is being executed.
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "com/bottegaVeneta/stepDefinitions",
        tags = "@TCAddingAndRemovingImages",
        dryRun = false
        //publish = true will enable a functionality from cucumber to generate a public daily link for the report of our final execution of our code

)

public class BottegaRunner {

}
