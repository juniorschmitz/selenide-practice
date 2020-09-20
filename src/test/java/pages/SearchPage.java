package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    public SearchPage open() {
        Selenide.open("/index.php?controller=search");
        return this;
    }

    public OrderPage addProductToCart() {
        $$(".product_list .product-container img").get(0).scrollTo();
        $$(".product_list .product-container img").get(0).hover();
        $$("a[title=\"Add to cart\"]").get(0).click();
        $("a[title=\"Proceed to checkout\"]").click();
        return new OrderPage();
    }

    public ElementsCollection results() {
        return $$(".product_list .product-container");
    }
}
