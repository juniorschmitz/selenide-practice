package tests;

import common.BaseTest;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Condition.text;

public class LoginTests extends BaseTest {

    @Test
    public void shouldLoginSuccessfully() {
        home    .open()
                .accessLogin()
                .doLogin("potatomaster@test.com", "abc123");

        home.getLogoutButton().shouldBe(visible);
    }
}
