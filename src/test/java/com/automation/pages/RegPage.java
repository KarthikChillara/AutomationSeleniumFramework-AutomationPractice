package com.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.PropertyUtils.getPropertyByKey;

public class RegPage {
    public RegPage(){
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(id = "email_create")
    private WebElement emailTxt;

    @FindBy(name = "SubmitCreate")
    private WebElement Createanaccount;

    public void registrationFlow(){

        emailTxt.sendKeys(getPropertyByKey("emailaddress"));
        Createanaccount.click();
    }

}
