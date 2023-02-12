package com.bottegaVeneta.stepDefinitions;

import com.bottegaVeneta.pages.BottegaVeneta;
import com.bottegaVeneta.utilities.ConfigurationReader;
import com.bottegaVeneta.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC02_StepDefinitions {
    BottegaVeneta pageObject = new BottegaVeneta();
    @Given("Open the Application URL in any supported browser")
    public void openTheApplicationURLInAnySupportedBrowser() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("Do not enter anything into the Search text box field")
    public void doNotEnterAnythingIntoTheSearchTextBoxField() {
    }

    @And("Click on the button having search icon")
    public void clickOnTheButtonHavingSearchIcon() {
    }

    @Then("Proper placeholder text is displayed in the search text box field")
    public void properPlaceholderTextIsDisplayedInTheSearchTextBoxField() {
    }

    @When("Enter any existing product name into the Search text box field")
    public void enterAnyExistingProductNameIntoTheSearchTextBoxField() {
    }

    @Then("Searched product should be displayed in the search results")
    public void searchedProductShouldBeDisplayedInTheSearchResults() {
    }

    @When("Enter non existing product name into the Search text box field")
    public void enterNonExistingProductNameIntoTheSearchTextBoxField() {
    }

    @Then("Search error text should be displayed in the Search Results page")
    public void searchErrorTextShouldBeDisplayedInTheSearchResultsPage() {
    }

    @Then("There is no product that matches the search criteria should be displayed in the Search Results page")
    public void thereIsNoProductThatMatchesTheSearchCriteriaShouldBeDisplayedInTheSearchResultsPage() {
    }

}
