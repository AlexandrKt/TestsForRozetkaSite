package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by kutyna-av on 25.11.14.
 */
public class AllLaptopsPage extends TestBase {


    public void findAppleNotebooks() {

        List<WebElement> listOfManufactures = driver.findElements(By.xpath(".//*[@id='head_banner_container']/div[4]/div/div/div[2]/div[3]/ul/li[2]/ul"));
        for (WebElement element : listOfManufactures) {
            System.out.println(element.getText());
            Assert.assertEquals(element.getText().contains("Acer"), true);
            Assert.assertEquals(element.getText().contains("Apple"), true);
            Assert.assertEquals(element.getText().contains("Asus"), true);
            Assert.assertEquals(element.getText().contains("Dell"), true);
            Assert.assertEquals(element.getText().contains("Fujitsu"), true);
            Assert.assertEquals(element.getText().contains("HP"), true);
            Assert.assertEquals(element.getText().contains("Lenovo"), true);
            Assert.assertEquals(element.getText().contains("MSI"), true);
            Assert.assertEquals(element.getText().contains("Sony"), true);
            //System.out.println(" ");

            if (element.getText().contains("Apple")) {
                driver.findElement(By.partialLinkText("Apple")).click();

                //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            }
        }
    }
}