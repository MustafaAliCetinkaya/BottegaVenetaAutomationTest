package com.bottegaVeneta.stepDefinitions;
import com.bottegaVeneta.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void tearDown(Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }

        Driver.closeDriver();
    }

}