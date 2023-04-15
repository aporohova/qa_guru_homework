package com.demoqa.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {
    SelenideElement
    userNameInput=$("#userName"),
    userEmailInput=$("#userEmail"),
    currentAddressInput=$("#currentAddress"),
    permanentAddressInput=$("#permanentAddress"),
    submitButton=$("#submit"),

    outputCheck=$("#output");

    public TextBoxPage openPage () {
        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public TextBoxPage setUserName (String value) {
        userNameInput.setValue(value);

        return this;
    }
    public TextBoxPage setUserEmail (String value) {
        userEmailInput.setValue(value);

        return this;
}

    public TextBoxPage setCurrentAddress (String value) {
        currentAddressInput.setValue(value);

        return this;
}

public TextBoxPage setPermanentAddress (String value) {
        permanentAddressInput.setValue(value);

        return this;
}

public TextBoxPage submitButton() {
        submitButton.click();

        return this;
}

public TextBoxPage checkOutput(String value){
        outputCheck.shouldHave(text(value));

        return this;
}
}
