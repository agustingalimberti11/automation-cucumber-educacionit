package steps;

import driver.DriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import pages.LoginPage;
import pages.RegistroPage;

public class RegistroSteps {
    private final DriverManager navegador;

    public RegistroSteps(DriverManager navegador) {
        this.navegador = navegador;
    }

    @Cuando("completa el formulario de registro")
    public void completa_el_formulario_de_registro() {
        new RegistroPage(navegador.getDriver()).abrir();
        new RegistroPage(navegador.getDriver()).completarFormulario();
    }
    @Entonces("el registro es exitoso")
    public void el_registro_es_exitoso() {
        new RegistroPage(navegador.getDriver()).validarRegistroExitoso();

    }
}
