package com.cydeo.tests.day11_jexecuiter_pracgtice;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void task_4_and_5() {
        Driver.getDriver().get("http://practice.cydeo.com/");

        Actions actions= new Actions(Driver.getDriver());


        WebElement cydeolink= Driver.getDriver().findElement(By.linkText("CYDEO"));


        actions.moveToElement(cydeolink).perform();

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();



Driver.closeDriver();






    }



@Test
    public void task_6_and_7() {
    Driver.getDriver().get("http://practice.cydeo.com/");

    Actions actions = new Actions(Driver.getDriver());


}

}
