package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public HomePage open() {
        Selenide.open("/");
        return this;
    }

    public LoginPage accessLogin() {
        $(".login").click();
        return new LoginPage();
    }

    public SelenideElement getLogoutButton() {
        return $(".logout");
    }
}
