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

