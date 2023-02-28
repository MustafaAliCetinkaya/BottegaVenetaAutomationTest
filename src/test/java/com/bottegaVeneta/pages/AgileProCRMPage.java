package com.bottegaVeneta.pages;

public class AgileProCRMPage {
    public AgileProCRMPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[type=\"text\"]")
    public WebElement usernameBox;

}
