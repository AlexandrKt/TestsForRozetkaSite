package ui_tests;

import core.TestBase;
import org.testng.annotations.Test;
import pages.AllLaptopsPage;
import pages.AppleLaptopPage;
import pages.ComparePage;
import pages.RozetkaWelcomePage;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

/**
 * Created by kutyna-av on 25.11.14.
 */
public class SearchCompareProductsTests extends TestBase {
    RozetkaWelcomePage page = new RozetkaWelcomePage();
    AllLaptopsPage allLaptopPage = new AllLaptopsPage();
    AppleLaptopPage appleLaptopPage = new AppleLaptopPage();
    ComparePage comparePage = new ComparePage();

    @Test
    public void setUpPreconditions(){

        page.open();

        assertTrue(page.isOpened());

    }
    @Test(dependsOnMethods = {"setUpPreconditions"})
    public void searchNotebooks (){
        page.linkToNotebooks();
        allLaptopPage.findAppleNotebooks();
        assertEquals(appleLaptopPage.verifyProductLink(), TestData.APPLE);
        appleLaptopPage.searchNotebooksAndAddToComparePage();
        assertEquals(appleLaptopPage.verifyAppleMacBookProRetina15Link(), TestData.APPLE_MACBOOK_PRO_RETINA_15);

        appleLaptopPage.addAppleMacBookProRetina15ToCompareClick();
        appleLaptopPage.moreGoodsLinkClick();

        appleLaptopPage.addAppleMacBookProRetina11ToCompareClick();

        appleLaptopPage.enterToComparePage();
        assertEquals(comparePage.verifyComparePage(), TestData.COMPARE_GOODS);
        assertEquals(comparePage.verifyComparePageWithLaptops(), TestData.APPLE_MACBOOK_AIR_11);

    }


}
