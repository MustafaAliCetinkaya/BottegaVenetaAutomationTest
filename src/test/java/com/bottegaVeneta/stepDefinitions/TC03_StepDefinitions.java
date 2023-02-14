package com.bottegaVeneta.stepDefinitions;

import com.bottegaVeneta.pages.BottegaVeneta;
import com.bottegaVeneta.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TC03_StepDefinitions {
    BottegaVeneta pageObject = new BottegaVeneta();

    @Then("Click on the store locator button")
    public void click_on_the_store_locator_button() {
        ReusableMethods.jsScrollClick(pageObject.storeLocatorButton);
    }
    @Then("Verify that store finder header is visible")
    public void verify_that_store_finder_header_is_visible() {
        Assert.assertTrue(pageObject.storeFinderHeader.isDisplayed());
    }
    @Then("Select a country from the dropdown button")
    public void select_a_country_from_the_dropdown_button() {
        pageObject.verifyStoreFinderCountrySelection();
    }
    @Then("Select a city from the dropdown button")
    public void select_a_city_from_the_dropdown_button() {
        pageObject.verifyStoreFinderCitySelection();
    }
    @Then("Click on the choose button")
    public void click_on_the_choose_button() {
        ReusableMethods.jsScrollClick(pageObject.storeChooseButton);
    }


    @Then("User should be able to see the store contact details")
    public void userShouldBeAbleToSeeTheStoreContactDetails() {
        Assert.assertTrue(pageObject.storeDetails.isDisplayed());
    }
}
