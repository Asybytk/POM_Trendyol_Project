package cw.tests;

import cw.pages.trendyol.BasePage;
import cw.pages.trendyol.HomePage;
import cw.pages.trendyol.ProductPage;
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

    @Test
    public void trendyolTest() {

        Driver.getDriver().get(ConfigurationReader.getProperty("trenyolUrl"));


        BasePage bp = new BasePage();
        bp.cookie.click();



        BasePage searchPrdkt = new BasePage();
        searchPrdkt.sendProduct("Kleidung");

        searchPrdkt.alertHandel();

        ProductPage product = new ProductPage();
        product.WarenKorb.click();

        // homePg.spanClose.click();


    }
}

