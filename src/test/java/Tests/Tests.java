package Tests;

import Code.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {

    Driver driver = null;

    @Before
    public void runApp() {
        driver = new Driver();
        driver.startApp();
    }

    @Test
    public void testOpenMenu() {
        driver.clickBtnNext();
        assertEquals("Hello second fragment", driver.getSecondTextText());
    }

    @After
    public void closeApp() {
        driver.closeApp();
    }
}
