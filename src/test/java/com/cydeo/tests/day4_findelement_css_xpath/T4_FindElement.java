package com.cydeo.tests.day4_findelement_css_xpath;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T4_FindElement {
    public static void main(String[] args) {

   WebDriver driver= WebDriverFactory.getDriver("chrome");


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");










    }
}
