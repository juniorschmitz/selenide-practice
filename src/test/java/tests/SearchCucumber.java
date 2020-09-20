package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SearchPage;

public class SearchCucumber {
    private HomePage home;
    private SearchPage search;

    @Before
    public void configuration() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://automationpractice.com";
        Configuration.timeout = 10000;

        this.home = new HomePage();
        this.search = new SearchPage();
    }

    @Given("I am on the Home Page")
    public void i_am_on_the_Home_Page() {
        home.open();
    }

    @When("I search for the term {string}")
    public void i_search_for_the_term(String term) {
        home.searchFor(term);
    }

    @Then("There should be some results")
    public void there_should_be_some_results() {
        search.results().shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
