package com.cydeo.tests.day4_findelement_css_xpath;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checked_boxes {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");


        WebElement checkedbox1=driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkedbox2=driver.findElement(By.xpath("//input[@name='checkbox2']"));


        System.out.println(checkedbox1.isSelected());
        System.out.println("checkedbox2 is selected"+ checkedbox2.isSelected());
        System.out.println(checkedbox2.isDisplayed());

        Thread.sleep(2000);
        checkedbox2.click();

        Thread.sleep(2000);
        checkedbox1.click();

        System.out.println("check1.selected"+ checkedbox1.isSelected());
        System.out.println("checkedbox2.selected"+ checkedbox2.isSelected());



    }
}
