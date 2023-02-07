package com.cydeo.Pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {

    public DynamicLoad1Page() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//button[.='Start']")
    public  WebElement startButton;


@FindBy(css="div#loading")
public WebElement loadingbar;



    @FindBy(css="#username")
    public WebElement inputusername;


    @FindBy(css="#pwd")
    public WebElement Inputpassword;

    @FindBy(xpath ="//button[.='Submit']")
    public WebElement SubmitButton;


    @FindBy(id="flash")
    public WebElement errorMessage;

}
