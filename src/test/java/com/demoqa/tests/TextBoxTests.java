package com.demoqa.tests;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;


public class TextBoxTests extends TestBase{
    TextBoxPage textBoxPage = new TextBoxPage();


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
    }
}