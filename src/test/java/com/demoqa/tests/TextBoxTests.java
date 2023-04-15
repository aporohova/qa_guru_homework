package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends TestBase{

    @Test
    void successfulFillFormTest() {

        textBoxPage.openPage()
                        .setUserName("Mr Smith")
                        .setUserEmail("aa@aaa.com")
                        .setCurrentAddress("Some street 1")
                        .setPermanentAddress("Another street 1")
                        .submitButton();
        textBoxPage.checkOutput("Mr Smith")
                   .checkOutput("aa@aaa.com")
                   .checkOutput("Some street 1")
                   .checkOutput("Another street 1");
        //open("/text-box");

//        $("[id=userName]").setValue("Mr Smith");
        //$("#userName").setValue("Mr Smith");
        //$("#userEmail").setValue("aa@aaa.com");
        //$("#currentAddress").setValue("Some street 1");
        //$("#permanentAddress").setValue("Another street 1");
        //$("#submit").click();

        //$("#output").shouldHave(text("Mr Smith"), text("aa@aaa.com"),
                //text("Some street 1"), text("Another street 1"));

        //$("#output #name").shouldHave(text("Mr Smith"));
    }
}