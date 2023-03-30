package com.demoqa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class PracticeFormTests extends TestBase {

    @Test
    void successfulFormTest (){
        open ("/automation-practice-form");
        $("#firstName").setValue("Jack");
        $("#lastName").setValue("London");
        $("#userEmail").setValue("JLondon@gggg.com");
        $("[type='radio'][value='Male']").parent().click();
        $("#userNumber").setValue("9995557771");
        $("#dateOfBirthInput").selectOptionByValue("09 Feb 1932");


        //$("").selectRadio("");
        //$("").uploadFile();
        //$("").setValue("");
        //$("").setValue(""); choose state
        //$("").setValue(""); choose city
        //$("").click();


        $("").shouldHave(text(""));


    }
}
