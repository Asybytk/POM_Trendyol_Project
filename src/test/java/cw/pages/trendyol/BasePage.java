package cw.pages.trendyol;

import cw.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookie;


    //@FindBy(xpath = "//div[@data-testid='header-search-bar-wrapper']")
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement searchArea;


    @FindBy(xpath = "//span[@class='p-icon icon-close close-icon']")
    public WebElement spanClose;










    public void sendProduct(String key) {
        searchArea.sendKeys(key + Keys.ENTER);

    }


    //alerti kapatmak icin
    public void alertHandel() {
        Alert alertHnd = Driver.getDriver().switchTo().alert();
        alertHnd.dismiss();
    }

    public  void spanClose(){
        spanClose.click();
    }
}
