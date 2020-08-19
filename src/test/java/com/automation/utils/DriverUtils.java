package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.automation.utils.PropertyUtils.getPropertyByKey;
import static com.automation.utils.PropertyUtils.loadProperties;

public class DriverUtils {
    public static WebDriver driver;

    public static void initDriver() {
        loadProperties();
        //        Note: please add chromedriver into Driver directory
        System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir") + "\\Driver\\chromedriver").replace("\\", System.getProperty("file.separator")));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(getPropertyByKey("application.url"));
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        initDriver();
    }

}
