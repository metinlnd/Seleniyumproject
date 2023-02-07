package com.cydeo.tests.day10_upload_actions_executor;

import com.cydeo.utility.ConfigurationReader;
import com.cydeo.utility.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registriation_Form {

    @Test
    public void registiration_form_TEST(){
//Driver.getDriver-> driver.get()
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        WebElement firstName= Driver.getDriver().findElement(By.xpath("//input [@type='text']"));


//firstName.sendKeys("metin usame");

        //create java faker object

        Faker faker= new Faker();
        firstName.sendKeys(faker.name().firstName());



        WebElement lastName= Driver.getDriver().findElement(By.xpath("(//input [@type='text'])[2]"));

lastName.sendKeys(faker.name().lastName());




        WebElement userName= Driver.getDriver().findElement(By.xpath("(//input [@type='text'])[3]"));

userName.sendKeys(faker.bothify("helpdesk###"));

//6.E-MAIL
        WebElement emailName= Driver.getDriver().findElement(By.xpath("(//input [@type='text'])[4]"));


emailName.sendKeys(faker.letterify("???????@gmail.com"));

//7. password
        WebElement inputPassword= Driver.getDriver().findElement(By.xpath("//input [@type='password']"));

        inputPassword.sendKeys(faker.numerify("########"));

//8. enter the phone number

        WebElement inputphone= Driver.getDriver().findElement(By.xpath("//input [@name='phone']"));

        inputphone.sendKeys(faker.numerify("###-###-####"));

//9. Gender

        WebElement inputgender= Driver.getDriver().findElement(By.xpath("//input[@value='male']"));

        inputgender.click();

//10.enter date of birth

        WebElement inputdateofbirth= Driver.getDriver().findElement(By.xpath("//input [@name='birthday']"));

        inputdateofbirth.sendKeys("03/08/2000");

//11. select department office

        Select selectdropdown= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));

selectdropdown.selectByIndex(faker.number().numberBetween(0,9));


//12.job title



        Select selectdropdown2= new Select(Driver.getDriver().findElement(By.xpath("//select [@name='job_title']")));
        selectdropdown2.selectByIndex(3);


//13. choose

        WebElement chooseelement= Driver.getDriver().findElement(By.xpath("//input[@value='java']"));

chooseelement.click();


//14. sing up

WebElement singupBottom= Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
singupBottom.click();






    }

















}
