package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class PracticeFormTestsWithPageObject extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void successfulFormTest (){


        registrationPage.openPage()
                        .removeFooter()
                        .setFirstName("Jack")
                        .setLastName("London")
                        .setUserEmail("JLondon@gggg.com")
                        .setGender("Male")
                        .setUserNumber("9995557771")
                        .setBirthday("04.12.1911")
                        .setSubject("Computer science")
                        .selectHobby("Music")
                        .uploadUserPicture ("src/test/resources/kartinki_png_13_01075134-768x967-1.png")
                        .setCurrentAddress("Lenina street")
                        .setState("Rajasthan")
                        .setCity("Jaipur")
                        .selectSubmit();
        registrationPage.checkResults("Jack London")
                        .checkResults("Jack London")
                        .checkResults("JLondon@gggg.com")
                        .checkResults("Male")
                        .checkResults("9995557771")
                        .checkResults("12 April,1911")
                        .checkResults("Computer science")
                        .checkResults("Music")
                        .checkResults("kartinki_png_13_01075134-768x967-1.png")
                        .checkResults("Lenina street")
                        .checkResults("Rajasthan Jaipur");

    }
}
