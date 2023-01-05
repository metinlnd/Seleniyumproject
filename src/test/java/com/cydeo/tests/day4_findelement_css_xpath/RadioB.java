package com.cydeo.tests.day4_findelement_css_xpath;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioB {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");


        List<WebElement> radioBottoms = driver.findElements(By.name("color"));


        System.out.println(radioBottoms.size());
        for (WebElement each : radioBottoms) {
            System.out.println(each.getAttribute("name"));
            System.out.println(each);
            System.out.println(each.isSelected());
            System.out.println(each.isDisplayed());

        }


    }
}
