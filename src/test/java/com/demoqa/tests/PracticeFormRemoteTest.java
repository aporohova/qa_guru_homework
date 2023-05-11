package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.demoqa.tests.TestData.*;

public class PracticeFormRemoteTest extends RemoteTestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @Tag("remote")
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
                        .uploadUserPicture (pathValue, fileValue)
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
                        .checkResults(fileValue)
                        .checkResults(currentAddress)
                        .checkResults( states + " " + cities);
    }
}

