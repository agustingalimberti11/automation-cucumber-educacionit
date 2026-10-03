package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name = "userName")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "submit")
    private WebElement submit;

    @FindBy(xpath = "//h3[contains(text(),'Login Successfully')]")
    private WebElement txtLoginExitoso;

    @FindBy(xpath = "//span[contains(text(),'Enter your userName and password correct')]")
    private WebElement txtLoginNoExitoso;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void ingresar(String usuario, String clave) {
        userName.clear();
        userName.sendKeys(usuario);
        password.clear();
        password.sendKeys(clave);
        submit.click();
    }

    public void validarIngreso() {
        txtLoginExitoso.click();
    }

    public void validarIngresoIncorrecto() {
        txtLoginNoExitoso.click();
    }



}
