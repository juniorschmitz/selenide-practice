package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutConfirmationPage {
    public CheckoutConfirmationPage open() {
        Selenide.open("index.php?controller=order-confirmation");
        return this;
    }

    public SelenideElement getMessageConfirmation() {
        return $(".alert-success");
    }
}