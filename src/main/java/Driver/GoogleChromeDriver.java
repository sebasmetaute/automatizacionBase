package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleChromeDriver {

    private static WebDriver driver;

    public static void ChromeDriver(String url){


        ChromeOptions options= new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-inforbars");
        setDriver(new ChromeDriver(options));
        getDriver().get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        GoogleChromeDriver.driver = driver;
    }

    public static void quitBroser(){
        driver.quit();

    }
}
