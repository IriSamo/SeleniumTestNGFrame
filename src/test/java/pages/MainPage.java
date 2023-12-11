package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement h1;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getH1(){

        return h1.getText();
    }
}