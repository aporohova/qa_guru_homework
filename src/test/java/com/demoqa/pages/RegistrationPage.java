package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
   SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput =$("#userEmail"),
            genderSelection =$("[type='radio'][value='Male']"),
            userNumberInput =$("#userNumber"),

            birthDayInput =$("#dateOfBirthInput"),
            subjectInput =$("#subjectsInput"),
            hobbySelection=$("[type='checkbox'][value='3']"),
            pictureUpload =$("#uploadPicture"),
            userAddressInput =$("#currentAddress"),

            userStateInput = $("#state"),

            stateSelection=$(".css-11unzgr"),
            userCityInput=$("#city"),
            citySelection=$(".css-11unzgr"),

            submit=$(".btn-primary"),

            resultCheck=$(".table-responsive");

    public RegistrationPage openPage () {
       open ("/automation-practice-form");

       return this;
    }

    public RegistrationPage removeFooter () {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

   public RegistrationPage setFirstName (String value) {
      firstNameInput.setValue(value);

      return this;
   }
   public RegistrationPage setLastName (String value) {
       lastNameInput.setValue(value);

       return this;
   }

   public RegistrationPage setUserEmail (String value) {
      userEmailInput.setValue(value);

      return this;
   }
       public RegistrationPage setGender (String value) {
           genderSelection.parent().click();

           return this;
       }
   public RegistrationPage setUserNumber (String value) {
      userNumberInput.setValue(value);

      return this;
   }
public RegistrationPage setBirthday(String value) {
    birthDayInput.sendKeys(Keys.COMMAND + "a");
    birthDayInput.sendKeys(value);
    birthDayInput.pressEnter();

       return this;
}
public RegistrationPage setSubject(String value) {
        //subjectInput.click();
        subjectInput.sendKeys(value);
        subjectInput.pressEnter();

        return this;
}
public RegistrationPage selectHobby (String value) {
        hobbySelection.parent().click();

        return this;

}
   public RegistrationPage uploadUserPicture (String path) {
      pictureUpload.uploadFile(new File(path ));

      return this;
   }

   public RegistrationPage setCurrentAddress (String value) {
      userAddressInput.setValue(value);

      return this;
   }
   public RegistrationPage setState (String value) {
      userStateInput.click();
      stateSelection.$(byText(value)).click();

      return this;

   }
   public RegistrationPage setCity (String value) {
      userCityInput.click();
      citySelection.$(byText(value)).click();

      return this;
   }

   public RegistrationPage selectSubmit () {
       submit.click();

       return this;
   }
   public RegistrationPage checkResults (String value) {
      resultCheck.shouldHave(text(value));

       return this;
   }
   }

