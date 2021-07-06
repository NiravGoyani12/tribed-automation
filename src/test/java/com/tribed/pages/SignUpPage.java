package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.tribed.utilities.CommonUtils.*;
public class SignUpPage extends DriverManager {



    @FindBy(name = "password")
    private  WebElement txtPassword;

    @FindBy(name = "fullName")
    private  WebElement txtfullname;

    @FindBy(name = "companyEmail")
    private  WebElement txtCompanyEmail;

    @FindBy(name = "companyName")
    private  WebElement txtCompanyName;

    @FindBy(xpath="(//div[text()='Sign up'])[2]")
    private  WebElement signupbutton;

    @FindBy(xpath="//button[text()='Create account']")
    private  WebElement btnCreateAccount;

    @FindBy(xpath="//h2[text()='Congratulations for registering on tribed!']")
    private  WebElement msgCongratulations;

    @FindBy(xpath="//label[text()='Duplicate user: A user with that email address already exists, please log in instead']")
    private  WebElement msgEmailExist;

    @FindBy(xpath="//label[text()='Password too weak: Please make sure your password is at least 8 characters long.']")
    private  WebElement msgShortPassword;

    public void clickonSignupbutton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(signupbutton);
    }


    public void enterSignUpDetails() {
        sendKeys(txtfullname,getUserName());
        sendKeys(txtCompanyEmail,getUserName()+"@gmail.com");
        sendKeys(txtCompanyName,getUserName()+" & Co");
        sendKeys(txtPassword,getUserName());
        //sendKeys(passwordField,getPassword(userType));
    }

    public void enterSShortPassword() {
        sendKeys(txtPassword,"abc");
        //sendKeys(passwordField,getPassword(userType));
    }

    public void clickOnCreateAccountBtn() {
        clickOnElement(btnCreateAccount);
    }

    public boolean isCongratulationMessageDislayed() throws InterruptedException {
        Thread.sleep(3000);
        return msgCongratulations.isDisplayed();
    }

    public boolean isAlreadyExistEmailMessageDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        return msgEmailExist.isDisplayed();
    }

    public boolean isShortPasswordMessageDislayed() throws InterruptedException {
        Thread.sleep(3000);
        return msgShortPassword.isDisplayed();
    }

    public String getUserName() {

                return NEW_USERNAME;

        }


}
