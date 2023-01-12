package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CRM_Utilities {
    /*this methot will login with helpdesk1@cybertekschool.com user whenits called*/
    public static void crm_login(WebDriver driver){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        inputPassword.sendKeys("UserUser");


        WebElement loginBottom = driver.findElement(By.xpath("//input [@type='submit']"));

        loginBottom.click();






    }

    public static void crm_login(WebDriver driver,String username, String password){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        inputPassword.sendKeys(password);


        WebElement loginBottom = driver.findElement(By.xpath("//input [@type='submit']"));

        loginBottom.click();


    }








}
