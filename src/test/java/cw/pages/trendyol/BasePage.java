package cw.pages.trendyol;

import cw.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookie;


    @FindBy(xpath = "//*[@data-testid='search-bar-icon']")
    public WebElement searchArea;

@FindBy(xpath = "//img[@class='basket-icon']")
   public WebElement WarenKorb;

@FindBy(xpath = "//span[@class='p-icon icon-close close-icon']")
public WebElement spanClose;

public void sendProduct(String key){
    searchArea.sendKeys(key+ Keys.ENTER);
}

public void addWarenKorb(){
    WarenKorb.click();
}

        //alerti kapatmak icin
    public void alertHandel(){
        Driver.getDriver().switchTo().alert().dismiss();
    }

}
