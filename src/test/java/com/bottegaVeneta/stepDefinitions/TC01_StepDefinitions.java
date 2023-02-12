package com.bottegaVeneta.stepDefinitions;

import com.bottegaVeneta.pages.BottegaVeneta;
import com.bottegaVeneta.utilities.ConfigurationReader;
import com.bottegaVeneta.utilities.Driver;
import com.bottegaVeneta.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TC01_StepDefinitions {
    BottegaVeneta pageObject = new BottegaVeneta();

    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertEquals("Bottega Veneta® GB | Official Website", Driver.getDriver().getTitle());
    }

    @And("Click on Go to accept all cookies button")
    public void clickOnGoToInternationalVersionButton() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.jsScrollClick(pageObject.acceptAllCookiesButton);
    }

    @Then("Click on my account button from the left hand side menu")
    public void click_on_my_account_button_from_the_left_hand_side_menu() {
        ReusableMethods.jsScrollClick(pageObject.leftHandSideMenuButton);
        ReusableMethods.jsScrollClick(pageObject.myAccountButton);

    }

    @Then("Verify New Customer is visible")
    public void verify_new_customer_is_visible() {
        ReusableMethods.jsScroll(pageObject.newCustomerText);
        Assert.assertTrue(pageObject.newCustomerText.isDisplayed());
    }

    @Then("Click on the create my profile button")
    public void click_on_the_create_my_profile_button() {
        ReusableMethods.jsScrollClick(pageObject.createMyProfileButton);
    }

    @Then("Verify that Create my profile is visible")
    public void verify_that_create_my_profile_is_visible() {
        Assert.assertEquals(pageObject.createMyProfileText.getText(),"Create my profile");
    }

    @Then("Fill all the required fields")
    public void fill_all_the_required_fields() {
        pageObject.fillRequiredFields();
        pageObject.setSelectCountryDropdown();
    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        ReusableMethods.jsScrollClick(pageObject.ageConfirmationBox);
    }

    @Then("Click Create My Profile button")
    public void click_create_my_profile_button() {
        ReusableMethods.jsScrollClick(pageObject.createMyProfileButton);
    }

    @Then("Verify that Request Received is visible")
    public void verify_that_request_received_is_visible() {
        ReusableMethods.jsScrollClick(pageObject.requestReceivedWindow);
        Assert.assertTrue(pageObject.requestReceivedWindow.isDisplayed());
    }

    @Then("Click Check my mailbox to activate my account button")
    public void click_check_my_mailbox_to_activate_my_account_button() {

    }

    @Then("Close the Request Received window")
    public void close_the_request_received_window() {

    }

    @Then("Back to the homepage")
    public void back_to_the_homepage() {

    }

    @Then("User should be able to see DISCOVER THE NEW ANDIAMO BAG text in the lower left corner")
    public void user_should_be_able_to_see_discover_the_new_andiamo_bag_text_in_the_lower_left_corner() {

    }

}
