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

    @FindBy(xpath="//button[text()='Build company profile']")
    private  WebElement btnBuildCompanyProfile;



    public void clickonSignupbutton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(signupbutton);
    }

    public static String CompanyName;
    public void enterSignUpDetails() {
        CompanyName="Company_"+getRandomString(5);
        sendKeys(txtfullname,CompanyName);
        sendKeys(txtCompanyEmail,CompanyName+"@gmail.com");
        sendKeys(txtCompanyName,CompanyName+" & Ltd");
        sendKeys(txtPassword,CompanyName);
        //sendKeys(passwordField,getPassword(userType));
    }

    public void enterSignUpDetailsWithExistingEmail() {
        //CompanyName="Company_"+getRandomString(5);
        sendKeys(txtfullname,CompanyName);
        sendKeys(txtCompanyEmail,CompanyName+"@gmail.com");
        sendKeys(txtCompanyName,CompanyName+" & Ltd");
        sendKeys(txtPassword,CompanyName);
        //sendKeys(passwordField,getPassword(userType));
    }

    public void enterSShortPassword() {
        sendKeys(txtPassword,getInvalidPassword());
        //sendKeys(passwordField,getPassword(userType));
    }

    public void clickOnCreateAccountBtn() {
        clickOnElement(btnCreateAccount);
    }

    public void clickOnBuildCompanyProfileButton() {
        clickOnElement(btnBuildCompanyProfile);
    }

    public boolean isCongratulationMessageDislayed() throws InterruptedException {
        waitForElementVisibility(msgCongratulations, 5, "Congratulations Message not appears");
        return msgCongratulations.isDisplayed();
    }

    public boolean isAlreadyExistEmailMessageDisplayed() throws InterruptedException {
        waitForElementVisibility(msgEmailExist, 5, "Validation message not displayed");
        return msgEmailExist.isDisplayed();
    }

    public boolean isShortPasswordMessageDislayed() throws InterruptedException {
        waitForElementVisibility(msgShortPassword, 5, "Short passowrd validation message not displayed");
        return msgShortPassword.isDisplayed();
    }

    public String getUserName() { return NEW_USERNAME; }
    public String getInvalidPassword() { return INVALID_PASSWORD; }


    @FindBy(xpath="//h3[text()='Company page']")
    private  WebElement tabCompanyProfile;

    public boolean isProfilePageOpen() throws InterruptedException {
        waitForElementVisibility(tabCompanyProfile, 5, "Short passowrd validation message not displayed");
        return tabCompanyProfile.isDisplayed();
    }


    @FindBy(xpath="//input[@name='slogan']")
    private  WebElement txtSlogan;

    @FindBy(xpath="//input[@name='foundationYear']")
    private  WebElement txtFoundationYear;

    @FindBy(xpath="//input[@name='sector']")
    private  WebElement txtSector;

    @FindBy(xpath="//input[@name='numberOfEmployees']")
    private  WebElement txtNoOfEmployee;

    @FindBy(xpath="//input[@name='aboutUsTitle']")
    private  WebElement txtAboutUs;

    public static String Slogan;
    public static String FoundationYear;
    public static String Sector;
    public static int NoOfEmp;
    public static String AboutUs;
    public void EnterCompanyDetails() {
        Slogan=getRandomString(25);
        Sector=getRandomString(5);
        NoOfEmp=getRandomInt(50);
        AboutUs=getRandomString(25);
        sendKeys(txtFoundationYear,getFoundationYear());
        sendKeys(txtSlogan,Slogan);
        sendKeys(txtSector,Sector);
        sendKeys(txtNoOfEmployee,String.valueOf(NoOfEmp));
        sendKeys(txtAboutUs,AboutUs);
    }

    public String getFoundationYear() { return YEAR; }

}
