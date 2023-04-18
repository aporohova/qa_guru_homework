package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.demoqa.tests.TestData.*;
import static com.demoqa.utils.RandomUtils.genders;

public class PracticeFormTestsWithTestData extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void successfulFormTest (){

        registrationPage.openPage()
                        .removeFooter()
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setUserEmail(userEmail)
                        .setGender(gender)
                        .setUserNumber(userNumber)
                        .setBirthday(userBirthDay)
                        .setSubject("Computer science")
                        .selectHobby()
                        .uploadUserPicture ("src/test/resources/kartinki_png_13_01075134-768x967-1.png")
                        .setCurrentAddress("Lenina street")
                        .setState("Rajasthan")
                        .setCity("Jaipur")
                        .selectSubmit();
        registrationPage.checkResults(firstName + " " + lastName)
                        .checkResults(userEmail)
                        .checkResults(gender)
                        .checkResults(userNumber)
                        .checkResults(userBirthDay)
                        .checkResults("Computer science")
                        .checkResults("Music")
                        .checkResults("kartinki_png_13_01075134-768x967-1.png")
                        .checkResults("Lenina street")
                        .checkResults("Rajasthan Jaipur");
        sleep (6000);
    }
}

