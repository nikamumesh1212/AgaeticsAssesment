package BaseClass;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	protected WebDriver driver;
    public void LaunchUrl() throws IOException {
    	
         WebDriverManager.firefoxdriver().setup(); 
     //   System.setProperty("webdriver.gecko.driver", "C:\\Users\\umesh\\eclipse-workspace\\Agaetics_Assesment\\Drivers\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        String username = "demo-user";
        String password = "Demo@321!";
        String urlWithCredentials = "https://" + username + ":" + password + "@" + "demo.maanch.com/";
        options.addPreference("network.http.phishy-userpass-length", 255); 

       driver = new FirefoxDriver(options);
       

        driver.get(urlWithCredentials);
        driver.manage().window().maximize();

        
    }
}
