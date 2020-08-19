package com.automation.tests;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static com.automation.utils.DriverUtils.initDriver;
import static com.automation.utils.DriverUtils.tearDown;

public class LoginTest {

    @BeforeClass
    public void preCondition() {
        initDriver();
    }

    @Test
    public void loginTest() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        homePage.navigateToLoginPage();
        loginPage.login();

        try{
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @AfterClass
    public void postCondition() {
        tearDown();
    }
}
