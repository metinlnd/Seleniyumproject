package com.cydeo.tests.day13_interwieew_and_practice;

import com.cydeo.Pages.doubleclickpage;
import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task1 {


    @Test
    public void t1_doubleclicktest(){

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        WebElement acceptbottom= Driver.getDriver().findElement(By.xpath("//div[@id='accept-choices']"));


acceptbottom.click();

Driver.getDriver().switchTo().frame("iframeResult");


        doubleclickpage doubleclickpage1=new doubleclickpage();
    Actions action=new Actions(Driver.getDriver());

action.doubleClick(doubleclickpage1.doubleclicktext).perform();


















































}
