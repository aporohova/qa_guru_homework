package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    CalendarComponent calendarComponent = new CalendarComponent();
   SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput =$("#userEmail"),
            genderSelection =$("#genterWrapper"),
            userNumberInput =$("#userNumber"),

            birthDayInput =$("#dateOfBirthInput"),
            subjectInput =$("#subjectsInput"),
            hobbySelection=$("#hobbiesWrapper"),
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
       public RegistrationPage setGender (String gender) {
           genderSelection.$(byText(gender)).click();

           return this;
       }
   public RegistrationPage setUserNumber (String value) {
      userNumberInput.setValue(value);

      return this;
   }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        $(birthDayInput).click();
        calendarComponent.setDate(day, month, year);
        return this;
    }


public RegistrationPage setSubject (String value) {
        subjectInput.sendKeys(value);
        subjectInput.pressEnter();

        return this;
}
public RegistrationPage selectHobby (String hobby) {
        hobbySelection.$(byText(hobby)).click();

        return this;

}
   public RegistrationPage uploadUserPicture (String path, String value) {
      pictureUpload.uploadFile(new File(path,value ));

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

