package steps;

import driver.DriverManager;
import io.cucumber.java.es.Dado;
import pages.HomePage;

public class ComunSteps {

    private final DriverManager navegador;

    public ComunSteps(DriverManager navegador) {
        this.navegador = navegador;
    }


    @Dado("que el usuario está en la página de New Tours")
    public void que_el_usuario_está_en_la_página_de_new_tours() {
        new HomePage(navegador.getDriver()).abrir();
    }
}
