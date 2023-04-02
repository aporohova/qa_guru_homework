package com.demoqa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class PracticeFormTests extends TestBase {

    @Test
    void successfulFormTest (){
        open ("/automation-practice-form");
        $("#firstName").setValue("James");
        $("#lastName").setValue("Bond");
        $("#userEmail").setValue("JLondon@gggg.com");
        $("[type='radio'][value='Male']").parent().click();
        $("#userNumber").setValue("9995557771");
        $("#dateOfBirthInput").sendKeys(Keys.COMMAND + "a"); //в случае Windows OS поменять на CONTROL
        $("#dateOfBirthInput").sendKeys("12 Apr 1911");
        $("#dateOfBirthInput").pressEnter();
        $(".subjects-auto-complete__control").click();
        $("#subjectsInput").sendKeys("C");
        $("#react-select-2-option-2").click();
        $("[type='checkbox'][value='3']").parent().click();
        $("#uploadPicture").uploadFile(new File("src/test/data/kartinki_png_13_01075134-768x967-1.png"));
        $("#currentAddress").setValue("Lenina street");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#state").click();
        $(".css-11unzgr").$(byText("Rajasthan")).click();
        $("#city").click();
        $(".css-11unzgr").$(byText("Jaipur")).click();
        $(".btn-primary").click();

        //check the results
        $(".table-responsive").shouldHave(text("James Bond"),
                text("JLondon@gggg.com"),
                text("Male"),
                text("9995557771"),
                text("12 April,1911"),
                text("Computer science"),
                text("Music"),
                text("kartinki_png_13_01075134-768x967-1.png"),
                text("Lenina street"),
                text("Rajasthan Jaipur"));
        sleep(20000);





    }
}
