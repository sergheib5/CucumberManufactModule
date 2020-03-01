package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static final String USERNAME = "oytunpiren";
    public static final String ACCESS_KEY = "1bb40d5f-871e-44fd-99ce-6009369303dc";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
    //https://wiki.saucelabs.com/display/DOCS/Getting+Started+with+Selenium+for+Automated+Website+Testing
    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver() throws MalformedURLException {
        if(driver ==  null){

            switch (Config.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "sauceLab":
                    DesiredCapabilities caps = DesiredCapabilities.chrome();

                    MutableCapabilities sauceOptions = new MutableCapabilities();
                    ChromeOptions browserOptions = new ChromeOptions();
                    browserOptions.setExperimentalOption("w3c", true);
                    browserOptions.setCapability("platformName", "macOS 10.15");
                    browserOptions.setCapability("browserVersion", "latest");
                    browserOptions.setCapability("sauce:options", sauceOptions);
                    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
                    break;

                case "safari":
                    if(System.getProperty("os.name").toLowerCase().contains("windows")){
                        throw new WebDriverException("Windows OS does not support safari");
                    }
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //driver.manage().window().maximize();

        }
        return driver;
    }

    public static void quitDriver(){
        if(driver !=null)
        driver.quit();
        driver = null;

    }
}
