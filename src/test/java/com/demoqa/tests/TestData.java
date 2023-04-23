package com.demoqa.tests;

import com.github.javafaker.Faker;

import java.util.Date;

import static com.demoqa.utils.RandomUtils.*;

public class TestData {
    static Faker faker = new Faker();
    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = getRandomGender(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            currentAddress = faker.address().fullAddress(),
            userBirthDay = randomBirthDay(),
            hobbies = getRandomHobbies(),
            subjects = getRandomSubject(),
            states = getRandomState(),
            cities = String.valueOf(getRandomCity(states));





}
