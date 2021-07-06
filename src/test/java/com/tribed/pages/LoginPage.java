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

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/div/form/button")
    public   WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[4]")
    public  WebElement validlogInText;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/div/form/label")
    public  WebElement invalidlogInText;


    public void enterEmailAndPassword(String userType) {
        sendKeys(emmailField,getUserName(userType));
        sendKeys(passwordField,getPassword(userType));
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
        waitForElementVisibility(validlogInText, 5, "Logged in Text not Visible");
        return getElementText(validlogInText);
    }

    public String getLogInnErrorText() {
        return getElementText(invalidlogInText);
    }

    public boolean checkStateOfButton() {
        return loginBtn.isEnabled();
    }

}
