package com.cydeo.tests.day5_testNG_INTRO_DROPDOWND;

import com.cydeo.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_s {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElementbuttom= driver.findElement(By.xpath("//button [@onclick='addElement()']"));

 //System.out.println(addElementbuttom.isDisplayed());;

       // System.out.println(addElementbuttom.isSelected());
//
       // System.out.println(addElementbuttom.getText());
        addElementbuttom.click();

WebElement deletebuttom= driver.findElement(By.xpath("//button[@class='added-manually']"));

deletebuttom.click();

try { System.out.println(deletebuttom.isDisplayed());

}catch (StaleElementReferenceException e){
    System.out.println("STALEELEMENT REFERNCE");
};


driver.close();















    }










}
