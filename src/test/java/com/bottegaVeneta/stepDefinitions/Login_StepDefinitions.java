package com.bottegaVeneta.stepDefinitions;

import com.bottegaVeneta.pages.AgileProCRMPage;
import com.bottegaVeneta.utilities.ConfigurationReader;
import com.bottegaVeneta.utilities.Driver;
import org.junit.Test;

public class Login_StepDefinitions {
    AgileProCRMPage agileProCRMPage=new AgileProCRMPage();
    @Test
    public void loginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("AgileProCRM"));
        agileProCRMPage.login();
        Driver.closeDriver();
    }
}
