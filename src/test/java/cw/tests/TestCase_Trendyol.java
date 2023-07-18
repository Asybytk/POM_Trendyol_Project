package cw.tests;

import cw.pages.trendyol.TrendyolBasePage;
import cw.utilities.ConfigurationReader;
import cw.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_Trendyol {

    //POM framework kurun
    //Trendyola gidin
    //herhangi bir ürünü arayin
    //Arama sonuclarindaki  2.sayfadaki ilk urune tiklayin
    //sepete ekleyin
    //sepete eklediginiz urununun göründügünü test ediniz

        /*
Install POM framework
go trendyol
search for any product
click on the first product on page 2 of the search results
add to cart
Test the product you added to the cart
     */

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("trendyolUrl"));
        TrendyolBasePage tbp = new TrendyolBasePage();

        tbp.cookie.click();
        Thread.sleep(5000);

        tbp.sendProduct("Hose");
        Thread.sleep(5000);

        tbp.spanClose();
        Thread.sleep(5000);

        tbp.hose.click();
        Thread.sleep(5000);

        tbp.warenKorb.click();
        Thread.sleep(5000);

       tbp.warenKorbDisplay.click();

        tbp.warenKorbVoll.click();
        Assert.assertTrue(tbp.warenKorbVoll.isDisplayed());
    }

}


