package Code;


import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    AndroidDriver driver;

    public void startApp() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("appPackage", "dev.test.myapplication_sda"); //pamiętajcie zmienić tą wartość na nazwę Waszej aplikacji testowej
        cap.setCapability("appActivity", ".MainActivity");
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void clickBtnNext() {
        driver.findElement(By.id("button_first")).click();
    }

    public String getSecondTextText() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       return driver.findElement(By.id("textview_second")).getText();
    }


    public void closeApp() {
        driver.quit();
    }
}
