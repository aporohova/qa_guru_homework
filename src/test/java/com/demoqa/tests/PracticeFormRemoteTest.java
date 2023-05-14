package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.demoqa.tests.TestData.*;
import static io.qameta.allure.Allure.step;

public class PracticeFormRemoteTest extends RemoteTestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @Tag("remote")
    @DisplayName("Successful registration")
    void successfulFormTest (){

        step("Open form", () -> {
            registrationPage.openPage()
                    .removeFooter();
                });
        step("Fill form", () -> {
            registrationPage.setFirstName(firstName)
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

        });
        step("Check Results", () -> {
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

        });

    }
}

