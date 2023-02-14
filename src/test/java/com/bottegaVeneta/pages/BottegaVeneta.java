package com.bottegaVeneta.pages;

import com.bottegaVeneta.utilities.Driver;
import com.bottegaVeneta.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class BottegaVeneta {
    public BottegaVeneta() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "button#onetrust-accept-btn-handler")
    public WebElement acceptAllCookiesButton;
    @FindBy(css = "div.c-nav__toggler--white")
    public WebElement leftHandSideMenuButton;
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    public WebElement myAccountButton;
    @FindBy(xpath = "//*[contains(text(),'Create my profile')]")
    public WebElement createMyProfileButton;
    @FindBy(xpath = "//*[contains(text(),'Store Locator')]")
    public WebElement storeLocatorButton;
    @FindBy(css = "h1.c-registerinfo__headertitle")
    public WebElement createMyProfileText;
    @FindBy(css = "div.c-card__header.c-card__header--createaccount h1.c-card__title")
    public WebElement newCustomerText;
    @FindBy(css = "input#dwfrm_profile_customer_civility_customer0")
    public WebElement titleRadioButton;
    @FindBy(xpath = "//*[contains(text(),'First name')]")
    public WebElement firstNameBox;

    public void fillRequiredFields() {
        ReusableMethods.jsScrollClick(titleRadioButton);
        ReusableMethods.getActions().click(firstNameBox)
                .sendKeys(ReusableMethods.getFaker().name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().date().birthday(18,100)+"")
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().internet().password(12, 16, true, true, true)).perform();

    }

    @FindBy(css = "select.c-form__select")
    public WebElement selectBox;

    public void setSelectCountryDropdown() {
        Select selectCountryDropdown=new Select(selectBox);
        selectCountryDropdown.selectByIndex(11);
        ReusableMethods.jsScrollClick(privacyPolicyBox);
        ReusableMethods.jsScrollClick(signupNewsletterBox);
    }

    @FindBy(xpath = "//*[contains(text(),'I have read and understood')]")
    public WebElement privacyPolicyBox;
    @FindBy(xpath = "//*[contains(text(),'I confirm that I am at least 18')]")
    public WebElement ageConfirmationBox;
    @FindBy(xpath = "//*[contains(text(),'I would like to receive updates about Bottega Veneta new activities')]")
    public WebElement signupNewsletterBox;
    @FindBy(xpath = "//*[contains(text(),'Request Received')]")
    public WebElement requestReceivedWindow;
    @FindBy(xpath = "//*[contains(text(),'Choose')]")
    public WebElement storeChooseButton;
    @FindBy(xpath = "(//button[@data-ref=\"closePopinTrigger\"])[11]")
    public WebElement closeRequestReceivedWindow;
    @FindBy(css = "div.c-topsearch__result input.c-form__input")
    public WebElement searchBox;
    @FindBy(css = "button.c-topsearch__button")
    public WebElement searchIcon;
    @FindBy(xpath = "//p[contains(text(),'Unfortunately there are no results corresponding to your query.')]")
    public WebElement searchResultErrorMessage;

    public void verifyPlaceholderText(){
        String actualPlaceholderText=searchBox.getAttribute("placeholder");
        String expectedPlaceholderText="Type here";
        Assert.assertEquals(expectedPlaceholderText,actualPlaceholderText);

    }

    public void enterAnyItemIntoTheSearchBox(String product){
        searchIcon.click();
        searchBox.sendKeys(product);
    }

    @FindBy(css = "ul.c-search__filtersbody li.c-search__filtersitem.c-search__filtersitem--active a.c-search__itemlink")
    public WebElement allResultsText;

    public void verifySearchResultErrorContent(){
        String expectedErrorMessageContent="We didn’t find any any items corrisponding exactly to your query, please search for a different item.";
        String actualErrorMessageContent=searchResultErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessageContent,actualErrorMessageContent);

    }

    @FindBy(css = "button#registerFormBtn")
    public WebElement registerFormButton;

    @FindAll(@FindBy(css = "div.c-form__error p"))
    public List<WebElement> allWarningMessages;

    public void verifyAllWarningMessages(){
        int expectedNumberOfAllWarningMessages=7;
        int actualNumberOfAllWarningMessages=allWarningMessages.size();
        System.out.println(actualNumberOfAllWarningMessages);
        Assert.assertEquals(expectedNumberOfAllWarningMessages,actualNumberOfAllWarningMessages);
    }

    @FindBy(css = "h1.c-storelocator__title")
    public WebElement storeFinderHeader;
    @FindBy(css = "select[data-ref=\"country\"]")
    public WebElement selectCountryButton;
    @FindBy(css = "select[data-ref=\"city\"]")
    public WebElement selectCityButton;

    public void verifyStoreFinderCountrySelection(){
        Select selectCountry=new Select(selectCountryButton);

        List<WebElement>allCountries= selectCountry.getAllSelectedOptions();

        Random random=new Random();
        int index= random.nextInt(allCountries.size());
        selectCountry.selectByIndex(index);

    }
    public void verifyStoreFinderCitySelection(){
        Select selectCity=new Select(selectCityButton);

        List<WebElement>allCities= selectCity.getAllSelectedOptions();

        Random random=new Random();
        int index= random.nextInt(allCities.size());
        selectCity.selectByIndex(index);
    }

    @FindBy(css = "div.c-storeList")
    public WebElement storeDetails;
    @FindBy(css = "div[class=\"c-topaccount__login u-hidden@lg\"]")
    public WebElement myAccountIcon;
    @FindBy(css = "ul#help-links-container li:nth-child(1)")
    public WebElement forgottenPasswordLink;
    @FindBy(css = "form#email-form input")
    public WebElement resetPasswordBox;

    //@FindBy(css = "button#submitEmailButton:nth-of-type(2)")
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement resetPasswordSubmitButton;
    @FindBy(css = "div.c-popin__head button[data-ref=\"closePopinTrigger\"]:nth-child(3)")
    public WebElement closeResetPasswordEmailSentWindow;
    @FindBy(xpath = "//div[.='E-mail sent']")
    public WebElement resetPasswordEmailSentText;
    @FindBy(xpath = "(//label[contains(text(),'E-mail')])[3]")
    public WebElement insertEmailBox;


}
