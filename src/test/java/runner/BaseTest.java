package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.MainPage;

import java.time.Duration;

public abstract class BaseTest {
    private WebDriver driver;

    private static final String BASE_URL = "https://www.selenium.dev/selenium/web/web-form.html";

    @BeforeMethod
    protected void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    protected void afterMethod() {
        driver.quit();
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public MainPage openBaseURL() {
        getDriver().get(BASE_URL);

        return new MainPage(getDriver());
    }
}
