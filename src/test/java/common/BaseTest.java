package common;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest {
    protected static HomePage home;
    protected static LoginPage login;

    @BeforeMethod
    public void start() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://automationpractice.com";
        Configuration.timeout = 10000;

        home = new HomePage();
        login = new LoginPage();
    }
}
