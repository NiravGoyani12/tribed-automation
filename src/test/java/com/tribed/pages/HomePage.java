package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {


    @FindBy(xpath = "(//div[text()='Sign in'])[2]")
    public WebElement signInBtn;

    @FindBy(xpath="(//div[text()='Sign up'])[2]")
    public  WebElement signUpBtn;

    public void clickOnSignIn() {
        waitForElementVisibility(signInBtn,3,"sign in button is not visible");
        clickOnElement(signInBtn);
    }

    public void clickOnSignUp() {
        waitForElementVisibility(signUpBtn,3,"sign up button is not visible");
        clickOnElement(signUpBtn);
    }
}
