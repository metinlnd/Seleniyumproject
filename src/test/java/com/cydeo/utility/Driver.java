package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {



/*creating a private constructor so we are closing access
to the 0bject of this class from outside.
 */

    private Driver(){}



/*we make webdriver private because we want to close
 access from outside the class.
 also static we will use it in a static method.
*/
    private static WebDriver driver;






    /* create a utility method which will return
    same driver instance when we call it*/
    public static WebDriver getDriver(){

       if(driver==null){

        String browserType=ConfigurationReader.getProperty("browser");

        switch (browserType){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

            case "fireforx":

                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;



        }

       }

        return driver;

    }



}
