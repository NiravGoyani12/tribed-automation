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

    @FindBy(xpath="(//div[text()='Search'])[2]")
    public  WebElement searchMenu;

    @FindBy(name = "email")
    public   WebElement emmailField;

    @FindBy(xpath = "//h2[text()='Register your company']")
    public   WebElement registerMsg;

    @FindBy(xpath = "(//div[contains(text(),'m Hiring')])[2]")
    public   WebElement iAmHiringMenu;

    @FindBy(xpath="(//div[text()='Home'])[2]")
    public  WebElement homeMenu;

    @FindBy(xpath="(//div[text()='Home'])[1]")
    public  WebElement homeMenuAfterSearch;

    @FindBy(xpath="//h1[text()='Discover companies']")
    public  WebElement titleDiscoverCompanies;

    @FindBy(xpath="(//img[contains(@src,'/static/media/logo')])[1]")
    public  WebElement tribedIcon;

    @FindBy(xpath="(//button[text()='View Company Page'])[1]")
    public  WebElement viewCompanyPage;

    @FindBy(xpath="(//strong[text()='Founded:'])[1]")
    public  WebElement founded;

    @FindBy(xpath="(//strong[text()='Number of employees:'])[1]")
    public  WebElement numberOfEmployee;

    public void clickOnViewCompanyPage()
    {
        waitForElementVisibility(viewCompanyPage,3,"View Company page button is not visible");
        clickOnElement(viewCompanyPage);
    }

    public boolean isSectorDisplayed()
    {
        return founded.isDisplayed();
    }
    public boolean isNoOfEmployeeDisplayed()
    {
        return numberOfEmployee.isDisplayed();
    }

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

    public void clickOnIAmHiring() {
        waitForElementVisibility(iAmHiringMenu,3,"I am hiring is not visible");
        clickOnElement(iAmHiringMenu);
    }

    public void clickOnHome() {
        waitForElementVisibility(homeMenu,3,"Home is not visible");
        clickOnElement(homeMenu);
    }
    public void clickOnHomeAfterSearch() {
        waitForElementVisibility(homeMenuAfterSearch,3,"Home is not visible");
        clickOnElement(homeMenuAfterSearch);
    }
    public void clickOntribedIcon() {
        waitForElementVisibility(tribedIcon,3,"Icon is not visible");
        clickOnElement(tribedIcon);
    }

    public boolean isHomePageOpen()
    {
        return titleDiscoverCompanies.isDisplayed();
    }

    public boolean isIamHiringPageOpen(String title)
    {
        if(driver.getCurrentUrl().contains(title))
            return true;
        else
            return false;
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
