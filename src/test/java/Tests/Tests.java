package Tests;

import Code.Driver;
import org.junit.Test;

public class Tests {

    @Test
    public void startMainSite() {
        Driver start = new Driver();
        start.createDriver("chrome");
        start.get("http://automationpractice.com/index.php");
    }
}
