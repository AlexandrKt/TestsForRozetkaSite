package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import ui_tests.TestData;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by kutyna-av on 25.11.14.
 */
public class AppleLaptopPage extends TestBase{
    protected By searchProductLink =

            By.xpath(".//*[@id='parameters-filter-form']/div/div/ul/li[2]/a");

    protected WebElement searchLinkElem;

    protected By searchAppleMacBookProRetina15Link = By.partialLinkText(TestData.APPLE_MACBOOK_PRO_RETINA_15);
    protected WebElement searchAppleMacBookProRetina15Elem;

    public String  verifyProductLink(){

        //Log4Test.info("Verify product link");

        searchLinkElem = driver.findElement(searchProductLink);

        return searchLinkElem.getText();

    }
    public String verifyAppleMacBookProRetina15Link(){
        searchAppleMacBookProRetina15Elem = driver.findElement(searchAppleMacBookProRetina15Link);
        return searchAppleMacBookProRetina15Elem.getText();
    }

    public void searchNotebooksAndAddToComparePage(){

        //Log4Test.info("Open product characteristics");
        WebElement sortBy = driver.findElement(By.name("drop_link"));
            sortBy.click();
                
        WebElement sortByPriseHightToLow = driver.findElement(By.xpath(".//*[@id='sort_view']/div/div/ul/li[2]/a"));
            sortByPriseHightToLow.click();
    }
    public void moreGoodsLinkClick() {
        WebElement moreGoodsClick = driver.findElement(By.name("more_goods"));
        moreGoodsClick.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }



    public void addAppleMacBookProRetina15ToCompareClick(){
        WebElement checkboxToCompareMBRetina15Click = driver.findElement(By.xpath("//div[@id='wishlist-popup-699984']/../div/label/input[@name='tocomparison']"));
        //checkboxToCompareMBRetina15Click.isSelected();
        //checkboxToCompareMBRetina15Click.click();
        if(!checkboxToCompareMBRetina15Click.isSelected()){
            checkboxToCompareMBRetina15Click.click();
            //assertEquals(checkboxToCompareMBRetina15Click.isSelected(), true);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    public void addAppleMacBookProRetina11ToCompareClick(){

        WebElement checkboxToCompareMA11Click = driver.findElement(By.xpath("//div[@id='wishlist-popup-288802']/../div/label/input"));

        //checkboxToCompareMA11Click.isSelected();
        //checkboxToCompareMA11Click.click();
        if(!checkboxToCompareMA11Click.isSelected()){
            checkboxToCompareMA11Click.click();
        }
        //assertEquals(checkboxToCompareMA11Click.isSelected(), true);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
   public void enterToComparePage(){
        WebElement enterToCompareLinkClick = driver.findElement(By.xpath("//a[@href ='http://rozetka.com.ua/computers-notebooks/notebooks/comparison/ids=699984%2C288802/']"));
        enterToCompareLinkClick.click();
    }
}
