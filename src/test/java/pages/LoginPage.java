package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public LoginPage open() {
        Selenide.open("/index.php?controller=authentication&back=my-account");
        return this;
    }

    public LoginPage doLogin(String email, String password) {
        $("input#email").setValue(email);
        $("input#passwd").setValue(password);
        $("#SubmitLogin").click();
        return this;
    }

    public SelenideElement getAlertDanger() {
        return $(".alert-danger li");
    }
}
