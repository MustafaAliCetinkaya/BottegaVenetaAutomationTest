package com.bottegaVeneta.pages;

import com.bottegaVeneta.utilities.BrowserUtils;
import com.bottegaVeneta.utilities.Driver;
import com.bottegaVeneta.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgileProCRMBasePage {
    public AgileProCRMBasePage() {
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

    @FindBy(css = "#bx_left_menu_menu_about_sect > a:nth-child(3) > span:nth-child(1)")
    public WebElement companyLink;

    @FindBy(css = "li#bx_left_menu_menu_about_sect a")
    public WebElement addNewsLink;

    public void login() {
        String password = "UserUser";
        String domainName = "@cybertekschool.com";
        List<String> email = new ArrayList<>(Arrays.asList("hr", "helpdesk", "marketing"));

        for (int i = 1; i <= 101; i++) {
            usernameBox.clear();
            usernameBox.sendKeys(email.get(0) + i + domainName);
            passwordBox.sendKeys(password);

            loginButton.click();
            BrowserUtils.waitForClickablility(companyLink,30);
            companyLink.click();

            BrowserUtils.waitForVisibility(addNewsLink,20);
            if(addNewsLink.isDisplayed()){
                System.out.println("User: "+email.get(0) + i+" ==> Add News button is displayed");
                addNewsLink.click();

                Select select=new Select(Driver.getDriver().findElement(By.name("PROP[3][]")));
                List<WebElement>allDropdownOptions=select.getOptions();
                for (WebElement element : allDropdownOptions) {
                    String defaultSelection=element.findElement(By.cssSelector("option[selected=\"\"]")).getText();
                    if(defaultSelection.equals("News")){
                        System.out.println("Dropdown selection error: "+email.get(0) + i);
                    }

                }
            }
            Driver.getDriver().navigate().refresh();
            usernameButton.click();
            logoutButton.click();


            usernameBox.clear();
            usernameBox.sendKeys(email.get(1) + i + domainName);
            passwordBox.sendKeys(password);

            loginButton.click();
            BrowserUtils.waitForClickablility(companyLink,20);
            companyLink.click();
            BrowserUtils.waitForVisibility(addNewsLink,20);
            if(!addNewsLink.isDisplayed()){
                System.out.println("User: "+email.get(0) + i+" ==> Add News button is not displayed");
            }
            Driver.getDriver().navigate().refresh();
            usernameButton.click();
            logoutButton.click();


            usernameBox.clear();
            usernameBox.sendKeys(email.get(2) + i + domainName);
            passwordBox.sendKeys(password);

            loginButton.click();
            BrowserUtils.waitForClickablility(companyLink,20);
            companyLink.click();
            BrowserUtils.waitForVisibility(addNewsLink,20);
            if(!addNewsLink.isDisplayed()){
                System.out.println("User: "+email.get(0) + i+" ==> Add News button is not displayed");
            }
            Driver.getDriver().navigate().refresh();
            usernameButton.click();
            logoutButton.click();

        }
    }
}
