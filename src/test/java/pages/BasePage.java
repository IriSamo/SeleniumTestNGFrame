package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    private WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(getDriver(), this);
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public String getTitle(){

        return getDriver().getTitle();
    }
}
