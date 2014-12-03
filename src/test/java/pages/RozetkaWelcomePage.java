package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by kutyna-av on 25.11.14.
 */
public class RozetkaWelcomePage extends TestBase {
    private String URL = "http://rozetka.com.ua/";

    public void open()
    {

        driver.get(URL);
        //Log4Test.info("Open WebUrl " + URL);

    }

    public boolean isOpened()
    {
        return driver.getCurrentUrl().equals(URL);
    }
    public void linkToNotebooks()
    {
        //Log4Test.info("Search product " + productName);
        WebElement notebookLink = driver.findElement(By.xpath(".//*[@id='head_banner_container']/div[4]/div[1]/div/div[3]/div[1]/div/ul/li[1]/a"));
            notebookLink.click();

    }


}
