package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.demoqa.tests.TestData.*;

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
                        .setBirthDate(day,month,year)
                        .setSubject(subjects)
                        .selectHobby(hobbies)
                        .uploadUserPicture ("src/test/resources/kartinki_png_13_01075134-768x967-1.png")
                        .setCurrentAddress(currentAddress)
                        .setState(states)
                        .setCity(cities)
                        .selectSubmit();
        registrationPage.checkResults(firstName + " " + lastName)
                        .checkResults( userEmail)
                        .checkResults( gender)
                        .checkResults( userNumber)
                        .checkResults(day)
                        .checkResults(month)
                        .checkResults(year)
                        .checkResults( subjects)
                        .checkResults( hobbies)
                        .checkResults( "kartinki_png_13_01075134-768x967-1.png")
                        .checkResults(currentAddress)
                        .checkResults( states + " " + cities);
    }
}

