package com.yuliya1303.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureExamplesRepositoryTests {

    @Test
    @AllureId("10708")
    @DisplayName("1 watcher exists in Allure examples repository")
    @Owner("allure8")
    void watcherShouldExist() {
        step("Open https://github.com/Yuliya1303/Allure_Examples");
        step("Verify that 1 watcher exists");
    }

    @Test
    @AllureId("10706")
    @DisplayName("Allure examples repository exists in Yuliya1303 profile")
    @Owner("allure8")
    void repositoryShouldExistsInSearchResults() {
        step("Open https://github.com/Yuliya1303?tab=repositories");
        step("Enter Allure_Examples in Search field");
        step("Verify that Allure_Examples text exists in search results");
    }
}
