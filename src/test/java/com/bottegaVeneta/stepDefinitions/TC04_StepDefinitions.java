package com.bottegaVeneta.stepDefinitions;

import com.bottegaVeneta.pages.BottegaVeneta;
import com.bottegaVeneta.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TC04_StepDefinitions {
    BottegaVeneta pageObject = new BottegaVeneta();

    @Then("Click on my account icon from the top right corner menu")
    public void click_on_my_account_icon_from_the_top_right_corner_menu() {
        ReusableMethods.jsScrollClick(pageObject.myAccountIcon);
    }
    @Then("Click on Forgotten Password link from Login page")
    public void click_on_forgotten_password_link_from_login_page() {
        ReusableMethods.jsScrollClick(pageObject.forgottenPasswordLink);

    }
    @Then("Enter the email address of your existing account")
    public void enter_the_email_address_of_your_existing_account() {
        ReusableMethods.jsScrollClick(pageObject.insertEmailBox);
        pageObject.resetPasswordBox.sendKeys(ReusableMethods.getFaker().internet().emailAddress());
    }
    @Then("Click on the submit button")
    public void click_on_the_submit_button() {
        ReusableMethods.jsScrollClick(pageObject.resetPasswordSubmitButton);

    }
    @Then("User should be able to see the email sent window")
    public void user_should_be_able_to_see_the_email_sent_window() {
        Assert.assertTrue(pageObject.resetPasswordEmailSentText.isDisplayed());
    }
    @Then("Close the email sent window")
    public void close_the_email_sent_window() {
        ReusableMethods.jsScrollClick(pageObject.closeResetPasswordEmailSentWindow);

    }


}
