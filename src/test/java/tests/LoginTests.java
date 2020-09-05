package tests;

import common.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Condition.text;

public class LoginTests extends BaseTest {

    @DataProvider(name = "login-unhappy")
    public Object[][] loginProvider() {
        return new Object[][]{
                {"naovai@teste.com", "123123", "Authentication failed."},
                {"", "1231234", "An email address required."},
                {"", "", "An email address required."},
                {"emptypass@test.com", "", "Password is required."}
        };
    }

    @Test(dataProvider = "login-unhappy")
    public void shouldSeeLoginAlerts(String email, String password, String alertText) {
        home    .open()
                .accessLogin()
                .doLogin(email, password)
                .getAlertDanger().shouldHave(text(alertText));
    }

    @Test
    public void shouldLoginSuccessfully() {
        home    .open()
                .accessLogin()
                .doLogin("potatomaster@test.com", "abc123");

        home.getLogoutButton().shouldBe(visible);
    }
}
