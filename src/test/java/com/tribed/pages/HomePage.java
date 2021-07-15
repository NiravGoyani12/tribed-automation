package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {


    @FindBy(xpath = "(//div[text()='Sign in'])[2]")
    public WebElement signInBtn;

    @FindBy(xpath="(//div[text()='Sign up'])[2]")
    public  WebElement signUpBtn;

    @FindBy(xpath="//h1[text()='Search Candidates Placeholder']")
    public  WebElement searchPlaceholder;

    @FindBy(xpath="//div[text()='Search']")
    public  WebElement searchMenu;

    @FindBy(name = "email")
    public   WebElement emmailField;

    @FindBy(xpath = "//h2[text()='Register your company']")
    public   WebElement registerMsg;


    public void clickOnSignIn() {
        waitForElementVisibility(signInBtn,3,"sign in button is not visible");
        clickOnElement(signInBtn);
    }

    public void clickOnSignUp() {
        waitForElementVisibility(signUpBtn,3,"sign up button is not visible");
        clickOnElement(signUpBtn);
    }

    public void clickOnSearch() {
        waitForElementVisibility(searchMenu,3,"Search is not visible");
        clickOnElement(searchMenu);
    }

    public boolean isSearchPageOpen()
    {
        return searchPlaceholder.isDisplayed();
    }

    public boolean isSignPageOpen()
    {
        return emmailField.isDisplayed();
    }

    public boolean isSignUpPageOpen()
    {
        return registerMsg.isDisplayed();
    }


}
