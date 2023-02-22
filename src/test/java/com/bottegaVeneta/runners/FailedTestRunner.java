package com.bottegaVeneta.runners;


import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/bottegaVeneta/stepDefinitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
}