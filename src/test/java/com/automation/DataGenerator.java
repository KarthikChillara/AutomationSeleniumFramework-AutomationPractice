package com.automation;

import com.github.javafaker.Faker;
public class DataGenerator {

    public static void main(String[] args) {
        Faker faker = new Faker();
        String fname = faker.name().firstName();
        String lname = faker.name().lastName();
        String email = faker.internet().emailAddress();
        //String address = faker.address().fullAddress();
        String secondaryaddress = faker.address().secondaryAddress();
        String streetAddress = faker.address().streetAddress();
        String buildingNumber= faker.address().buildingNumber();
        String city= faker.address().city();
        String country = faker.address().country();
        String zipCode = faker.address().zipCode();
        String dob = faker.date().birthday().toString();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        String cellPhone= faker.phoneNumber().cellPhone();
        String cellNumber = faker.phoneNumber().cellPhone();
        System.out.println(fname + "---"+ lname + "----" + email + "----"+ secondaryaddress + "----" +streetAddress+ "----"+buildingNumber+ "----" +city+ "---"+country+"----" +"----"+dob + " ----" + phoneNumber);
        System.out.println(zipCode);
    }
}
