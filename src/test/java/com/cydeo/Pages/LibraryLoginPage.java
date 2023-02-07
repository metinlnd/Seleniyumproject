package com.cydeo.Pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

@FindBy(xpath = "//input[@id='inputEmail']")
public WebElement inputUsername;

@FindBy(id ="inputPassword")
public WebElement inputPassword;

@FindBy(xpath = "//button[.='Sign in']")

public WebElement signInButton;


@FindBy(xpath = "//div[.='This field is required.']/div")
public WebElement fieldrRequirederrorMessage;


    @FindBy(xpath = "//div[.='Please enter a valid email adress.']/div")
public WebElement fieldrvalidEmailErrorMessage;


@FindBy(xpath = "//div[.='Sorry,Wrong Email or Password']")
public WebElement wrongEmailOrPasswordErrorMessage;







}
