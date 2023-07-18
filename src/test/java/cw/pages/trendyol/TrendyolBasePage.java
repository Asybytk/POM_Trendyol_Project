package cw.pages.trendyol;

import cw.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendyolBasePage {

    public TrendyolBasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookie;


    //@FindBy(xpath = "//div[@data-testid='header-search-bar-wrapper']")
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement searchArea;


    @FindBy(xpath = "//span[@class='p-icon icon-close close-icon']")
    public WebElement spanclose;

    @FindBy(xpath = "//img[@alt='HAKKE Hose - Schwarz - Wide Leg']")
    public WebElement hose;

    //button[@class='default']
    @FindBy(xpath = "//button[@class='default']")
    public WebElement warenKorb;

    @FindBy(xpath = "//div[@class='basket-preview-icon']")
    public WebElement warenKorbDisplay;

    @FindBy(xpath = "//span[@class='badge-count']")
   public WebElement warenKorbVoll;


    public void sendProduct(String key) {
        searchArea.sendKeys(key + Keys.ENTER);

    }


    public  void spanClose(){
        spanclose.click();
    }

//    //alerti kapatmak icin
//    public void alertHandel() {
//        Alert alertHnd = Driver.getDriver().switchTo().alert();
//        alertHnd.dismiss();
//    }
}