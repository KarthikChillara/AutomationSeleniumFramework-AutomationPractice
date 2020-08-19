package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.DriverUtils.getDriver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "login")
    private WebElement loginBtn;

    @FindBy(id = "contact-link")
    private WebElement contactUs;

    public void navigateToLoginPage() {
        loginBtn.click();
    }
}
