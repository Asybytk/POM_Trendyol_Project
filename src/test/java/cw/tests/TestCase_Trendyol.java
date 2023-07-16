package cw.tests;

import cw.pages.trendyol.BasePage;
import cw.pages.trendyol.SearchPage;
import cw.utilities.ConfigurationReader;
import cw.utilities.Driver;
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
    public void trendyolTest() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("trenyolUrl"));

        BasePage basePg= new BasePage();
        basePg.cookie.click();

       Thread.sleep(5000);

        basePg.sendProduct("Tom Tailor");

        Thread.sleep(5000);

       // basePg.alertHandel();

       basePg.spanClose();

        Thread.sleep(5000);



        SearchPage sp = new SearchPage();
        sp.kostenlosVerstandButton(4);

        Thread.sleep(5000);

        SearchPage wk= new SearchPage();
        wk.warenKorbAdd();

        Thread.sleep(5000);

       // sp.markeIsDisplay();

        Thread.sleep(5000);

    }
}

