package steps;

import driver.DriverManager;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    private final DriverManager navegador;


    public LoginSteps(DriverManager navegador) {
        this.navegador = navegador;
    }


    @Cuando("ingresa el usuario {string} y la clave {string}")
    public void ingresa_el_usuario_y_la_clave(String usuario, String pass) {
        new LoginPage(navegador.getDriver()).ingresar(usuario,pass);
    }

    @Entonces("el login es exitoso")
    public void el_login_es_exitoso() {
        new LoginPage(navegador.getDriver()).validarIngreso();
    }
}
