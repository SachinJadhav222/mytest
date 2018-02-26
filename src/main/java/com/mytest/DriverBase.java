package com.mytest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverBase {
    public static WebDriver driver;
    Logger logger=Logger.getLogger("DriverBase");
    public DriverBase(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Open Browser
     * @throws IOException
     */
    public void openBrowser()throws IOException{
        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/testConfiguration.properties");
        properties.load(fileInputStream);
        String url=properties.getProperty("url");
        String browser=properties.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("The Chrome browser properties taken");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            logger.info("The Firefox browser properties taken");
            driver = new FirefoxDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    /**
     * Close Browser
     */
    public void closeBrowser(){
        driver.quit();
        logger.info("Browser is Closed");

    }

    /**
     * Returning Webdriver
     * @return
     */
    public WebDriver getDriver(){
        logger.info("Returning Webdriver");
        return driver;
    }

}
