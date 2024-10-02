package core.pageObjects;

import core.utilities.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private final WebDriver driver;

    public SearchPage() {
        this.driver = DriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".mw-page-title-main")
    private WebElement searchResultsTitle;

    public boolean isSearchResultDisplayed(String searchQuery) {
        if (searchResultsTitle == null) {
            return false;
        }
        return searchResultsTitle.getText().contains(searchQuery);
    }
}
