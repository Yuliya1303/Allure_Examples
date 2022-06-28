package com.yuliya1303.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureExamplesRepositoryTests {

    @Test
    @AllureId("10708")
    @DisplayName("1 watcher exists in Allure examples repository")
    @Owner("allure8")
    void watcherShouldExist() {
        step("Open 'https://github.com/Yuliya1303/Allure_Examples'");
        step("Verify that 1 watcher exists");
    }
}
