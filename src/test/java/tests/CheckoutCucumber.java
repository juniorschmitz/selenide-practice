package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.OrderPage;
import pages.SearchPage;
import pages.CheckoutConfirmationPage;

public class CheckoutCucumber {
    private HomePage home;
    private SearchPage search;
    private OrderPage order;
    private CheckoutConfirmationPage checkout_confirmation;

    @Before
    public void configuration() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://automationpractice.com";
        Configuration.timeout = 10000;

        this.home = new HomePage();
        this.search = new SearchPage();
        this.order = new OrderPage();
        this.checkout_confirmation = new CheckoutConfirmationPage();
    }

    @Given("I logged in as {string} with password {string}")
    public void i_logged_in_as_with_password(String email, String password) {
        home    .open()
                .accessLogin()
                .doLogin(email, password);
    }

    @When("I add the product {string} to the shopping cart")
    public void i_add_a_product_to_the_shopping_cart(String term) {
        home    .open()
                .searchFor(term)
                .addProductToCart();
    }

    @When("finish the Checkout")
    public void finish_the_Checkout() {
        order.finishCheckout();
    }

    @Then("I should see the finishing Checkout message {string}")
    public void i_should_see_the_finishing_Checkout_message(String message) {
        checkout_confirmation.getMessageConfirmation().shouldHave(Condition.text(message));
    }
}
