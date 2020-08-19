package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.PropertyUtils.getPropertyByKey;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(id = "email")
    private WebElement emailTxt;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    private WebElement signin;

    public void login(){
        emailTxt.sendKeys(getPropertyByKey("username"));
        password.sendKeys(getPropertyByKey("passw0rd"));
        signin.click();
    }

}
