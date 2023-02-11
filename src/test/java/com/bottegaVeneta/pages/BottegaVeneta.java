package com.bottegaVeneta.pages;

import com.bottegaVeneta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BottegaVeneta {
    public BottegaVeneta() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "button#onetrust-accept-btn-handler")
    public WebElement acceptAllCookiesButton;
    @FindBy(css = "div.c-nav__toggler--white")
    public WebElement leftHandSideMenuButton;
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    public WebElement myAccountButton;
    @FindBy(css = "div.c-card__header.c-card__header--createaccount h1.c-card__title")
    public WebElement newCustomerText;


}
