package cw.pages.trendyol;

import cw.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage()  {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@class='basket-icon']")
    public WebElement WarenKorb;


        public void addWarenKorb() {
        WarenKorb.click();

    }


}
