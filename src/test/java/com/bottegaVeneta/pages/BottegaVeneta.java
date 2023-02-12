package com.bottegaVeneta.pages;

import com.bottegaVeneta.utilities.Driver;
import com.bottegaVeneta.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
                .sendKeys(ReusableMethods.getFaker().number().numberBetween(1, 31) + ""+ReusableMethods.getFaker().number().numberBetween(1, 12) + ""+ReusableMethods.getFaker().number().numberBetween(1900, 2023) + "")
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
    @FindBy(xpath = "(//button[@data-ref=\"closePopinTrigger\"])[11]")
    public WebElement closeRequestReceivedWindow;

}
