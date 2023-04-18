package com.demoqa.tests;

import static com.demoqa.utils.RandomUtils.*;

public class TestData {
    public static String firstName = getRandomString(10),
            lastName = getRandomString(10),
            userEmail = getRandomEmail(),
            gender = getRandomItemFromArray(genders),
            //gender = "Male",
            userNumber = (getRandomInt(111111, 999999) +""),
            userBirthDay = "12 April,1911"; //04.12.1911
}
