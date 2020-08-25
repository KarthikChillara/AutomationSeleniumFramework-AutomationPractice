package com.automation.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.PropertyUtils.getPropertyByKey;

public class PersonalInfoPage {
    public PersonalInfoPage(){
        PageFactory.initElements(getDriver(),this);
    }


    @FindBy(id = "email_create")
    private WebElement emailTxt;

    @FindBy(name = "SubmitCreate")
    private WebElement createAccountBtn;

    @FindBy(id="id_gender1")
    private WebElement mrRadioBtn;

    @FindBy(id="id_gender2")
    private WebElement mrsRadioBtn;

    @FindBy(id="customer_firstname")
    private WebElement customerfirstname;

    @FindBy(id="customer_lastname")
    private WebElement customerlastname;

    @FindBy(id="email")
    private WebElement email;

    @FindBy(id="passwd")
    private WebElement password;

    @FindBy(id="days")
    private WebElement days;

    @FindBy(id="months")
    private WebElement months;

    @FindBy(id="years")
    private WebElement years;

    @FindBy(id="newsletter")
    private WebElement newsletter;

    @FindBy(id="optin")
    private WebElement requestSpecialOfferCheckBox;

    @FindBy(id="firstname")
    private WebElement firstname;

    @FindBy(id="lastname")
    private WebElement lastname;

    @FindBy(id="address1")
    private WebElement address1;

    @FindBy(id="city")
    private WebElement city;

    @FindBy(id="id_state")
    private WebElement state;

    @FindBy(id="uniform-id_state")
    private WebElement uniformstate;

    @FindBy(id="postcode")
    private WebElement postcode;


    @FindBy(id="id_country")
    private WebElement country;

    @FindBy(id="uniform-id_country")
    private WebElement uniformcountry;

    @FindBy(id="phone_mobile")
    private WebElement mobilephone;

    @FindBy(id="alias")
    private WebElement aliasaddress;

    @FindBy(id="submitAccount")
    private WebElement register;

    public void fillPersonalInfo() {

        Faker faker = new Faker();
        String fname = faker.name().firstName();
        String lname = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String passwordOf = faker.internet().password();
        String addressOf = faker.address().fullAddress();
        String streetAddress = faker.address().streetAddress();
        String cityOf= faker.address().city();
        String zipCode = faker.address().zipCode();
        String dob = faker.date().birthday().toString();
        String phoneNumber = faker.phoneNumber().cellPhone();

        // fill email address and proceed

        emailTxt.sendKeys(email);
        createAccountBtn.click();

        // Personal Information filling
        mrRadioBtn.click();
        customerfirstname.sendKeys(fname);
        customerlastname.sendKeys(lname);
      //  email.sendKeys("tst1.automation@gmail.com");
        password.sendKeys(passwordOf);
        selectFromDropDownByValue(days, "4");
        selectFromDropDownByValue(months, "5");
        selectFromDropDownByValue(years, "1990");
        newsletter.click();

        // Fill
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        address1.sendKeys(addressOf);
        city.sendKeys(cityOf);
        selectFromDropDownByValue(state, "43");
        postcode.sendKeys("12345");
        mobilephone.sendKeys(phoneNumber);
        aliasaddress.sendKeys(streetAddress);
        register.click();


    }


public void selectFromDropDownByVisibleTxt(WebElement element, String visibleText) {
    Select select = new Select(element);
    select.selectByVisibleText(visibleText);
}


    public void selectFromDropDownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }






}
