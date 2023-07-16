package cw.pages.trendyol;

import cw.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class SearchPage extends BasePage{

    public SearchPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }



//@FindBy(xpath = "//img[@alt='Tom Tailor Hose - Schwarz - Relaxed']")
//    public WebElement product;


    @FindBy(xpath = "//span[@class='selected_filters_count']")
    public WebElement marke;


    @FindBy(xpath = "//button[.='IN DEN WARENKORB']")
    public  WebElement warenKorb;

@FindBy(xpath = "//div[@class='promotions']")
    List<WebElement> productKostenlosVerstand;


//public void productAdd(){
//    product.click();
//}






public void markeIsDisplay(){
    marke.isDisplayed();

}


public void warenKorbAdd(){

}

public void  kostenlosVerstandButton(int index){
    productKostenlosVerstand.get(index).click();

}



}
