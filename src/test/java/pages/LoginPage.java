package pages;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage open() {
        Selenide.open("?/controller=authentication&back=my-account");
        return this;
    }

    public LoginPage doLogin(String email, String password) {
        $("input#email").setValue(email);
        $("input#passwd").setValue(password);
        $("#SubmitLogin").click();
        return this;
    }
}
