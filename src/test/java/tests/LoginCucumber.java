package tests;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.visible;

public class LoginCucumber {
    private String email;
    private String password;
    private HomePage home;
    private LoginPage login;

    @Before
    public void configuration() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://automationpractice.com";
        Configuration.timeout = 10000;

        this.home = new HomePage();
        this.login = new LoginPage();
    }

    @Given("I have a valid user")
    public void have_a_valid_user() {
        this.email = "potatomaster@test.com";
        this.password = "abc123";
    }

    @When("I login in the fake ecommerce")
    public void login_in_the_fake_ecommerce() {
        home    .open()
                .accessLogin()
                .doLogin(email, password);
    }

    @Then("I should see my user logged")
    public void should_see_logged_user(String string) {
        home.getLogoutButton().shouldBe(visible);
    }
}
