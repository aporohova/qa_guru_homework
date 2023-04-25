package com.demoqa.tests;

import com.demoqa.utils.RandomUtils;
import com.github.javafaker.Faker;


import static com.demoqa.utils.RandomUtils.*;

public class TestData {
    static Faker faker = new Faker();
    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = getRandomGender(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            day = RandomUtils.setRandomDay(),
            month = RandomUtils.setRandomMonth(),
            year = RandomUtils.setRandomYear(),
            subjects = getRandomSubject(),

            hobbies = getRandomHobbies(),
            currentAddress = faker.address().fullAddress(),
            states = getRandomState(),
            cities = String.valueOf(getRandomCity(states));





}
