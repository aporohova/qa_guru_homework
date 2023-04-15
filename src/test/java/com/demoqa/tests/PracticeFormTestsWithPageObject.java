package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTestsWithPageObject extends TestBase {

    @Test
    void successfulFormTest (){


        registrationPage.openPage()
                        .setFirstName("Jack")
                        .setLastName("London")
                        .setUserEmail("JLondon@gggg.com")
                        .setGender()
                        .setUserNumber("9995557771")
                        .setBirthday("04.12.1911")
                        .setSubject("Computer science")
                        .selectHobby()
                        .uploadUserPicture ("src/test/data/kartinki_png_13_01075134-768x967-1.png")
                        .setCurrentAddress("Lenina street")
                        .setState("Rajasthan")
                        .setCity("Jaipur")
                        .selectSubmit()
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






        //$(".subjects-auto-complete__control").click();
        //$("#subjectsInput").sendKeys("C");
        //$("#react-select-2-option-2").click();


        //$("#uploadPicture").uploadFile(new File("src/test/data/kartinki_png_13_01075134-768x967-1.png"));


        //$("#state").click();
        //$(".css-11unzgr").$(byText("Rajasthan")).click();

        //$("#city").click();
        //$(".css-11unzgr").$(byText("Jaipur")).click();
        //$(".btn-primary").click();

        //check the results
       // $(".table-responsive").shouldHave(text("James Bond"),
                //text("JLondon@gggg.com"),
                //text("Male"),
                //text("9995557771"),
                //text("12 April,1911"),
                //text("Computer science"),
                //text("Music"),
                //text("kartinki_png_13_01075134-768x967-1.png"),
                //text("Lenina street"),
                //text("Rajasthan Jaipur"));





    }
}
