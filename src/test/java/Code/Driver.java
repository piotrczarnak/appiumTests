package Code;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {
    WebDriver driver;
    public WebDriver
    createDriver(String browser) {

        if (browser.equals("chrome")){
            WebDriverManager.chromedriver().browserVersion("84.0.4147.30").setup();
            driver = new ChromeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public void get(String address) {
        driver.get(address);
    }

}
