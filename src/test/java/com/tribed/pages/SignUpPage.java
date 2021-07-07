package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.tribed.utilities.CommonUtils.*;

public class SignUpPage extends DriverManager {

    @FindBy(name = "password")
    public  WebElement passwordTxt;

    @FindBy(name = "fullName")
    public  WebElement fullNameTxt;

    @FindBy(name = "companyEmail")
    public  WebElement companyEmailTxt;

    @FindBy(name = "companyName")
    public  WebElement companyNameTxt;

    @FindBy(xpath="//button[text()='Create account']")
    public  WebElement createAccountBtn;

    @FindBy(xpath="//h2[text()='Congratulations for registering on tribed!']")
    public  WebElement signUpSuccessLabel;

    @FindBy(xpath="//label[text()='Duplicate user: A user with that email address already exists, please log in instead']")
    public  WebElement emailExistMsg;

    @FindBy(xpath="//label[text()='Password too weak: Please make sure your password is at least 8 characters long.']")
    public  WebElement shortPasswordMsg;

    @FindBy(xpath="//button[text()='Build company profile']")
    public  WebElement buildCompanyProfileBtn;

    @FindBy(xpath="//h3[text()='Company page']")
    public  WebElement companyPageTab;


    public void enterSignUpDetails(String name, String email, String companyName, String createPassword) {
        sendKeys(fullNameTxt, name);
        sendKeys(companyEmailTxt, getRandomString(2) + email);
        sendKeys(companyNameTxt, companyName + getRandomString(1));
        sendKeys(passwordTxt, createPassword);
    }

    public void enterExistingDetailsForSignUp(String name, String email, String companyName, String createPassword) {
        sendKeys(fullNameTxt, name);
        sendKeys(companyEmailTxt,  email);
        sendKeys(companyNameTxt, companyName);
        sendKeys(passwordTxt, createPassword);
    }

    public void enterShortPasswordDetailsForSignUp(String name, String email, String companyName, String createPassword) {
        sendKeys(fullNameTxt, name);
        sendKeys(companyEmailTxt, getRandomString(2) + email);
        sendKeys(companyNameTxt, companyName + getRandomString(1));
        sendKeys(passwordTxt, createPassword);
    }

    public void clickOnCreateAccountBtn() {
        clickOnElement(createAccountBtn);
    }

    public String getSignUpSuccessMsg() {
        return getElementText(signUpSuccessLabel);
    }

    public void clickOnBuildCompanyProfileButton() {
        waitForElementVisibility(buildCompanyProfileBtn, 5, "Build Company profile button not displayed");
        clickOnElement(buildCompanyProfileBtn);
    }

    public boolean isCompanyPageTabDisplayed() throws InterruptedException {
        waitForElementVisibility(companyPageTab, 5, "company page tab is not displayed");
        return companyPageTab.isDisplayed();
    }

    public String getExistingEmailErrorMsg() {
        return getElementText(emailExistMsg);
    }

    public String getShortPasswordMessage() {
        return getElementText(shortPasswordMsg);
    }
}
