package com.bottegaVeneta.stepDefinitions;

import com.bottegaVeneta.pages.BottegaVeneta;
import com.bottegaVeneta.utilities.ConfigurationReader;
import com.bottegaVeneta.utilities.Driver;
import com.bottegaVeneta.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class TC02_StepDefinitions {
    BottegaVeneta pageObject = new BottegaVeneta();

    @Given("Open the Application URL in any supported browser")
    public void open_the_application_url_in_any_supported_browser() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("Do not enter anything into the Search text box field")
    public void do_not_enter_anything_into_the_search_text_box_field() {
        ReusableMethods.jsScroll(pageObject.searchBox);
    }

    @And("Click on the enter button")
    public void click_on_the_enter_button() {
        ReusableMethods.jsClick(pageObject.searchBox);
        ReusableMethods.getActions().sendKeys(Keys.ENTER).perform();
    }

    @Then("Proper placeholder text is displayed in the search text box field")
    public void proper_placeholder_text_is_displayed_in_the_search_text_box_field() {
        pageObject.verifyPlaceholderText();
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
