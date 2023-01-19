package com.cydeo.tests.day7_WindowHandling;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utility.BrowserUtils;
import com.cydeo.utility.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN_test extends TestBase {


    @Test
    public void crm_login_test() {

        driver.get("https://login1.nextbasecrm.com/");

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        inputPassword.sendKeys("UserUser");


        WebElement loginBottom = driver.findElement(By.xpath("//input [@type='submit']"));

        loginBottom.click();


        BrowserUtils.verifyTitle(driver, "My tasks");

    }

    @Test
    public void crm_login_test2() {

        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);

        BrowserUtils.verifyTitle(driver, "My tasks");

    }

    @Test
    public void crm_login_test3() {

        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver,"helpdesk2@cybertekschool.com","UserUser");

        BrowserUtils.verifyTitle(driver, "(1) Portal");

    }

}