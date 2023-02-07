package com.cydeo.tests.day10_upload_actions_executor;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Hoovers {
    @Test
    public void hoovering_Test(){


        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        WebElement img1=Driver.getDriver().findElement(By.xpath("(//img [@src='/img/avatar-blank.jpg'])[1]"));
        WebElement img2=Driver.getDriver().findElement(By.xpath("(//img [@src='/img/avatar-blank.jpg'])[2]"));

        WebElement img3=Driver.getDriver().findElement(By.xpath("(//img [@src='/img/avatar-blank.jpg'])[3]"));

        //Locate all the username


        WebElement user1= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));


        WebElement user2= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));

        WebElement user3= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));
//img1

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(img1).perform();

        Assert.assertTrue(user1.isDisplayed());

//img2

        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());

//img3

        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());








    }





}
