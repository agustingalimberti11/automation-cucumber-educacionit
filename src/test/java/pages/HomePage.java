package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static final String URL = "https://demo.guru99.com/test/newtours/";

    @FindBy(tagName = "body")
    private WebElement cuerpo;

    public void abrir() {
        driver.get(URL);
    }
}
