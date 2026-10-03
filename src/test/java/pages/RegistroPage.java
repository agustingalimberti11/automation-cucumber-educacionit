package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistroPage extends BasePage{

    private String usuarioCreado;

    @FindBy(name = "firstName")
    private WebElement nombre;

    @FindBy(name = "lastName")
    private WebElement apellido;

    @FindBy(name = "phone")
    private WebElement telefono;

    @FindBy(name = "userName")
    private WebElement emailContacto;

    @FindBy(name = "address1")
    private WebElement direccion;

    @FindBy(name = "city")
    private WebElement ciudad;

    @FindBy(name = "state")
    private WebElement provincia;

    @FindBy(name = "postalCode")
    private WebElement codigoPostal;

    @FindBy(name = "country")
    private WebElement pais;

    @FindBy(name = "email")
    private WebElement usuario;

    @FindBy(name = "password")
    private WebElement clave;

    @FindBy(name = "confirmPassword")
    private WebElement confirmarClave;

    @FindBy(name = "submit")
    private WebElement enviar;

    @FindBy(xpath = "//b[contains(text(),'Dear')]")
    private WebElement txtValidacionRegistro;

    public RegistroPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void abrir() {
        driver.findElement(By.linkText("REGISTER")).click();
    }

    public void completarFormulario() {
        usuarioCreado = "alumno" + System.currentTimeMillis();
        nombre.sendKeys("Ana");
        apellido.sendKeys("Perez");
        telefono.sendKeys("1122334455");
        emailContacto.sendKeys("ana@correo.com");
        direccion.sendKeys("Av Siempre Viva 123");
        ciudad.sendKeys("Buenos Aires");
        provincia.sendKeys("CABA");
        codigoPostal.sendKeys("1000");
        new Select(pais).selectByVisibleText("ARGENTINA");
        usuario.sendKeys(usuarioCreado);
        clave.sendKeys("secreta123");
        confirmarClave.sendKeys("secreta123");
        sacarCartel();
        enviar.click();
    }

    public String getUsuarioCreado() {
        return usuarioCreado;
    }

    public void validarRegistroExitoso() {
        txtValidacionRegistro.click();
    }
}
