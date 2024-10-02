package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import core.pageObjects.HomePage;
import core.pageObjects.SearchPage;
import core.utilities.DriverManager;

public class SearchSteps {
    private final WebDriver driver = DriverManager.getInstance().getDriver();
    private final HomePage homePage = new HomePage();
    private final SearchPage searchPage = new SearchPage();

    @Given("user is on the {string} home page")
    public void user_is_on_the_given_home_page(String page) {
        Assertions.assertTrue(driver.getCurrentUrl().contains(page));
    }

    @When("user searches for {string}")
    public void user_searches_for(String searchQuery) {
        homePage.search(searchQuery);
    }

    @Then("the search {string} result is displayed")
    public void the_search_result_is_displayed(String result) {
        Assertions.assertTrue(searchPage.isSearchResultDisplayed(result));
    }
}
