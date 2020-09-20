package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    public SearchPage open() {
        Selenide.open("/index.php?controller=search");
        return this;
    }

    public ElementsCollection results() {
        return $$(".product_list .product-container");
    }
}
