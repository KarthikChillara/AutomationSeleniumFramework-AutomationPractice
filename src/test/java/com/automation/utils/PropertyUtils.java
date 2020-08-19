package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
    static Properties prop = new Properties();

    public static void loadProperties() {
        try {
            prop.load(new FileInputStream(System.getProperty("user.dir")+"/resource/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyByKey(String key) {
        return prop.getProperty(key);
    }

//    public static void main(String[] args) {
//        loadProperties();
//        String value = getPropertyByKey("application.url");
//        System.out.println(value);
   // }
}
