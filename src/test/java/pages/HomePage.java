package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public HomePage open() {
        Selenide.open("/index.php");
        return this;
    }

    public LoginPage accessLogin() {
        $(".login").click();
        return new LoginPage();
    }

    public SearchPage searchFor(String term) {
        $("#search_query_top").sendKeys(term);
        $("button[name=\"submit_search\"]").click();
        return new SearchPage();
    }

    public SelenideElement getLogoutButton() {
        return $(".logout");
    }
}
