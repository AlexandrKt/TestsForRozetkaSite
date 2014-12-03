package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by kutyna-av on 25.11.14.
 */
public class TestBase {
    protected static WebDriver driver;

    protected static WebDriverWait wait;

    @BeforeSuite
    public static void setUp() throws IOException

    {

        driver = new FirefoxDriver();

        wait = new WebDriverWait(driver, 50);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void tearDown()

    {
        driver.quit();
    }
}
