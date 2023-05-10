package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class RemoteTestBase {
    @BeforeAll
    static void beforeAll () {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        //Configuration.browser = "chrome";
        Configuration.pageLoadStrategy = "eager";
    }

    @BeforeEach
    void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());

    }
}
