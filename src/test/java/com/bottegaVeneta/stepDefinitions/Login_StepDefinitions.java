package com.bottegaVeneta.stepDefinitions;

import com.bottegaVeneta.pages.AgileProCRMBasePage;
import com.bottegaVeneta.utilities.ConfigurationReader;
import com.bottegaVeneta.utilities.Driver;
import org.junit.Test;

public class Login_StepDefinitions extends AgileProCRMBasePage {
    @Test
    public void loginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("AgileProCRM"));
        login();
        Driver.closeDriver();
    }
}
