package driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DriverManager {

    private WebDriver driver;

    public void abrir(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void cerrar(){
        if(driver != null){
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}
