package com.bottegaVeneta.stepDefinitions;

import com.bottegaVeneta.pages.AgileProCRMBasePage;
import com.bottegaVeneta.utilities.ConfigurationReader;
import com.bottegaVeneta.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCAddingAndRemovingImages {

    AgileProCRMBasePage pageObject=new AgileProCRMBasePage();

    @Given("Open the Application URL in any supported browser in order to login the system")
    public void open_the_application_url_in_any_supported_browser_in_order_to_login_the_system() {
        Driver.getDriver().get(ConfigurationReader.getProperty("AgileProCRM"));
    }
    @When("User writes the  {string} into the username box in the authorization window.")
    public void userWritesTheIntoTheUsernameBoxInTheAuthorizationWindow(String arg0) {
    }

    @When("User writes the  {string} into the password box in the authorization window.")
    public void userWritesTheIntoThePasswordBoxInTheAuthorizationWindow(String arg0) {
    }

    @Then("User clicks the login button in the authorization window.")
    public void userClicksTheLoginButtonInTheAuthorizationWindow() {
    }

    @And("User should be able to logged into the system.")
    public void userShouldBeAbleToLoggedIntoTheSystem() {
    }

    @And("User clicks on the Company link from the dashboard main menu on the left.")
    public void userClicksOnTheCompanyLinkFromTheDashboardMainMenuOnTheLeft() {
    }

    @And("User clicks on the Add News button from the company page.")
    public void userClicksOnTheAddNewsButtonFromTheCompanyPage() {
    }

    @And("User clicks on the Details tab from the new open window which is near the preview text tab.")
    public void userClicksOnTheDetailsTabFromTheNewOpenWindowWhichIsNearThePreviewTextTab() {
    }

    @And("User clicks on the upload image icon which is between dropdown menu and upload document icon, when the details tab opens.")
    public void userClicksOnTheUploadImageIconWhichIsBetweenDropdownMenuAndUploadDocumentIconWhenTheDetailsTabOpens() {
    }

    @And("User clicks on the dropdown menu icon which is at the top right corner of the dashed rectangular box.")
    public void userClicksOnTheDropdownMenuIconWhichIsAtTheTopRightCornerOfTheDashedRectangularBox() {
    }

    @And("User clicks on the insert file path option from the opened dropdown menu.")
    public void userClicksOnTheInsertFilePathOptionFromTheOpenedDropdownMenu() {
    }

    @And("User pastes pathname of the selected image into the automatically opened input box which is label as {string}.")
    public void userPastesPathnameOfTheSelectedImageIntoTheAutomaticallyOpenedInputBoxWhichIsLabelAs(String arg0) {
    }

    @And("User clicks on the add button.")
    public void userClicksOnTheAddButton() {
    }

    @Then("User should be able to see the loading bar after the add button is clicked.")
    public void userShouldBeAbleToSeeTheLoadingBarAfterTheAddButtonIsClicked() {
    }

    @Then("User should be able to see the uploaded image in the rectangular box.")
    public void userShouldBeAbleToSeeTheUploadedImageInTheRectangularBox() {
    }

    @And("User clicks on the X icon which is located on the lower right corner of the uploaded image in order to remove the image, after image is loaded and seen in the rectangular box.")
    public void userClicksOnTheXIconWhichIsLocatedOnTheLowerRightCornerOfTheUploadedImageInOrderToRemoveTheImageAfterImageIsLoadedAndSeenInTheRectangularBox() {
    }

    @Then("User should be able to see \\(Drag&Drop) Drag an image text when the image is removed from the box.")
    public void userShouldBeAbleToSeeDragDropDragAnImageTextWhenTheImageIsRemovedFromTheBox() {
    }
}
