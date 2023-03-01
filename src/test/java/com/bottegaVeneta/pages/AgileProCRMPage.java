package com.bottegaVeneta.pages;

import com.bottegaVeneta.utilities.BrowserUtils;
import com.bottegaVeneta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgileProCRMPage {
    public AgileProCRMPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[type=\"text\"]")
    public WebElement usernameBox;

    @FindBy(css = "input[type=\"password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logoutButton;

    @FindBy(css = "span#user-name")
    public WebElement usernameButton;

    @FindBy(css = "input.login-btn")
    public WebElement loginButton;

    public void login() {
        String password = "UserUser";
        String domainName = "@cybertekschool.com";
        List<String> email = new ArrayList<>(Arrays.asList("hr", "helpdesk", "marketing"));

        for (int i = 1; i <= 101; i++) {
            usernameBox.clear();
            usernameBox.sendKeys(email.get(0) + i + domainName);
            passwordBox.sendKeys(password);

            BrowserUtils.waitForPageToLoad(10);
            BrowserUtils.clickWithJS(loginButton);
            BrowserUtils.clickWithJS(usernameButton);
            BrowserUtils.clickWithJS(logoutButton);


            usernameBox.clear();
            usernameBox.sendKeys(email.get(1) + i + domainName);
            passwordBox.sendKeys(password);

            BrowserUtils.waitForPageToLoad(10);
            BrowserUtils.clickWithJS(loginButton);
            BrowserUtils.clickWithJS(usernameButton);
            BrowserUtils.clickWithJS(logoutButton);


            usernameBox.clear();
            usernameBox.sendKeys(email.get(2) + i + domainName);
            passwordBox.sendKeys(password);

            BrowserUtils.waitForPageToLoad(10);
            BrowserUtils.clickWithJS(loginButton);
            BrowserUtils.clickWithJS(usernameButton);
            BrowserUtils.clickWithJS(logoutButton);

        }
    }

}
