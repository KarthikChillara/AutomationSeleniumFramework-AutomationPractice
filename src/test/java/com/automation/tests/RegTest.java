package com.automation.tests;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.PersonalInfoPage;
import com.automation.pages.RegPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.utils.DriverUtils.initDriver;
import static com.automation.utils.DriverUtils.tearDown;

public class RegTest {
    @BeforeClass
    public void preCondition() {
        initDriver();
    }

    @Test
    public void RegTest() {
        HomePage homePage = new HomePage();
        PersonalInfoPage personalInfoPage = new PersonalInfoPage();

        homePage.navigateToLoginPage();
        personalInfoPage.fillPersonalInfo();

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
