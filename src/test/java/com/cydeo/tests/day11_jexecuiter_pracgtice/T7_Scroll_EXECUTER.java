package com.cydeo.tests.day11_jexecuiter_pracgtice;

import com.cydeo.utility.BrowserUtils;
import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_EXECUTER {

    @Test
    public void scrolldown_JSececuter(){

        Driver.getDriver().get("http://practice.cydeo.com/large");

        WebElement cydeolink=Driver.getDriver().findElement(By.linkText("CYDEO"));

        WebElement homelink=Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",cydeolink);

        BrowserUtils.sleep(3);
js.executeScript("arguments[0].scrollIntoView(true);",homelink);




















    }























}
