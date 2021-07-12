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

    @FindBy(xpath="//div[text()='Log out']")
    public  WebElement logoutBtn;

    @FindBy(xpath = "(//div[text()='Sign in'])[2]")
    public WebElement signInBtn;



//    future use
@FindBy(xpath="//input[@name='slogan']")
public  WebElement sloganTxt;

    @FindBy(xpath="//input[@name='foundationYear']")
    public  WebElement foundationYearTxt;

    @FindBy(xpath="//input[@name='sector']")
    public  WebElement sectorTxt;

    @FindBy(xpath="//input[@name='numberOfEmployees']")
    public  WebElement noOfEmployeeTxt;

    @FindBy(xpath="//input[@name='aboutUsTitle']")
    public  WebElement aboutUsTxt;

    public void enterSignUpDetails(String name, String email, String companyName, String createPassword) {
        clearAndSendKeys(fullNameTxt, name);
        clearAndSendKeys(companyEmailTxt, getRandomString(2) + email);
        clearAndSendKeys(companyNameTxt, companyName + getRandomString(1));
        clearAndSendKeys(passwordTxt, createPassword);
    }

    public void enterExistingDetailsForSignUp(String name, String email, String companyName, String createPassword) {
        clearAndSendKeys(fullNameTxt, name);
        clearAndSendKeys(companyEmailTxt,  email);
        clearAndSendKeys(companyNameTxt, companyName);
        clearAndSendKeys(passwordTxt, createPassword);
    }

    public void enterShortPasswordDetailsForSignUp(String name, String email, String companyName, String createPassword) {
        clearAndSendKeys(fullNameTxt, name);
        clearAndSendKeys(companyEmailTxt, getRandomString(2) + email);
        clearAndSendKeys(companyNameTxt, companyName + getRandomString(1));
        clearAndSendKeys(passwordTxt, createPassword);
    }

    public void clickOnCreateAccountBtn() {
        clickOnElement(createAccountBtn);
    }

    public String getSignUpSuccessMsg() {
        return getElementText(signUpSuccessLabel);
    }

    public void clickOnBuildCompanyProfileButton() {
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

    public void clickOnLogoutBtn() {
        clickOnElement(logoutBtn);
    }

    public boolean isSignInButtonDisplayed() throws InterruptedException {
        waitForElementVisibility(signInBtn,5, "SingIn button not displayed");
        return signInBtn.isDisplayed();
    }

}
