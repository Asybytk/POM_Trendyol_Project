package cw.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
  /*
      POM'de Driver icin TestBase class'ina extends etmek yerine
      Driver class'indan static method'lar kullanarak
      driver olusturup, ilgili ayarlarin yapilmasi
      ve en sonda driver'in kapatilmasi tercih edilmistir.
      POM'de Driver class'indaki getDriver()'nin obje olusturularak kullanilmasini
      engellemek icin
      Singleton pattern kullanimi benimsenmistir.
      Singleton Pattern : tekli kullanim, bir class'in farkli class'lardan
      obje olusturularak kullanimini engellemek icin kullanilir.
      Bunu saglamak icin yapmamiz gereken sey oldukca basit
      obje olusturmak icin kullanilan constructor'i private yaptiginizda
      bsaka class'larda Driver class'indan obje olusturulmasi mumkun OLAMAZ
       */

public class Driver {
    // create a private static WebDriver object
    private static WebDriver driver;

    private Driver() {                    //constructor Driver
    }
    // create getDriver method to create and initiate the driver instance
    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigurationReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }//getDriver ends here

    // create a closeDriver method to close the driver
    public static void closeDriver() {
        //   quit the driver id it is pointing chromedriver, firefoxdriver....
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}




