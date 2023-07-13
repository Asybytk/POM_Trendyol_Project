package cw.pages.trendyol;

import cw.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{

    public CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
