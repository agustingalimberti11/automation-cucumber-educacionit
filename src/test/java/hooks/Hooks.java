package hooks;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private final DriverManager navegador;

    public Hooks(DriverManager navegador) {
        this.navegador = navegador;
    }

    @Before
    public void abrirNavegador(){
        navegador.abrir();
    }

    @After
    public void cerrarNavegador(){
        navegador.cerrar();
    }
}
