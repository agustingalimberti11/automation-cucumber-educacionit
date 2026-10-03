package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String titulo() {
        return driver.getTitle();
    }

    public String textoDeLaPagina() {
        return driver.findElement(By.tagName("body")).getText();
    }

    protected void seleccionarPorTexto(WebElement combo, String textoVisible) {
        new Select(combo).selectByVisibleText(textoVisible);
    }

    protected void seleccionarPorValor(WebElement combo, String valor) {
        new Select(combo).selectByValue(valor);
    }
}
