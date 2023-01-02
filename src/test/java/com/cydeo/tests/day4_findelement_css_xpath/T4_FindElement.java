package com.cydeo.tests.day4_findelement_css_xpath;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElement {
    public static void main(String[] args) {

   WebDriver driver= WebDriverFactory.getDriver("chrome");


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> alllinks = driver.findElements(By.tagName("a"));
        System.out.println(alllinks.size());

        for (WebElement each : alllinks) {
            System.out.println("text of link:"+ each.getText());

            System.out.print("HREF VALUE:"+ each.getAttribute("href"));
        }




    }
}
