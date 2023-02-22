package com.bottegaVeneta.stepDefinitions;

import com.bottegaVeneta.pages.BottegaVeneta;
import com.bottegaVeneta.utilities.ConfigurationReader;
import com.bottegaVeneta.utilities.Driver;
import com.bottegaVeneta.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TC02_StepDefinitions {
    BottegaVeneta pageObject = new BottegaVeneta();

    @Given("Open the Application URL in any supported browser")
    public void open_the_application_url_in_any_supported_browser() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().navigate().refresh();
        ReusableMethods.jsScrollClick(pageObject.acceptAllCookiesButton);
    }

    @When("Do not enter anything into the Search text box field")
    public void do_not_enter_anything_into_the_search_text_box_field() {
        ReusableMethods.jsClick(pageObject.searchIcon);
        ReusableMethods.jsClick(pageObject.searchBox);
    }

    @And("Click on the enter button")
    public void click_on_the_enter_button() {
        ReusableMethods.getActions().sendKeys(Keys.ENTER).perform();
    }

    @Then("Proper placeholder text is displayed in the search text box field")
    public void proper_placeholder_text_is_displayed_in_the_search_text_box_field() {
        pageObject.verifyPlaceholderText();
    }

    @When("Enter any existing product name into the Search text box field")
    public void enterAnyExistingProductNameIntoTheSearchTextBoxField() {
        pageObject.enterAnyItemIntoTheSearchBox("bags");
    }

    @Then("Searched product should be displayed in the search results")
    public void searchedProductShouldBeDisplayedInTheSearchResults() {
        Assert.assertTrue(pageObject.allResultsText.getText().contains("bags"));
    }

    @When("Enter non existing product name into the Search text box field")
    public void enterNonExistingProductNameIntoTheSearchTextBoxField() {
        pageObject.enterAnyItemIntoTheSearchBox("iMac");
    }

    @Then("Search error text should be displayed in the Search Results page")
    public void searchErrorTextShouldBeDisplayedInTheSearchResultsPage() {
        Assert.assertTrue(pageObject.searchResultErrorMessage.isDisplayed());
    }

    @Then("All products at the store should be displayed in the Search Results page")
    public void thereIsNoProductThatMatchesTheSearchCriteriaShouldBeDisplayedInTheSearchResultsPage() {
        Assert.assertTrue(pageObject.allResultsText.isDisplayed());
    }

    @And("Click on any item from the search results")
    public void clickOnAnyItemFromTheSearchResults() {
        pageObject.selectAnyItemFromSearchResult();
    }

    @Then("User should be able to see the product name header")
    public void userShouldBeAbleToSeeTheProductNameHeader() {
        Assert.assertTrue(pageObject.productHeaderText.isDisplayed());
    }

    @And("Click on the product details button")
    public void clickOnTheProductDetailsButton() {
        pageObject.productDetailsButton.click();
    }

    @Then("User should be able to see the all product details \\(Made in, material, product code, other details)")
    public void userShouldBeAbleToSeeTheAllProductDetailsMadeInMaterialProductCodeOtherDetails() {
        pageObject.verifyAllProductDetailsVisibility();
    }
}
