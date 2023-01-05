package com.cydeo.tests.day5_testNG_INTRO_DROPDOWND;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T1_s {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/add_remove_elements/");
























    }










}
