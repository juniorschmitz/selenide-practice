package pages;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$;

public class OrderPage {
    public OrderPage open() {
        Selenide.open("/index.php?controller=order");
        return this;
    }

    public CheckoutConfirmationPage finishCheckout() {
        $(".standard-checkout").click();
        $("button[name=\"processAddress\"]").click();
        $("input[type=\"checkbox\"]").click();
        $("button[name=\"processCarrier\"]").click();
        $(".cheque").click();
        $(".button-medium[type=\"submit\"]").click();
        return new CheckoutConfirmationPage();
    }
}
