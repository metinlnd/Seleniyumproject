package com.cydeo.tests.day11_jexecuiter_pracgtice;

import com.cydeo.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Cicle_drag_and_drop{


@Test
    public void dragAndDrop() {

    Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

    WebElement acceptandclosebuttom=  Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));

acceptandclosebuttom.click();


WebElement smallcircle=  Driver.getDriver().findElement(By.id("draggable"));

WebElement bigCircle=  Driver.getDriver().findElement(By.id("droptarget"));

Actions action=new Actions(Driver.getDriver());
//action.dragAndDrop(smallcircle,bigCircle).perform();
action.clickAndHold(smallcircle).moveToElement(bigCircle).release().build().perform();
String actualbigcircletext=bigCircle.getText();
String expectedbigcircletext="You did great!";

    Assert.assertEquals(actualbigcircletext,expectedbigcircletext);






}






























}
