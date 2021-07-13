package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.tribed.utilities.CommonUtils.*;
public class LoginPage extends DriverManager {


    @FindBy(name = "email")
    public   WebElement emmailField;

    @FindBy(name = "password")
    public   WebElement passwordField;

    @FindBy(xpath="//button[text()='Log in']")
    public   WebElement loginBtn;

    @FindBy(xpath="//div[text()='My profile']")
    public  WebElement validLogInText;

    @FindBy(xpath="//label[text()='Invalid credentials']")
    public  WebElement invalidLogInText;

    @FindBy(xpath="//div[text()='Log out']")
    public  WebElement logoutBtn;

    @FindBy(xpath = "(//div[text()='Sign in'])[2]")
    public WebElement signInBtn;


    public void enterEmailAndPassword(String userType) {
        clearAndSendKeys(emmailField,getUserName(userType));
        clearAndSendKeys(passwordField,getPassword(userType));
    }

    public void clickOnLogInBtn() {
        clickOnElement(loginBtn);
    }

    public String getUserName(String userType) {

        switch(userType) {
            case "Valid User":
                return VALID_USER;
            case "Invalid User":
                return INVALID_USER;
            default:
                throw new IllegalStateException("Unexpected user type: " + userType);
        }
    }

    public String getPassword(String userType) {

        switch(userType) {
            case "Valid User":
                return VALID_USER_PSW;
            case "Invalid User":
                return INVALID_USER_PSW;
            default:
                throw new IllegalStateException("Unexpected user type: " + userType);
        }
    }

    public String getLoggedText() {
        waitForElementVisibility(validLogInText, 5, "Logged in Text not Visible");
        return getElementText(validLogInText);
    }

    public String getLogInnErrorText() {
        return getElementText(invalidLogInText);
    }

    public boolean checkStateOfButton() {
        return loginBtn.isEnabled();
    }

    public void clickOnLogoutBtn() {
        clickOnElement(logoutBtn);
    }

    public boolean isSignInButtonDisplayed() throws InterruptedException {
        waitForElementVisibility(signInBtn,5, "SingIn button not displayed");
        return signInBtn.isDisplayed();
    }

}
