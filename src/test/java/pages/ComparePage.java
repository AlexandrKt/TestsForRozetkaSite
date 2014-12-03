package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui_tests.TestData;

/**
 * Created by kutyna-av on 26.11.14.
 */
public class ComparePage extends TestBase{

    protected By searchProductLink =

            By.xpath(".//*[@id='parameters-filter-form']/div/div/ul/li[2]/a");

    protected WebElement searchLinkElem;


    public String  verifyProductLink(){

        //Log4Test.info("Verify product link");

        searchLinkElem = driver.findElement(searchProductLink);

        return searchLinkElem.getText();

    }



    protected final By comparePageLink = By.xpath(".//*[@id='head_banner_container']/div[3]/div/table/thead/tr[1]/td[1]/h1");
    protected By searchAppleMacBookProRetina15Link = By.partialLinkText(TestData.APPLE_MACBOOK_PRO_RETINA_15);
    protected By searchAppleMacBookAir11Link = By.partialLinkText(TestData.APPLE_MACBOOK_AIR_11);
    protected WebElement searchAppleMacBookProRetina15Elem;
    protected WebElement searchAppleMacBookAir11Elem;
    protected WebElement comparePageElem;

    public String verifyComparePage(){
        comparePageElem = driver.findElement(comparePageLink);
        return comparePageElem.getText();

    }

    public String verifyComparePageWithLaptops() {
        //searchAppleMacBookProRetina15Elem = driver.findElement(searchAppleMacBookProRetina15Link);
        searchAppleMacBookAir11Elem = driver.findElement(searchAppleMacBookAir11Link);
        return searchAppleMacBookAir11Elem.getText();
    }


}
