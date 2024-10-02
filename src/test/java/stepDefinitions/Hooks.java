package stepDefinitions;

import core.utilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setup() {
        WebDriver driver = DriverManager.getInstance().getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
    }

    @After
    public void teardown() {
        DriverManager.getInstance().quitDriver();
    }
}